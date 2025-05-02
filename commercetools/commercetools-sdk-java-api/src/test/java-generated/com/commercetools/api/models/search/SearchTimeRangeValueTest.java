
package com.commercetools.api.models.search;

import java.time.LocalTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchTimeRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchTimeRangeValueBuilder builder) {
        SearchTimeRangeValue searchTimeRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchTimeRangeValue).isInstanceOf(SearchTimeRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "gte", SearchTimeRangeValue.builder().gte(LocalTime.parse("12:00")) },
                new Object[] { "gt", SearchTimeRangeValue.builder().gt(LocalTime.parse("12:00")) },
                new Object[] { "lte", SearchTimeRangeValue.builder().lte(LocalTime.parse("12:00")) },
                new Object[] { "lt", SearchTimeRangeValue.builder().lt(LocalTime.parse("12:00")) } };
    }

    @Test
    public void gte() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setGte(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getGte()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void gt() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setGt(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getGt()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void lte() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setLte(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getLte()).isEqualTo(LocalTime.parse("12:00"));
    }

    @Test
    public void lt() {
        SearchTimeRangeValue value = SearchTimeRangeValue.of();
        value.setLt(LocalTime.parse("12:00"));
        Assertions.assertThat(value.getLt()).isEqualTo(LocalTime.parse("12:00"));
    }
}
