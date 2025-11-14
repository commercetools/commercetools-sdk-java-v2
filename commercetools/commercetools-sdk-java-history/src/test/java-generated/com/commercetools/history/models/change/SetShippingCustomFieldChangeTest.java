
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingCustomFieldChangeBuilder builder) {
        SetShippingCustomFieldChange setShippingCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingCustomFieldChange).isInstanceOf(SetShippingCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetShippingCustomFieldChange.builder().change("change") },
                new Object[] { "shippingKey", SetShippingCustomFieldChange.builder().shippingKey("shippingKey") },
                new Object[] { "name", SetShippingCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId", SetShippingCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue", SetShippingCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetShippingCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetShippingCustomFieldChange value = SetShippingCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void shippingKey() {
        SetShippingCustomFieldChange value = SetShippingCustomFieldChange.of();
        value.setShippingKey("shippingKey");
        Assertions.assertThat(value.getShippingKey()).isEqualTo("shippingKey");
    }

    @Test
    public void name() {
        SetShippingCustomFieldChange value = SetShippingCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetShippingCustomFieldChange value = SetShippingCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetShippingCustomFieldChange value = SetShippingCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetShippingCustomFieldChange value = SetShippingCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
