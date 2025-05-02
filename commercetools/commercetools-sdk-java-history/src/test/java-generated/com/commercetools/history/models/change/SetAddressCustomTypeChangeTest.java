
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAddressCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAddressCustomTypeChangeBuilder builder) {
        SetAddressCustomTypeChange setAddressCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setAddressCustomTypeChange).isInstanceOf(SetAddressCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAddressCustomTypeChange.builder().change("change") },
                new Object[] { "address",
                        SetAddressCustomTypeChange.builder()
                                .address(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "previousValue",
                        SetAddressCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetAddressCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void address() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setAddress(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void previousValue() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetAddressCustomTypeChange value = SetAddressCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
