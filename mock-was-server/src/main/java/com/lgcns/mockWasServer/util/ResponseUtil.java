package com.lgcns.mockWasServer.util;

import com.lgcns.mockWasServer.dto.common.ResponseDto;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@UtilityClass
public class ResponseUtil {

    // SUCCESS
    public static <T> ResponseEntity<ResponseDto<T>> createSuccessResponse() {
        ResponseDto<T> dto = ResponseDto.<T>builder()
                .data(null)
                .build();
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    public static <T> ResponseEntity<ResponseDto<T>> createSuccessResponse(HttpHeaders httpHeaders) {
        ResponseDto<T> dto = ResponseDto.<T>builder()
                .data(null)
                .build();
        return new ResponseEntity<>(dto, httpHeaders, HttpStatus.OK);
    }

    public static <T> ResponseEntity<T> createSuccessResponse(T data) {
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    public static <T> ResponseEntity<T> createSuccessResponse(T data, HttpHeaders httpHeaders) {
        return new ResponseEntity<>(data, httpHeaders, HttpStatus.OK);
    }
}
