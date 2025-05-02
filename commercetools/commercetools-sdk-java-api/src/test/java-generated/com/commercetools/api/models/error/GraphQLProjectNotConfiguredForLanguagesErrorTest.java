
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLProjectNotConfiguredForLanguagesErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLProjectNotConfiguredForLanguagesErrorBuilder builder) {
        GraphQLProjectNotConfiguredForLanguagesError graphQLProjectNotConfiguredForLanguagesError = builder
                .buildUnchecked();
        Assertions.assertThat(graphQLProjectNotConfiguredForLanguagesError)
                .isInstanceOf(GraphQLProjectNotConfiguredForLanguagesError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "languages", GraphQLProjectNotConfiguredForLanguagesError.builder()
                .languages(Collections.singletonList("languages")) } };
    }

    @Test
    public void languages() {
        GraphQLProjectNotConfiguredForLanguagesError value = GraphQLProjectNotConfiguredForLanguagesError.of();
        value.setLanguages(Collections.singletonList("languages"));
        Assertions.assertThat(value.getLanguages()).isEqualTo(Collections.singletonList("languages"));
    }
}
