
package com.commercetools.compat;

import java.util.concurrent.ExecutionException;

import com.commercetools.api.defaultconfig.ApiRootBuilder;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.projects.Project;
import io.sphere.sdk.projects.queries.ProjectGet;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompatSphereClientUsageTest {
    @Test
    public void sphereCompatClient() throws ExecutionException, InterruptedException {
        final ApiHttpClient apiHttpClient = ApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(CommercetoolsTestUtils.getClientId())
                        .withClientSecret(CommercetoolsTestUtils.getClientSecret())
                        .build())
                .buildClient();

        SphereClientConfig clientConfig = SphereClientConfig.of(CommercetoolsTestUtils.getProjectKey(),
            CommercetoolsTestUtils.getClientId(), CommercetoolsTestUtils.getClientSecret());
        SphereClient client = CompatSphereClient.of(apiHttpClient, clientConfig);

        Project project = client.execute(ProjectGet.of()).toCompletableFuture().get();

        Assertions.assertThat(project).isInstanceOf(Project.class);
    }
}
