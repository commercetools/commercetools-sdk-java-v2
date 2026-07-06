
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemProductSlugChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemProductSlugChangeBuilder builder) {
        SetLineItemProductSlugChange setLineItemProductSlugChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemProductSlugChange).isInstanceOf(SetLineItemProductSlugChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemProductSlugChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLineItemProductSlugChange.builder()
                                .previousValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "nextValue",
                        SetLineItemProductSlugChange.builder()
                                .nextValue(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItem",
                        SetLineItemProductSlugChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetLineItemProductSlugChange.builder().variant("variant") },
                new Object[] { "lineItemId", SetLineItemProductSlugChange.builder().lineItemId("lineItemId") } };
    }

    @Test
    public void change() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void nextValue() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setNextValue(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItem() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void lineItemId() {
        SetLineItemProductSlugChange value = SetLineItemProductSlugChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }
}
