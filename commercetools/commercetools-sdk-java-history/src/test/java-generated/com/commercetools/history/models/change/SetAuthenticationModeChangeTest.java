
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAuthenticationModeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAuthenticationModeChangeBuilder builder) {
        SetAuthenticationModeChange setAuthenticationModeChange = builder.buildUnchecked();
        Assertions.assertThat(setAuthenticationModeChange).isInstanceOf(SetAuthenticationModeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAuthenticationModeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetAuthenticationModeChange.builder()
                                .previousValue(
                                    com.commercetools.history.models.common.AuthenticationMode.findEnum("Password")) },
                new Object[] { "nextValue", SetAuthenticationModeChange.builder()
                        .nextValue(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password")) } };
    }

    @Test
    public void change() {
        SetAuthenticationModeChange value = SetAuthenticationModeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAuthenticationModeChange value = SetAuthenticationModeChange.of();
        value.setPreviousValue(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
    }

    @Test
    public void nextValue() {
        SetAuthenticationModeChange value = SetAuthenticationModeChange.of();
        value.setNextValue(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(com.commercetools.history.models.common.AuthenticationMode.findEnum("Password"));
    }
}
