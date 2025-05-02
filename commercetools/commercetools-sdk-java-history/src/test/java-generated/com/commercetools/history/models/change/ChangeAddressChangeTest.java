
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeAddressChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeAddressChangeBuilder builder) {
        ChangeAddressChange changeAddressChange = builder.buildUnchecked();
        Assertions.assertThat(changeAddressChange).isInstanceOf(ChangeAddressChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeAddressChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeAddressChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AddressImpl()) },
                new Object[] { "nextValue", ChangeAddressChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AddressImpl()) } };
    }

    @Test
    public void change() {
        ChangeAddressChange value = ChangeAddressChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeAddressChange value = ChangeAddressChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }

    @Test
    public void nextValue() {
        ChangeAddressChange value = ChangeAddressChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AddressImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AddressImpl());
    }
}
