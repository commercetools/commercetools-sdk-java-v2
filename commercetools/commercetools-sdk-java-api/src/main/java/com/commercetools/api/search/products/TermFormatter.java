
package com.commercetools.api.search.products;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import javax.money.CurrencyUnit;

import com.commercetools.api.models.Identifiable;

public class TermFormatter {
    private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    public static ConstantExpression format(Boolean value) {
        return ConstantExpression.of(String.format("%b", value));
    }

    public static ConstantExpression format(LocalDate value) {
        return ConstantExpression.of(String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_DATE)));
    }

    public static ConstantExpression format(ZonedDateTime value) {
        return ConstantExpression
                .of(String.format("\"%s\"", FORMATTER.format(value.withZoneSameInstant(ZoneOffset.UTC))));
    }

    public static ConstantExpression format(Double value) {
        return ConstantExpression.of(value.toString());
    }

    public static ConstantExpression format(Long value) {
        return ConstantExpression.of(String.format("%d", value));
    }

    public static ConstantExpression format(String value) {
        return ConstantExpression.of(String.format("\"%s\"", escape(value)));
    }

    public static ConstantExpression format(LocalTime value) {
        return ConstantExpression.of(String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_TIME)));
    }

    public static <T> FilterExpression format(Identifiable<T> value) {
        return ConstantExpression.of(String.format("\"%s\"", escape(value.getId())));
    }

    public static FilterExpression format(CurrencyUnit currencyUnit) {
        return ConstantExpression.of(String.format("\"%s\"", escape(currencyUnit.getCurrencyCode())));
    }

    /**
     * Internal: Escapes Strings like that (Scala notation) """query by name " test name"""
     * @param s the unescaped String
     * @return the escaped string
     */
    static String escape(final String s) {
        return s.replace("\"", "\\\"");
    }
}
