
package com.commercetools.api.predicates.query;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class PredicateFormatter {
    private static final DateTimeFormatter FORMATTER = new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    public static ConstantQueryPredicate format(Boolean value) {
        return ConstantQueryPredicate.of().constant(String.format("%b", value));
    }

    public static ConstantQueryPredicate format(LocalDate value) {
        return ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_DATE)));
    }

    public static ConstantQueryPredicate format(ZonedDateTime value) {
        return ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", FORMATTER.format(value.withZoneSameInstant(ZoneOffset.UTC))));
    }

    public static ConstantQueryPredicate format(Double value) {
        return new ConstantQueryPredicate(value.toString());
    }

    public static ConstantQueryPredicate format(Long value) {
        return ConstantQueryPredicate.of().constant(String.format("%d", value));
    }

    public static ConstantQueryPredicate format(String value) {
        return ConstantQueryPredicate.of().constant(String.format("\"%s\"", value));
    }

    public static ConstantQueryPredicate format(LocalTime value) {
        return ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_TIME)));
    }
}
