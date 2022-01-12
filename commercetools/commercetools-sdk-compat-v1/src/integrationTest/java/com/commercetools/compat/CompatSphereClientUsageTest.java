
package com.commercetools.compat;

import java.util.concurrent.ExecutionException;

import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientConfig;
import io.sphere.sdk.projects.Project;
import io.sphere.sdk.projects.queries.ProjectGet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompatSphereClientUsageTest {
    @Test
    public void sphereCompatClient() throws ExecutionException, InterruptedException {
        SphereClientConfig clientConfig = SphereClientConfig.of(CommercetoolsTestUtils.getProjectKey(),
            CommercetoolsTestUtils.getClientId(), CommercetoolsTestUtils.getClientSecret());
        SphereClient client = CompatSphereClient.of(clientConfig);

        Project project = client.execute(ProjectGet.of()).toCompletableFuture().get();

        Assertions.assertThat(project).isInstanceOf(Project.class);
    }
}
