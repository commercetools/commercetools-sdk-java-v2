
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeOrderSearchStatusActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeOrderSearchStatusActionBuilder builder) {
        ProjectChangeOrderSearchStatusAction projectChangeOrderSearchStatusAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeOrderSearchStatusAction)
                .isInstanceOf(ProjectChangeOrderSearchStatusAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", ProjectChangeOrderSearchStatusAction.builder()
                .status(com.commercetools.api.models.project.OrderSearchStatus.findEnum("Activated")) } };
    }

    @Test
    public void status() {
        ProjectChangeOrderSearchStatusAction value = ProjectChangeOrderSearchStatusAction.of();
        value.setStatus(com.commercetools.api.models.project.OrderSearchStatus.findEnum("Activated"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.project.OrderSearchStatus.findEnum("Activated"));
    }
}
