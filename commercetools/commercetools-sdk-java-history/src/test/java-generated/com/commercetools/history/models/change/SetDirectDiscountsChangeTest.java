
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDirectDiscountsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDirectDiscountsChangeBuilder builder) {
        SetDirectDiscountsChange setDirectDiscountsChange = builder.buildUnchecked();
        Assertions.assertThat(setDirectDiscountsChange).isInstanceOf(SetDirectDiscountsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDirectDiscountsChange.builder().change("change") },
                new Object[] { "addedItems",
                        SetDirectDiscountsChange.builder()
                                .addedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.DirectDiscountImpl())) },
                new Object[] { "removedItems",
                        SetDirectDiscountsChange.builder()
                                .removedItems(Collections.singletonList(
                                    new com.commercetools.history.models.common.DirectDiscountImpl())) },
                new Object[] { "previousValue",
                        SetDirectDiscountsChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.DirectDiscountImpl())) },
                new Object[] { "nextValue",
                        SetDirectDiscountsChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.DirectDiscountImpl())) } };
    }

    @Test
    public void change() {
        SetDirectDiscountsChange value = SetDirectDiscountsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addedItems() {
        SetDirectDiscountsChange value = SetDirectDiscountsChange.of();
        value.setAddedItems(
            Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
        Assertions.assertThat(value.getAddedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
    }

    @Test
    public void removedItems() {
        SetDirectDiscountsChange value = SetDirectDiscountsChange.of();
        value.setRemovedItems(
            Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
        Assertions.assertThat(value.getRemovedItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
    }

    @Test
    public void previousValue() {
        SetDirectDiscountsChange value = SetDirectDiscountsChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
    }

    @Test
    public void nextValue() {
        SetDirectDiscountsChange value = SetDirectDiscountsChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.DirectDiscountImpl()));
    }
}
