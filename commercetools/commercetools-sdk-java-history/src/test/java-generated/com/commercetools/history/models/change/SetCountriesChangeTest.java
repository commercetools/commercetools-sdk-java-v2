
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCountriesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCountriesChangeBuilder builder) {
        SetCountriesChange setCountriesChange = builder.buildUnchecked();
        Assertions.assertThat(setCountriesChange).isInstanceOf(SetCountriesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCountriesChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCountriesChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.StoreCountryImpl())) },
                new Object[] { "nextValue",
                        SetCountriesChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.common.StoreCountryImpl())) } };
    }

    @Test
    public void change() {
        SetCountriesChange value = SetCountriesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCountriesChange value = SetCountriesChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
    }

    @Test
    public void nextValue() {
        SetCountriesChange value = SetCountriesChange.of();
        value.setNextValue(Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.StoreCountryImpl()));
    }
}
