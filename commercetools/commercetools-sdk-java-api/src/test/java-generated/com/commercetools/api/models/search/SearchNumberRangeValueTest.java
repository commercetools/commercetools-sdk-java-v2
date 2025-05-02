
package com.commercetools.api.models.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SearchNumberRangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SearchNumberRangeValueBuilder builder) {
        SearchNumberRangeValue searchNumberRangeValue = builder.buildUnchecked();
        Assertions.assertThat(searchNumberRangeValue).isInstanceOf(SearchNumberRangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "gte", SearchNumberRangeValue.builder().gte(0.8498576) },
                new Object[] { "gt", SearchNumberRangeValue.builder().gt(0.15980393) },
                new Object[] { "lte", SearchNumberRangeValue.builder().lte(0.26076245) },
                new Object[] { "lt", SearchNumberRangeValue.builder().lt(0.5197181) } };
    }

    @Test
    public void gte() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setGte(0.8498576);
        Assertions.assertThat(value.getGte()).isEqualTo(0.8498576);
    }

    @Test
    public void gt() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setGt(0.15980393);
        Assertions.assertThat(value.getGt()).isEqualTo(0.15980393);
    }

    @Test
    public void lte() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setLte(0.26076245);
        Assertions.assertThat(value.getLte()).isEqualTo(0.26076245);
    }

    @Test
    public void lt() {
        SearchNumberRangeValue value = SearchNumberRangeValue.of();
        value.setLt(0.5197181);
        Assertions.assertThat(value.getLt()).isEqualTo(0.5197181);
    }
}
