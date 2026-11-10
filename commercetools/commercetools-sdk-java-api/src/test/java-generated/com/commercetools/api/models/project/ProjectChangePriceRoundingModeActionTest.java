
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangePriceRoundingModeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangePriceRoundingModeActionBuilder builder) {
        ProjectChangePriceRoundingModeAction projectChangePriceRoundingModeAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangePriceRoundingModeAction)
                .isInstanceOf(ProjectChangePriceRoundingModeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "priceRoundingMode", ProjectChangePriceRoundingModeAction.builder()
                .priceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven")) } };
    }

    @Test
    public void priceRoundingMode() {
        ProjectChangePriceRoundingModeAction value = ProjectChangePriceRoundingModeAction.of();
        value.setPriceRoundingMode(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
        Assertions.assertThat(value.getPriceRoundingMode())
                .isEqualTo(com.commercetools.api.models.cart.RoundingMode.findEnum("HalfEven"));
    }
}
