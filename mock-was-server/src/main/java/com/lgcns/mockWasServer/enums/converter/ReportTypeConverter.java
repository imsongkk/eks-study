package com.lgcns.mockWasServer.enums.converter;

import com.lgcns.mockWasServer.enums.ReportType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ReportTypeConverter implements AttributeConverter<ReportType, String> {
    @Override
    public String convertToDatabaseColumn(ReportType reportType) {
        return reportType.getCode();
    }

    @Override
    public ReportType convertToEntityAttribute(String s) {
        return ReportType.getEnum(s);
    }
}
