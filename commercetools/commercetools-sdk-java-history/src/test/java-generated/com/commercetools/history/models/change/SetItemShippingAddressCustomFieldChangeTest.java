
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetItemShippingAddressCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetItemShippingAddressCustomFieldChangeBuilder builder) {
        SetItemShippingAddressCustomFieldChange setItemShippingAddressCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setItemShippingAddressCustomFieldChange)
                .isInstanceOf(SetItemShippingAddressCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetItemShippingAddressCustomFieldChange.builder().change("change") },
                new Object[] { "addressId", SetItemShippingAddressCustomFieldChange.builder().addressId("addressId") },
                new Object[] { "name", SetItemShippingAddressCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetItemShippingAddressCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetItemShippingAddressCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue",
                        SetItemShippingAddressCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetItemShippingAddressCustomFieldChange value = SetItemShippingAddressCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addressId() {
        SetItemShippingAddressCustomFieldChange value = SetItemShippingAddressCustomFieldChange.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void name() {
        SetItemShippingAddressCustomFieldChange value = SetItemShippingAddressCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetItemShippingAddressCustomFieldChange value = SetItemShippingAddressCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetItemShippingAddressCustomFieldChange value = SetItemShippingAddressCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetItemShippingAddressCustomFieldChange value = SetItemShippingAddressCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
