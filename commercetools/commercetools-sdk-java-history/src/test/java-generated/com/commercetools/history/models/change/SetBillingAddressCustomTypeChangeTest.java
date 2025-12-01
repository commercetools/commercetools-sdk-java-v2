
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetBillingAddressCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetBillingAddressCustomTypeChangeBuilder builder) {
        SetBillingAddressCustomTypeChange setBillingAddressCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setBillingAddressCustomTypeChange).isInstanceOf(SetBillingAddressCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetBillingAddressCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetBillingAddressCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetBillingAddressCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetBillingAddressCustomTypeChange value = SetBillingAddressCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetBillingAddressCustomTypeChange value = SetBillingAddressCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetBillingAddressCustomTypeChange value = SetBillingAddressCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
