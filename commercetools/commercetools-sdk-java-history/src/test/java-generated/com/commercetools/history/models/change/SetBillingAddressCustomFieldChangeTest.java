
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetBillingAddressCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetBillingAddressCustomFieldChangeBuilder builder) {
        SetBillingAddressCustomFieldChange setBillingAddressCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setBillingAddressCustomFieldChange)
                .isInstanceOf(SetBillingAddressCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetBillingAddressCustomFieldChange.builder().change("change") },
                new Object[] { "name", SetBillingAddressCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetBillingAddressCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetBillingAddressCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetBillingAddressCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetBillingAddressCustomFieldChange value = SetBillingAddressCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void name() {
        SetBillingAddressCustomFieldChange value = SetBillingAddressCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetBillingAddressCustomFieldChange value = SetBillingAddressCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetBillingAddressCustomFieldChange value = SetBillingAddressCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetBillingAddressCustomFieldChange value = SetBillingAddressCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
