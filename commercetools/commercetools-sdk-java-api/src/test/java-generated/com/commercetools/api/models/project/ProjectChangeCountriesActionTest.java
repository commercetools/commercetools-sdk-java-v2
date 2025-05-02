
package com.commercetools.api.models.project;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeCountriesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeCountriesActionBuilder builder) {
        ProjectChangeCountriesAction projectChangeCountriesAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeCountriesAction).isInstanceOf(ProjectChangeCountriesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "countries",
                ProjectChangeCountriesAction.builder().countries(Collections.singletonList("countries")) } };
    }

    @Test
    public void countries() {
        ProjectChangeCountriesAction value = ProjectChangeCountriesAction.of();
        value.setCountries(Collections.singletonList("countries"));
        Assertions.assertThat(value.getCountries()).isEqualTo(Collections.singletonList("countries"));
    }
}
