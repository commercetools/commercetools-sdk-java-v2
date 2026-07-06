
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAllowedOriginsUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAllowedOriginsUpdateActionBuilder builder) {
        SetAllowedOriginsUpdateAction setAllowedOriginsUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setAllowedOriginsUpdateAction).isInstanceOf(SetAllowedOriginsUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "allowedOrigins", SetAllowedOriginsUpdateAction.builder()
                .allowedOrigins(new com.commercetools.checkout.models.application.AllowedOriginsImpl()) } };
    }

    @Test
    public void allowedOrigins() {
        SetAllowedOriginsUpdateAction value = SetAllowedOriginsUpdateAction.of();
        value.setAllowedOrigins(new com.commercetools.checkout.models.application.AllowedOriginsImpl());
        Assertions.assertThat(value.getAllowedOrigins())
                .isEqualTo(new com.commercetools.checkout.models.application.AllowedOriginsImpl());
    }
}
