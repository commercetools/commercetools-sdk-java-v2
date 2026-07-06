
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDisplayInfoLabelUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDisplayInfoLabelUpdateActionBuilder builder) {
        SetDisplayInfoLabelUpdateAction setDisplayInfoLabelUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setDisplayInfoLabelUpdateAction).isInstanceOf(SetDisplayInfoLabelUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "label", SetDisplayInfoLabelUpdateAction.builder()
                .label(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void label() {
        SetDisplayInfoLabelUpdateAction value = SetDisplayInfoLabelUpdateAction.of();
        value.setLabel(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getLabel())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
