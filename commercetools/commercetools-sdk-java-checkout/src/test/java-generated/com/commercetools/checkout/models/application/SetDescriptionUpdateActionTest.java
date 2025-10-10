
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDescriptionUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDescriptionUpdateActionBuilder builder) {
        SetDescriptionUpdateAction setDescriptionUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setDescriptionUpdateAction).isInstanceOf(SetDescriptionUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description", SetDescriptionUpdateAction.builder()
                .description(new com.commercetools.checkout.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void description() {
        SetDescriptionUpdateAction value = SetDescriptionUpdateAction.of();
        value.setDescription(new com.commercetools.checkout.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.checkout.models.common.LocalizedStringImpl());
    }
}
