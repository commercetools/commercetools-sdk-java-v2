
package com.commercetools.compat;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.project.Project;

import io.sphere.sdk.projects.queries.ProjectGet;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompatClientUsageTest {
    @Test
    public void compatClient() {
        final ApiHttpClient apiHttpClient = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .buildClient();
        final String projectKey = CommercetoolsTestUtils.getProjectKey();

        CompatClient client = CompatClient.of(apiHttpClient, projectKey);

        Project project = client.executeBlocking(ProjectGet.of(), Project.class).getBody();

        Assertions.assertThat(project).isInstanceOf(Project.class);
        Assertions.assertThat(project.getKey()).isEqualTo(projectKey);
    }
}
