
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
        return ConstantQueryPredicate.of().constant(String.format("\"%s\"", escape(value)));
    }

    public static ConstantQueryPredicate format(LocalTime value) {
        return ConstantQueryPredicate.of()
                .constant(String.format("\"%s\"", value.format(DateTimeFormatter.ISO_LOCAL_TIME)));
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
