
package com.commercetools.api.models.project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProjectSetExternalOAuthActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProjectSetExternalOAuthActionBuilder builder) {
        ProjectSetExternalOAuthAction projectSetExternalOAuthAction = builder.buildUnchecked();
        Assertions.assertThat(projectSetExternalOAuthAction).isInstanceOf(ProjectSetExternalOAuthAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "externalOAuth", ProjectSetExternalOAuthAction.builder()
                .externalOAuth(new com.commercetools.api.models.project.ExternalOAuthImpl()) } };
    }

    @Test
    public void externalOAuth() {
        ProjectSetExternalOAuthAction value = ProjectSetExternalOAuthAction.of();
        value.setExternalOAuth(new com.commercetools.api.models.project.ExternalOAuthImpl());
        Assertions.assertThat(value.getExternalOAuth())
                .isEqualTo(new com.commercetools.api.models.project.ExternalOAuthImpl());
    }
}
