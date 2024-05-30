package com.lgcns.mockWasServer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum ReportType implements BaseCodeEnum{

    NEWS("NEWS", "AWS NEWS 공지사항"),
    BLOD("BLOG", "AWS BLOG 포스트");

    private String code;
    private String description;

    private static Map<String, ReportType> CODE_MAP = Stream.of(values()).collect(Collectors.toMap(ReportType::getCode, e->e));

    public static ReportType getEnum(String code) {
        return CODE_MAP.get(code);
    }
}
