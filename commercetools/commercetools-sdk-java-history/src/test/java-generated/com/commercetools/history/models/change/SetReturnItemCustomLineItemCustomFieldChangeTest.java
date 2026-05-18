
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReturnItemCustomLineItemCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReturnItemCustomLineItemCustomFieldChangeBuilder builder) {
        SetReturnItemCustomLineItemCustomFieldChange setReturnItemCustomLineItemCustomFieldChange = builder
                .buildUnchecked();
        Assertions.assertThat(setReturnItemCustomLineItemCustomFieldChange)
                .isInstanceOf(SetReturnItemCustomLineItemCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetReturnItemCustomLineItemCustomFieldChange.builder().change("change") },
                new Object[] { "customLineItem",
                        SetReturnItemCustomLineItemCustomFieldChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetReturnItemCustomLineItemCustomFieldChange.builder().customLineItemId("customLineItemId") },
                new Object[] { "name", SetReturnItemCustomLineItemCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetReturnItemCustomLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetReturnItemCustomLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue",
                        SetReturnItemCustomLineItemCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetReturnItemCustomLineItemCustomFieldChange value = SetReturnItemCustomLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void customLineItem() {
        SetReturnItemCustomLineItemCustomFieldChange value = SetReturnItemCustomLineItemCustomFieldChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetReturnItemCustomLineItemCustomFieldChange value = SetReturnItemCustomLineItemCustomFieldChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void name() {
        SetReturnItemCustomLineItemCustomFieldChange value = SetReturnItemCustomLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetReturnItemCustomLineItemCustomFieldChange value = SetReturnItemCustomLineItemCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetReturnItemCustomLineItemCustomFieldChange value = SetReturnItemCustomLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetReturnItemCustomLineItemCustomFieldChange value = SetReturnItemCustomLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
