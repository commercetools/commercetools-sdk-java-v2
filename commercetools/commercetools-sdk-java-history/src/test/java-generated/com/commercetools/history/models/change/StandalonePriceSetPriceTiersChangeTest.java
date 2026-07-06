
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetPriceTiersChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetPriceTiersChangeBuilder builder) {
        StandalonePriceSetPriceTiersChange standalonePriceSetPriceTiersChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetPriceTiersChange)
                .isInstanceOf(StandalonePriceSetPriceTiersChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", StandalonePriceSetPriceTiersChange.builder().change("change") },
                new Object[] { "addedItems",
                        StandalonePriceSetPriceTiersChange.builder()
                                .addedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceTierImpl())) },
                new Object[] { "removedItems",
                        StandalonePriceSetPriceTiersChange.builder()
                                .removedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceTierImpl())) },
                new Object[] { "previousValue",
                        StandalonePriceSetPriceTiersChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceTierImpl())) },
                new Object[] { "nextValue", StandalonePriceSetPriceTiersChange.builder()
                        .nextValue(
                            Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl())) } };
    }

    @Test
    public void change() {
        StandalonePriceSetPriceTiersChange value = StandalonePriceSetPriceTiersChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addedItems() {
        StandalonePriceSetPriceTiersChange value = StandalonePriceSetPriceTiersChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
    }

    @Test
    public void removedItems() {
        StandalonePriceSetPriceTiersChange value = StandalonePriceSetPriceTiersChange.of();
        value.setRemovedItems(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
    }

    @Test
    public void previousValue() {
        StandalonePriceSetPriceTiersChange value = StandalonePriceSetPriceTiersChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
    }

    @Test
    public void nextValue() {
        StandalonePriceSetPriceTiersChange value = StandalonePriceSetPriceTiersChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceTierImpl()));
    }
}
