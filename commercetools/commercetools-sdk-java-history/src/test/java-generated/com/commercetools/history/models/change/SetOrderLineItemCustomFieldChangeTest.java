
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetOrderLineItemCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetOrderLineItemCustomFieldChangeBuilder builder) {
        SetOrderLineItemCustomFieldChange setOrderLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setOrderLineItemCustomFieldChange).isInstanceOf(SetOrderLineItemCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetOrderLineItemCustomFieldChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetOrderLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetOrderLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { "customTypeId",
                        SetOrderLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "name", SetOrderLineItemCustomFieldChange.builder().name("name") },
                new Object[] { "lineItem",
                        SetOrderLineItemCustomFieldChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "variant", SetOrderLineItemCustomFieldChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void customTypeId() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void name() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void lineItem() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void variant() {
        SetOrderLineItemCustomFieldChange value = SetOrderLineItemCustomFieldChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
