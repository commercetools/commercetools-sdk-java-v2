
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeCartsConfigurationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeCartsConfigurationActionBuilder builder) {
        ProjectChangeCartsConfigurationAction projectChangeCartsConfigurationAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeCartsConfigurationAction)
                .isInstanceOf(ProjectChangeCartsConfigurationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartsConfiguration", ProjectChangeCartsConfigurationAction.builder()
                .cartsConfiguration(new com.commercetools.api.models.project.CartsConfigurationImpl()) } };
    }

    @Test
    public void cartsConfiguration() {
        ProjectChangeCartsConfigurationAction value = ProjectChangeCartsConfigurationAction.of();
        value.setCartsConfiguration(new com.commercetools.api.models.project.CartsConfigurationImpl());
        Assertions.assertThat(value.getCartsConfiguration())
                .isEqualTo(new com.commercetools.api.models.project.CartsConfigurationImpl());
    }
}
