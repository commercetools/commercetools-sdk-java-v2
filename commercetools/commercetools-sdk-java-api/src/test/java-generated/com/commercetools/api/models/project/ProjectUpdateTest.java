
package com.commercetools.api.models.project;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectUpdateBuilder builder) {
        ProjectUpdate projectUpdate = builder.buildUnchecked();
        Assertions.assertThat(projectUpdate).isInstanceOf(ProjectUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ProjectUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ProjectUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.project.ProjectUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProjectUpdate value = ProjectUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProjectUpdate value = ProjectUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.project.ProjectUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.project.ProjectUpdateActionImpl()));
    }
}
