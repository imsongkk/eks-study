package com.lgcns.mockWasServer.enums.converter;

import com.lgcns.mockWasServer.enums.Status;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, String> {
    @Override
    public String convertToDatabaseColumn(Status status) {
        return status.getCode();
    }

    @Override
    public Status convertToEntityAttribute(String s) {
        return Status.getEnum(s);
    }
}
