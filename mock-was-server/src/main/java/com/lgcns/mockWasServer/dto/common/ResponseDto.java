package com.lgcns.mockWasServer.dto.common;

import lombok.Builder;

@Builder
public record ResponseDto<T>(T data) {
}
