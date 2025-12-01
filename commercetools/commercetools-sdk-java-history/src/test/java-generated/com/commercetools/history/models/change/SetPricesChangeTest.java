
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPricesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPricesChangeBuilder builder) {
        SetPricesChange setPricesChange = builder.buildUnchecked();
        Assertions.assertThat(setPricesChange).isInstanceOf(SetPricesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetPricesChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetPricesChange.builder()
                                .previousValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceImpl())) },
                new Object[] { "nextValue",
                        SetPricesChange.builder()
                                .nextValue(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceImpl())) },
                new Object[] { "catalogData", SetPricesChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetPricesChange.builder().variant("variant") },
                new Object[] { "addedItems",
                        SetPricesChange.builder()
                                .addedItems(Collections
                                        .singletonList(new com.commercetools.history.models.common.PriceImpl())) },
                new Object[] { "removedItems", SetPricesChange.builder()
                        .removedItems(
                            Collections.singletonList(new com.commercetools.history.models.common.PriceImpl())) } };
    }

    @Test
    public void change() {
        SetPricesChange value = SetPricesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPricesChange value = SetPricesChange.of();
        value.setPreviousValue(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
    }

    @Test
    public void nextValue() {
        SetPricesChange value = SetPricesChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
    }

    @Test
    public void catalogData() {
        SetPricesChange value = SetPricesChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetPricesChange value = SetPricesChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void addedItems() {
        SetPricesChange value = SetPricesChange.of();
        value.setAddedItems(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
    }

    @Test
    public void removedItems() {
        SetPricesChange value = SetPricesChange.of();
        value.setRemovedItems(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.PriceImpl()));
    }
}
