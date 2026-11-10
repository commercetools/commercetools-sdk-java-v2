
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetItemShippingAddressCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetItemShippingAddressCustomTypeChangeBuilder builder) {
        SetItemShippingAddressCustomTypeChange setItemShippingAddressCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setItemShippingAddressCustomTypeChange)
                .isInstanceOf(SetItemShippingAddressCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetItemShippingAddressCustomTypeChange.builder().change("change") },
                new Object[] { "addressId", SetItemShippingAddressCustomTypeChange.builder().addressId("addressId") },
                new Object[] { "previousValue",
                        SetItemShippingAddressCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetItemShippingAddressCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetItemShippingAddressCustomTypeChange value = SetItemShippingAddressCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void addressId() {
        SetItemShippingAddressCustomTypeChange value = SetItemShippingAddressCustomTypeChange.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }

    @Test
    public void previousValue() {
        SetItemShippingAddressCustomTypeChange value = SetItemShippingAddressCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetItemShippingAddressCustomTypeChange value = SetItemShippingAddressCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
