
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectSetDiscountsConfigurationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectSetDiscountsConfigurationActionBuilder builder) {
        ProjectSetDiscountsConfigurationAction projectSetDiscountsConfigurationAction = builder.buildUnchecked();
        Assertions.assertThat(projectSetDiscountsConfigurationAction)
                .isInstanceOf(ProjectSetDiscountsConfigurationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "discountsConfiguration",
                ProjectSetDiscountsConfigurationAction.builder()
                        .discountsConfiguration(
                            new com.commercetools.api.models.project.DiscountsConfigurationImpl()) } };
    }

    @Test
    public void discountsConfiguration() {
        ProjectSetDiscountsConfigurationAction value = ProjectSetDiscountsConfigurationAction.of();
        value.setDiscountsConfiguration(new com.commercetools.api.models.project.DiscountsConfigurationImpl());
        Assertions.assertThat(value.getDiscountsConfiguration())
                .isEqualTo(new com.commercetools.api.models.project.DiscountsConfigurationImpl());
    }
}
