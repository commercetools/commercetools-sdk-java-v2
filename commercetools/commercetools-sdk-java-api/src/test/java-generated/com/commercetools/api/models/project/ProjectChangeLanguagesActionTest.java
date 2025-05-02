
package com.commercetools.api.models.project;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeLanguagesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeLanguagesActionBuilder builder) {
        ProjectChangeLanguagesAction projectChangeLanguagesAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeLanguagesAction).isInstanceOf(ProjectChangeLanguagesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "languages",
                ProjectChangeLanguagesAction.builder().languages(Collections.singletonList("languages")) } };
    }

    @Test
    public void languages() {
        ProjectChangeLanguagesAction value = ProjectChangeLanguagesAction.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }
}
