
package com.commercetools.api.models.project;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeCurrenciesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeCurrenciesActionBuilder builder) {
        ProjectChangeCurrenciesAction projectChangeCurrenciesAction = builder.buildUnchecked();
        Assertions.assertThat(projectChangeCurrenciesAction).isInstanceOf(ProjectChangeCurrenciesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "currencies",
                ProjectChangeCurrenciesAction.builder().currencies(Collections.singletonList("currencies")) } };
    }

    @Test
    public void currencies() {
        ProjectChangeCurrenciesAction value = ProjectChangeCurrenciesAction.of();
        value.setCurrencies(Collections.singletonList("currencies"));
        Assertions.assertThat(value.getCurrencies()).isEqualTo(Collections.singletonList("currencies"));
    }
}
