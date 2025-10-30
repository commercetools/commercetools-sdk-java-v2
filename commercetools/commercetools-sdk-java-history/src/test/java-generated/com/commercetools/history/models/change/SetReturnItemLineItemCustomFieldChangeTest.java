
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetReturnItemLineItemCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetReturnItemLineItemCustomFieldChangeBuilder builder) {
        SetReturnItemLineItemCustomFieldChange setReturnItemLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setReturnItemLineItemCustomFieldChange)
                .isInstanceOf(SetReturnItemLineItemCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetReturnItemLineItemCustomFieldChange.builder().change("change") },
                new Object[] { "variant", SetReturnItemLineItemCustomFieldChange.builder().variant("variant") },
                new Object[] { "lineItem",
                        SetReturnItemLineItemCustomFieldChange.builder()
                                .lineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "lineItemId",
                        SetReturnItemLineItemCustomFieldChange.builder().lineItemId("lineItemId") },
                new Object[] { "name", SetReturnItemLineItemCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetReturnItemLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetReturnItemLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetReturnItemLineItemCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void variant() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void lineItem() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void lineItemId() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void name() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetReturnItemLineItemCustomFieldChange value = SetReturnItemLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
