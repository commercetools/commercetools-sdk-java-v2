
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetApplicationLogoUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetApplicationLogoUpdateActionBuilder builder) {
        SetApplicationLogoUpdateAction setApplicationLogoUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(setApplicationLogoUpdateAction).isInstanceOf(SetApplicationLogoUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "logo", SetApplicationLogoUpdateAction.builder()
                .logo(new com.commercetools.checkout.models.application.ApplicationLogoImpl()) } };
    }

    @Test
    public void logo() {
        SetApplicationLogoUpdateAction value = SetApplicationLogoUpdateAction.of();
        value.setLogo(new com.commercetools.checkout.models.application.ApplicationLogoImpl());
        Assertions.assertThat(value.getLogo())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationLogoImpl());
    }
}
