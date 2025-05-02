
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTextLineItemCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetTextLineItemCustomFieldChangeBuilder builder) {
        SetTextLineItemCustomFieldChange setTextLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setTextLineItemCustomFieldChange).isInstanceOf(SetTextLineItemCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetTextLineItemCustomFieldChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetTextLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetTextLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { "name", SetTextLineItemCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetTextLineItemCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "textLineItem", SetTextLineItemCustomFieldChange.builder()
                        .textLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl()) } };
    }

    @Test
    public void change() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void name() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void textLineItem() {
        SetTextLineItemCustomFieldChange value = SetTextLineItemCustomFieldChange.of();
        value.setTextLineItem(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
        Assertions.assertThat(value.getTextLineItem())
                .isEqualTo(new com.commercetools.history.models.change_value.TextLineItemValueImpl());
    }
}
