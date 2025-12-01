
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingAddressCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingAddressCustomFieldChangeBuilder builder) {
        SetShippingAddressCustomFieldChange setShippingAddressCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingAddressCustomFieldChange)
                .isInstanceOf(SetShippingAddressCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetShippingAddressCustomFieldChange.builder().change("change") },
                new Object[] { "name", SetShippingAddressCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        SetShippingAddressCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetShippingAddressCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetShippingAddressCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetShippingAddressCustomFieldChange value = SetShippingAddressCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void name() {
        SetShippingAddressCustomFieldChange value = SetShippingAddressCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetShippingAddressCustomFieldChange value = SetShippingAddressCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetShippingAddressCustomFieldChange value = SetShippingAddressCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetShippingAddressCustomFieldChange value = SetShippingAddressCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
