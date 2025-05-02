
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectChangeProductSearchIndexingEnabledActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectChangeProductSearchIndexingEnabledActionBuilder builder) {
        ProjectChangeProductSearchIndexingEnabledAction projectChangeProductSearchIndexingEnabledAction = builder
                .buildUnchecked();
        Assertions.assertThat(projectChangeProductSearchIndexingEnabledAction)
                .isInstanceOf(ProjectChangeProductSearchIndexingEnabledAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "enabled", ProjectChangeProductSearchIndexingEnabledAction.builder().enabled(true) },
                new Object[] { "mode",
                        ProjectChangeProductSearchIndexingEnabledAction.builder()
                                .mode(com.commercetools.api.models.project.ProductSearchIndexingMode
                                        .findEnum("ProductProjectionsSearch")) } };
    }

    @Test
    public void enabled() {
        ProjectChangeProductSearchIndexingEnabledAction value = ProjectChangeProductSearchIndexingEnabledAction.of();
        value.setEnabled(true);
        Assertions.assertThat(value.getEnabled()).isEqualTo(true);
    }

    @Test
    public void mode() {
        ProjectChangeProductSearchIndexingEnabledAction value = ProjectChangeProductSearchIndexingEnabledAction.of();
        value.setMode(
            com.commercetools.api.models.project.ProductSearchIndexingMode.findEnum("ProductProjectionsSearch"));
        Assertions.assertThat(value.getMode())
                .isEqualTo(com.commercetools.api.models.project.ProductSearchIndexingMode
                        .findEnum("ProductProjectionsSearch"));
    }
}
