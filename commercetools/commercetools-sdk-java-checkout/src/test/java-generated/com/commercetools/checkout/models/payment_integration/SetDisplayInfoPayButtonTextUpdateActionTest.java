
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDisplayInfoPayButtonTextUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDisplayInfoPayButtonTextUpdateActionBuilder builder) {
        SetDisplayInfoPayButtonTextUpdateAction setDisplayInfoPayButtonTextUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setDisplayInfoPayButtonTextUpdateAction)
                .isInstanceOf(SetDisplayInfoPayButtonTextUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "payButtonText", SetDisplayInfoPayButtonTextUpdateAction.builder()
                .payButtonText(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void payButtonText() {
        SetDisplayInfoPayButtonTextUpdateAction value = SetDisplayInfoPayButtonTextUpdateAction.of();
        value.setPayButtonText(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getPayButtonText())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
