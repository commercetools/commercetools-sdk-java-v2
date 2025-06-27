
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeTaxRoundingModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeTaxRoundingModeActionBuilder builder) {
        ProjectChangeTaxRoundingModeAction projectChangeTaxRoundingModeAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeTaxRoundingModeAction)
                .isInstanceOf(ProjectChangeTaxRoundingModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "taxRoundingMode", ProjectChangeTaxRoundingModeAction.builder()
                .taxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void taxRoundingMode() {
        ProjectChangeTaxRoundingModeAction value = ProjectChangeTaxRoundingModeAction.of();
        value.setTaxRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getTaxRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }
}
