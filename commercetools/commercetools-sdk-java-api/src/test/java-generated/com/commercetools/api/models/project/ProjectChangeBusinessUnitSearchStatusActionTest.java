
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeBusinessUnitSearchStatusActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeBusinessUnitSearchStatusActionBuilder builder) {
        ProjectChangeBusinessUnitSearchStatusAction projectChangeBusinessUnitSearchStatusAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeBusinessUnitSearchStatusAction)
                .isInstanceOf(ProjectChangeBusinessUnitSearchStatusAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", ProjectChangeBusinessUnitSearchStatusAction.builder()
                .status(com.commercetools.api.models.project.BusinessUnitSearchStatus.findEnum("Activated")) } };
    }

    @Test
    public void status() {
        ProjectChangeBusinessUnitSearchStatusAction value = ProjectChangeBusinessUnitSearchStatusAction.of();
        value.setStatus(com.commercetools.api.models.project.BusinessUnitSearchStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.BusinessUnitSearchStatus.findEnum("Activated"));
    }
}
