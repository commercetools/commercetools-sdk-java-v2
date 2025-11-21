
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDeliveryAddressCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDeliveryAddressCustomFieldChangeBuilder builder) {
        SetDeliveryAddressCustomFieldChange setDeliveryAddressCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setDeliveryAddressCustomFieldChange)
                .isInstanceOf(SetDeliveryAddressCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetDeliveryAddressCustomFieldChange.builder().change("change") },
                new Object[] { "deliveryId", SetDeliveryAddressCustomFieldChange.builder().deliveryId("deliveryId") },
                new Object[] { "addressId", SetDeliveryAddressCustomFieldChange.builder().addressId("addressId") },
                new Object[] { "name", SetDeliveryAddressCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetDeliveryAddressCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetDeliveryAddressCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetDeliveryAddressCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetDeliveryAddressCustomFieldChange value = SetDeliveryAddressCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void deliveryId() {
        SetDeliveryAddressCustomFieldChange value = SetDeliveryAddressCustomFieldChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void addressId() {
        SetDeliveryAddressCustomFieldChange value = SetDeliveryAddressCustomFieldChange.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        SetDeliveryAddressCustomFieldChange value = SetDeliveryAddressCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetDeliveryAddressCustomFieldChange value = SetDeliveryAddressCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetDeliveryAddressCustomFieldChange value = SetDeliveryAddressCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetDeliveryAddressCustomFieldChange value = SetDeliveryAddressCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
