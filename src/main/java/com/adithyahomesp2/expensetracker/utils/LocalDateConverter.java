package com.adithyahomesp2.expensetracker.utils;

import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, String> {

	@Override
	public String convertToDatabaseColumn(LocalDate localDate) {
		return (localDate == null ? null : localDate.toString());
	}

	@Override
	public LocalDate convertToEntityAttribute(String StringDate) {
		return (StringDate == null ? null : LocalDate.parse(StringDate));
	}

}
