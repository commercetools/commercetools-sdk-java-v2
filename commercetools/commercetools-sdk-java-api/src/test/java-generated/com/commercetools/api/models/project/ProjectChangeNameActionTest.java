
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeNameActionBuilder builder) {
        ProjectChangeNameAction projectChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeNameAction).isInstanceOf(ProjectChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ProjectChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        ProjectChangeNameAction value = ProjectChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
