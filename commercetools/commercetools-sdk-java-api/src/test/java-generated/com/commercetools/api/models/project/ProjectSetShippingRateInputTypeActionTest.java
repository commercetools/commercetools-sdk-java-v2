
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectSetShippingRateInputTypeActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectSetShippingRateInputTypeActionBuilder builder) {
        ProjectSetShippingRateInputTypeAction projectSetShippingRateInputTypeAction = builder.buildUnchecked();
        Assertions.assertThat(projectSetShippingRateInputTypeAction)
                .isInstanceOf(ProjectSetShippingRateInputTypeAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "shippingRateInputType", ProjectSetShippingRateInputTypeAction.builder()
                .shippingRateInputType(new com.commercetools.api.models.project.ShippingRateInputTypeImpl()) } };
    }

    @Test
    public void shippingRateInputType() {
        ProjectSetShippingRateInputTypeAction value = ProjectSetShippingRateInputTypeAction.of();
        value.setShippingRateInputType(new com.commercetools.api.models.project.ShippingRateInputTypeImpl());
        Assertions.assertThat(value.getShippingRateInputType())
                .isEqualTo(new com.commercetools.api.models.project.ShippingRateInputTypeImpl());
    }
}
