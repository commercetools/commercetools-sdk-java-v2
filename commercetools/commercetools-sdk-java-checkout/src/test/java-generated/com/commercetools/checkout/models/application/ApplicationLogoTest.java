
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ApplicationLogoTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ApplicationLogoBuilder builder) {
        ApplicationLogo applicationLogo = builder.buildUnchecked();
        Assertions.assertThat(applicationLogo).isInstanceOf(ApplicationLogo.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "url", ApplicationLogo.builder().url("url") } };
    }

    @Test
    public void url() {
        ApplicationLogo value = ApplicationLogo.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }
}
