package com.lgcns.mockWasServer.dto.common;

import java.util.List;

import lombok.Builder;

@Builder
public record ReportPagingResponseDto<T>(Integer page, Integer size, List<T> reports) {
}
