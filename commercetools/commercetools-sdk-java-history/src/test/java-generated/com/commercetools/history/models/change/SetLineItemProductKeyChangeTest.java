
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLineItemProductKeyChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLineItemProductKeyChangeBuilder builder) {
        SetLineItemProductKeyChange setLineItemProductKeyChange = builder.buildUnchecked();
        Assertions.assertThat(setLineItemProductKeyChange).isInstanceOf(SetLineItemProductKeyChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLineItemProductKeyChange.builder().change("change") },
                new Object[] { "previousValue", SetLineItemProductKeyChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetLineItemProductKeyChange.builder().nextValue("nextValue") },
                new Object[] { "lineItem",
                        SetLineItemProductKeyChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId", SetLineItemProductKeyChange.builder().lineItemId("lineItemId") },
                new Object[] { "variant", SetLineItemProductKeyChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void lineItem() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void variant() {
        SetLineItemProductKeyChange value = SetLineItemProductKeyChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
