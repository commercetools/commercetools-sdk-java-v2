
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CountOnLineItemUnitsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CountOnLineItemUnitsBuilder builder) {
        CountOnLineItemUnits countOnLineItemUnits = builder.buildUnchecked();
        Assertions.assertThat(countOnLineItemUnits).isInstanceOf(CountOnLineItemUnits.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "predicate", CountOnLineItemUnits.builder().predicate("predicate") },
                new Object[] { "minCount", CountOnLineItemUnits.builder().minCount(1) },
                new Object[] { "maxCount", CountOnLineItemUnits.builder().maxCount(8) },
                new Object[] { "excludeCount", CountOnLineItemUnits.builder().excludeCount(4) } };
    }

    @Test
    public void predicate() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void minCount() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setMinCount(1);
        Assertions.assertThat(value.getMinCount()).isEqualTo(1);
    }

    @Test
    public void maxCount() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setMaxCount(8);
        Assertions.assertThat(value.getMaxCount()).isEqualTo(8);
    }

    @Test
    public void excludeCount() {
        CountOnLineItemUnits value = CountOnLineItemUnits.of();
        value.setExcludeCount(4);
        Assertions.assertThat(value.getExcludeCount()).isEqualTo(4);
    }
}
