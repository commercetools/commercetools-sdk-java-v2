
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeCustomerSearchStatusActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeCustomerSearchStatusActionBuilder builder) {
        ProjectChangeCustomerSearchStatusAction projectChangeCustomerSearchStatusAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeCustomerSearchStatusAction)
                .isInstanceOf(ProjectChangeCustomerSearchStatusAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", ProjectChangeCustomerSearchStatusAction.builder()
                .status(com.commercetools.api.models.project.CustomerSearchStatus.findEnum("Activated")) } };
    }

    @Test
    public void status() {
        ProjectChangeCustomerSearchStatusAction value = ProjectChangeCustomerSearchStatusAction.of();
        value.setStatus(com.commercetools.api.models.project.CustomerSearchStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.CustomerSearchStatus.findEnum("Activated"));
    }
}
