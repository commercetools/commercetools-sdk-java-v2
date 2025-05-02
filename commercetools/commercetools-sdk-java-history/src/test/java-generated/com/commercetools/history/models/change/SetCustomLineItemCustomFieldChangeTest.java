
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomLineItemCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomLineItemCustomFieldChangeBuilder builder) {
        SetCustomLineItemCustomFieldChange setCustomLineItemCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomLineItemCustomFieldChange)
                .isInstanceOf(SetCustomLineItemCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetCustomLineItemCustomFieldChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomLineItemCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCustomLineItemCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { "name", SetCustomLineItemCustomFieldChange.builder().name("name") },
                new Object[] { "customLineItem",
                        SetCustomLineItemCustomFieldChange.builder()
                                .customLineItem(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "customLineItemId",
                        SetCustomLineItemCustomFieldChange.builder().customLineItemId("customLineItemId") } };
    }

    @Test
    public void change() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void name() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customLineItem() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setCustomLineItem(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getCustomLineItem())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void customLineItemId() {
        SetCustomLineItemCustomFieldChange value = SetCustomLineItemCustomFieldChange.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }
}
