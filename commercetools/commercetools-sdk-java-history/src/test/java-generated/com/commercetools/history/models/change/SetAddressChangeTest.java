
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAddressChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAddressChangeBuilder builder) {
        SetAddressChange setAddressChange = builder.buildUnchecked();
        Assertions.assertThat(setAddressChange).isInstanceOf(SetAddressChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAddressChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetAddressChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "nextValue", SetAddressChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        SetAddressChange value = SetAddressChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAddressChange value = SetAddressChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void nextValue() {
        SetAddressChange value = SetAddressChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
