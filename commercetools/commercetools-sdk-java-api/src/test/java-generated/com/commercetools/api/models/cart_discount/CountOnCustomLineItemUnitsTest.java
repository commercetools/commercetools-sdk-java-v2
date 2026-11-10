
package com.commercetools.api.models.cart_discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CountOnCustomLineItemUnitsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CountOnCustomLineItemUnitsBuilder builder) {
        CountOnCustomLineItemUnits countOnCustomLineItemUnits = builder.buildUnchecked();
        Assertions.assertThat(countOnCustomLineItemUnits).isInstanceOf(CountOnCustomLineItemUnits.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "predicate", CountOnCustomLineItemUnits.builder().predicate("predicate") },
                new Object[] { "minCount", CountOnCustomLineItemUnits.builder().minCount(1) },
                new Object[] { "maxCount", CountOnCustomLineItemUnits.builder().maxCount(8) },
                new Object[] { "excludeCount", CountOnCustomLineItemUnits.builder().excludeCount(4) } };
    }

    @Test
    public void predicate() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void minCount() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setMinCount(1);
        Assertions.assertThat(value.getMinCount()).isEqualTo(1);
    }

    @Test
    public void maxCount() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setMaxCount(8);
        Assertions.assertThat(value.getMaxCount()).isEqualTo(8);
    }

    @Test
    public void excludeCount() {
        CountOnCustomLineItemUnits value = CountOnCustomLineItemUnits.of();
        value.setExcludeCount(4);
        Assertions.assertThat(value.getExcludeCount()).isEqualTo(4);
    }
}
