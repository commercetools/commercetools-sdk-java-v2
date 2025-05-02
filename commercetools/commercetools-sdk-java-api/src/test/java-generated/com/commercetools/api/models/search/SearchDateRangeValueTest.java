
package com.commercetools.api.models.search;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchDateRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchDateRangeValueBuilder builder) {
        SearchDateRangeValue searchDateRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchDateRangeValue).isInstanceOf(SearchDateRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "gte", SearchDateRangeValue.builder().gte(LocalDate.parse("2023-06-01")) },
                new Object[] { "gt", SearchDateRangeValue.builder().gt(LocalDate.parse("2023-06-01")) },
                new Object[] { "lte", SearchDateRangeValue.builder().lte(LocalDate.parse("2023-06-01")) },
                new Object[] { "lt", SearchDateRangeValue.builder().lt(LocalDate.parse("2023-06-01")) } };
    }

    @Test
    public void gte() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setGte(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getGte()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void gt() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setGt(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getGt()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void lte() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setLte(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getLte()).isEqualTo(LocalDate.parse("2023-06-01"));
    }

    @Test
    public void lt() {
        SearchDateRangeValue value = SearchDateRangeValue.of();
        value.setLt(LocalDate.parse("2023-06-01"));
        Assertions.assertThat(value.getLt()).isEqualTo(LocalDate.parse("2023-06-01"));
    }
}
