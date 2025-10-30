
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDisplayInfoUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDisplayInfoUpdateActionBuilder builder) {
        SetDisplayInfoUpdateAction setDisplayInfoUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setDisplayInfoUpdateAction).isInstanceOf(SetDisplayInfoUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "displayInfo", SetDisplayInfoUpdateAction.builder()
                .displayInfo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl()) } };
    }

    @Test
    public void displayInfo() {
        SetDisplayInfoUpdateAction value = SetDisplayInfoUpdateAction.of();
        value.setDisplayInfo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl());
        Assertions.assertThat(value.getDisplayInfo())
                .isEqualTo(new com.commercetools.checkout.models.payment_integration.DisplayInfoImpl());
    }
}
