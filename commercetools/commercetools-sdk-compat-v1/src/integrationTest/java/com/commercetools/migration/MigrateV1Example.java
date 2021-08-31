
package com.commercetools.migration;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientFactory;

public interface MigrateV1Example {
    void v1() throws ExecutionException, InterruptedException;

    default SphereClient sphereClient() {
        return SphereClientFactory.of().createClient("projectKey", "clientId", "clientSecret");
    }

    default BlockingSphereClient blockingClient() {
        return BlockingSphereClient.of(sphereClient(), 20, TimeUnit.SECONDS);
    }
}
