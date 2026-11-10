
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectNotConfiguredForLanguagesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectNotConfiguredForLanguagesErrorBuilder builder) {
        ProjectNotConfiguredForLanguagesError projectNotConfiguredForLanguagesError = builder.buildUnchecked();
        Assertions.assertThat(projectNotConfiguredForLanguagesError)
                .isInstanceOf(ProjectNotConfiguredForLanguagesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", ProjectNotConfiguredForLanguagesError.builder().message("message") },
                new Object[] { "languages", ProjectNotConfiguredForLanguagesError.builder()
                        .languages(Collections.singletonList("languages")) } };
    }

    @Test
    public void message() {
        ProjectNotConfiguredForLanguagesError value = ProjectNotConfiguredForLanguagesError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void languages() {
        ProjectNotConfiguredForLanguagesError value = ProjectNotConfiguredForLanguagesError.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }
}
