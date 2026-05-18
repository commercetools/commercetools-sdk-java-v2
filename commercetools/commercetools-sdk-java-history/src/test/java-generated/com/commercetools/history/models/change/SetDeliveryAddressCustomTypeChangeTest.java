
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDeliveryAddressCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDeliveryAddressCustomTypeChangeBuilder builder) {
        SetDeliveryAddressCustomTypeChange setDeliveryAddressCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setDeliveryAddressCustomTypeChange)
                .isInstanceOf(SetDeliveryAddressCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetDeliveryAddressCustomTypeChange.builder().change("change") },
                new Object[] { "deliveryId", SetDeliveryAddressCustomTypeChange.builder().deliveryId("deliveryId") },
                new Object[] { "addressId", SetDeliveryAddressCustomTypeChange.builder().addressId("addressId") },
                new Object[] { "previousValue",
                        SetDeliveryAddressCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetDeliveryAddressCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetDeliveryAddressCustomTypeChange value = SetDeliveryAddressCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void deliveryId() {
        SetDeliveryAddressCustomTypeChange value = SetDeliveryAddressCustomTypeChange.of();
        value.setDeliveryId("deliveryId");
        Assertions.assertThat(value.getDeliveryId()).isEqualTo("deliveryId");
    }

    @Test
    public void addressId() {
        SetDeliveryAddressCustomTypeChange value = SetDeliveryAddressCustomTypeChange.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void previousValue() {
        SetDeliveryAddressCustomTypeChange value = SetDeliveryAddressCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetDeliveryAddressCustomTypeChange value = SetDeliveryAddressCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
