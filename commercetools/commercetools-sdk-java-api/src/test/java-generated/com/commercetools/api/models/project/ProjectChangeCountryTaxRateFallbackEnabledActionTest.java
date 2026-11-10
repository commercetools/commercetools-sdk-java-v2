
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeCountryTaxRateFallbackEnabledActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeCountryTaxRateFallbackEnabledActionBuilder builder) {
        ProjectChangeCountryTaxRateFallbackEnabledAction projectChangeCountryTaxRateFallbackEnabledAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeCountryTaxRateFallbackEnabledAction)
                .isInstanceOf(ProjectChangeCountryTaxRateFallbackEnabledAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "countryTaxRateFallbackEnabled",
                ProjectChangeCountryTaxRateFallbackEnabledAction.builder().countryTaxRateFallbackEnabled(true) } };
    }

    @Test
    public void countryTaxRateFallbackEnabled() {
        ProjectChangeCountryTaxRateFallbackEnabledAction value = ProjectChangeCountryTaxRateFallbackEnabledAction.of();
        value.setCountryTaxRateFallbackEnabled(true);
        Assertions.assertThat(value.getCountryTaxRateFallbackEnabled()).isEqualTo(true);
    }
}
