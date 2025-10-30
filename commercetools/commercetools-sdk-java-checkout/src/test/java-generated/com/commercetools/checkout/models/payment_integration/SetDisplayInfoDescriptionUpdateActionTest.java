
package com.commercetools.checkout.models.payment_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDisplayInfoDescriptionUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDisplayInfoDescriptionUpdateActionBuilder builder) {
        SetDisplayInfoDescriptionUpdateAction setDisplayInfoDescriptionUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setDisplayInfoDescriptionUpdateAction)
                .isInstanceOf(SetDisplayInfoDescriptionUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description", SetDisplayInfoDescriptionUpdateAction.builder()
                .description(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void description() {
        SetDisplayInfoDescriptionUpdateAction value = SetDisplayInfoDescriptionUpdateAction.of();
        value.setDescription(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
