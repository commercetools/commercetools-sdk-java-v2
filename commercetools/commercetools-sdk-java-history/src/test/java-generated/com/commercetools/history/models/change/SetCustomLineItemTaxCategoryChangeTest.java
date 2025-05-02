
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemTaxCategoryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemTaxCategoryChangeBuilder builder) {
        SetCustomLineItemTaxCategoryChange setCustomLineItemTaxCategoryChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemTaxCategoryChange)
                .isInstanceOf(SetCustomLineItemTaxCategoryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetCustomLineItemTaxCategoryChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomLineItemTaxCategoryChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "nextValue",
                        SetCustomLineItemTaxCategoryChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "customLineItem",
                        SetCustomLineItemTaxCategoryChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemTaxCategoryChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemTaxCategoryChange value = SetCustomLineItemTaxCategoryChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
