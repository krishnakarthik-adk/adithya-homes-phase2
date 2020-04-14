package com.adithyahomesp2.expensetracker.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, String> {

	@Override
	public String convertToDatabaseColumn(LocalDateTime localDateTime) {
		return (localDateTime == null ? null : localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}

	@Override
	public LocalDateTime convertToEntityAttribute(String localDateTime) {
		return (localDateTime == null ? null : LocalDateTime.parse(localDateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
	}

}
