package com.lgcns.mockWasServer.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Getter
public enum Status implements BaseCodeEnum{

    READY("READY", "원천 소스 크롤링 직후(레코드 생성 직후) 상태"),
    ACTIVE("ACTIVE", "게시 상태"),
    INACTIVE("INACTIVE", "미게시 상태");

    private String code;
    private String description;

    private static Map<String, Status> CODE_MAP = Stream.of(values()).collect(Collectors.toMap(Status::getCode, e->e));

    public static Status getEnum(String code) {
        return CODE_MAP.get(code);
    }
}
