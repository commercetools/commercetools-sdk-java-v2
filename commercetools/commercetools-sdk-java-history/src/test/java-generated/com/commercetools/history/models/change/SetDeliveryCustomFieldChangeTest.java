
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDeliveryCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDeliveryCustomFieldChangeBuilder builder) {
        SetDeliveryCustomFieldChange setDeliveryCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setDeliveryCustomFieldChange).isInstanceOf(SetDeliveryCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDeliveryCustomFieldChange.builder().change("change") },
                new Object[] { "deliveryId", SetDeliveryCustomFieldChange.builder().deliveryId("deliveryId") },
                new Object[] { "name", SetDeliveryCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId", SetDeliveryCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue", SetDeliveryCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetDeliveryCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetDeliveryCustomFieldChange value = SetDeliveryCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void deliveryId() {
        SetDeliveryCustomFieldChange value = SetDeliveryCustomFieldChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void name() {
        SetDeliveryCustomFieldChange value = SetDeliveryCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetDeliveryCustomFieldChange value = SetDeliveryCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetDeliveryCustomFieldChange value = SetDeliveryCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetDeliveryCustomFieldChange value = SetDeliveryCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
