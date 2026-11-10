
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchLongRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchLongRangeValueBuilder builder) {
        SearchLongRangeValue searchLongRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchLongRangeValue).isInstanceOf(SearchLongRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "gte", SearchLongRangeValue.builder().gte(8L) },
                new Object[] { "gt", SearchLongRangeValue.builder().gt(6L) },
                new Object[] { "lte", SearchLongRangeValue.builder().lte(1L) },
                new Object[] { "lt", SearchLongRangeValue.builder().lt(2L) } };
    }

    @Test
    public void gte() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setGte(8L);
        Assertions.assertThat(value.getGte()).isEqualTo(8L);
    }

    @Test
    public void gt() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setGt(6L);
        Assertions.assertThat(value.getGt()).isEqualTo(6L);
    }

    @Test
    public void lte() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setLte(1L);
        Assertions.assertThat(value.getLte()).isEqualTo(1L);
    }

    @Test
    public void lt() {
        SearchLongRangeValue value = SearchLongRangeValue.of();
        value.setLt(2L);
        Assertions.assertThat(value.getLt()).isEqualTo(2L);
    }
}
