
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeBusinessUnitStatusOnCreationActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeBusinessUnitStatusOnCreationActionBuilder builder) {
        ProjectChangeBusinessUnitStatusOnCreationAction projectChangeBusinessUnitStatusOnCreationAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeBusinessUnitStatusOnCreationAction)
                .isInstanceOf(ProjectChangeBusinessUnitStatusOnCreationAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", ProjectChangeBusinessUnitStatusOnCreationAction.builder()
                .status(com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active")) } };
    }

    @Test
    public void status() {
        ProjectChangeBusinessUnitStatusOnCreationAction value = ProjectChangeBusinessUnitStatusOnCreationAction.of();
        value.setStatus(com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.BusinessUnitConfigurationStatus.findEnum("Active"));
    }
}
