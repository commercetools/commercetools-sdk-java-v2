
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class DiscountsConfigurationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, DiscountsConfigurationBuilder builder) {
        DiscountsConfiguration discountsConfiguration = builder.buildUnchecked();
        Assertions.assertThat(discountsConfiguration).isInstanceOf(DiscountsConfiguration.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountCombinationMode",
                DiscountsConfiguration.builder()
                        .discountCombinationMode(
                            com.commercetools.api.models.project.DiscountCombinationMode.findEnum("BestDeal")) } };
    }

    @Test
    public void discountCombinationMode() {
        DiscountsConfiguration value = DiscountsConfiguration.of();
        value.setDiscountCombinationMode(
            com.commercetools.api.models.project.DiscountCombinationMode.findEnum("BestDeal"));
        Assertions.assertThat(value.getDiscountCombinationMode())
                .isEqualTo(com.commercetools.api.models.project.DiscountCombinationMode.findEnum("BestDeal"));
    }
}
