
package com.commercetools.api.models.search;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchDateTimeRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchDateTimeRangeValueBuilder builder) {
        SearchDateTimeRangeValue searchDateTimeRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchDateTimeRangeValue).isInstanceOf(SearchDateTimeRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "gte",
                        SearchDateTimeRangeValue.builder().gte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "gt", SearchDateTimeRangeValue.builder().gt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lte",
                        SearchDateTimeRangeValue.builder().lte(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lt",
                        SearchDateTimeRangeValue.builder().lt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void gte() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setGte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void gt() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setGt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getGt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lte() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setLte(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLte()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lt() {
        SearchDateTimeRangeValue value = SearchDateTimeRangeValue.of();
        value.setLt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
