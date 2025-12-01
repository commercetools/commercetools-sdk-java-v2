
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDiscountsConfigurationUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDiscountsConfigurationUpdateActionBuilder builder) {
        SetDiscountsConfigurationUpdateAction setDiscountsConfigurationUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setDiscountsConfigurationUpdateAction)
                .isInstanceOf(SetDiscountsConfigurationUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountsConfiguration",
                SetDiscountsConfigurationUpdateAction.builder()
                        .discountsConfiguration(
                            new com.commercetools.checkout.models.application.DiscountsConfigurationImpl()) } };
    }

    @Test
    public void discountsConfiguration() {
        SetDiscountsConfigurationUpdateAction value = SetDiscountsConfigurationUpdateAction.of();
        value.setDiscountsConfiguration(new com.commercetools.checkout.models.application.DiscountsConfigurationImpl());
        Assertions.assertThat(value.getDiscountsConfiguration())
                .isEqualTo(new com.commercetools.checkout.models.application.DiscountsConfigurationImpl());
    }
}
