package com.commercetools.benchmark;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.http.apachehttp.CtApacheHttpClient;
import com.commercetools.http.asynchttp.CtAsyncHttpClient;
import com.commercetools.http.okhttp4.CtOkHttp4Client;
import io.sphere.sdk.client.BlockingSphereClient;
import io.sphere.sdk.client.SphereClient;
import io.sphere.sdk.client.SphereClientFactory;
import io.sphere.sdk.projects.queries.ProjectGet;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.openjdk.jmh.annotations.*;

import java.time.Duration;

public class ClientBenchmark {
    @State(Scope.Benchmark)
    public static class ClientState {
        private ProjectApiRoot ahcApiRoot;

        private ProjectApiRoot apacheApiRoot;

        private ProjectApiRoot okhttpApiRoot;

        private BlockingSphereClient sphereClient;

        @Setup(Level.Trial)
        public void init() {
            ahcApiRoot = ApiRootBuilder.of(new CtAsyncHttpClient())
                    .defaultClient(
                            ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                            ServiceRegion.GCP_EUROPE_WEST1)
                    .build(getProjectKey());

            apacheApiRoot = ApiRootBuilder.of(new CtApacheHttpClient())
                    .defaultClient(
                            ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                            ServiceRegion.GCP_EUROPE_WEST1)
                    .build(getProjectKey());

            okhttpApiRoot = ApiRootBuilder.of(new CtOkHttp4Client())
                    .defaultClient(
                            ClientCredentials.of().withClientId(getClientId()).withClientSecret(getClientSecret()).build(),
                            ServiceRegion.GCP_EUROPE_WEST1)
                    .build(getProjectKey());

            final SphereClientFactory factory = SphereClientFactory.of();
            final SphereClient client = factory.createClient(
                    getProjectKey(), //replace with your project key
                    getClientId(), //replace with your client id
                    getClientSecret()); //replace with your client secret

            sphereClient = BlockingSphereClient.of(client, Duration.ofSeconds(10));
        }

        @TearDown(Level.Trial)
        public void tearDown() {
            ahcApiRoot.close();
            apacheApiRoot.close();
            okhttpApiRoot.close();
            sphereClient.close();
        }
    }

    @Benchmark
    public void retrieveProjectV2_AHC(ClientState state) {
        state.ahcApiRoot.get().executeBlocking();
    }

    @Benchmark
    public void retrieveProjectV2_Apache(ClientState state) {
        state.apacheApiRoot.get().executeBlocking();
    }

    @Benchmark
    public void retrieveProjectV2_OkHttp(ClientState state) {
        state.okhttpApiRoot.get().executeBlocking();
    }

    @Benchmark
    public void retrieveProjectV1_AHC(ClientState state) {
        state.sphereClient.executeBlocking(ProjectGet.of());
    }

    public static String getProjectKey() {
        return System.getenv("CTP_PROJECT_KEY");
    }

    public static String getClientId() {
        return System.getenv("CTP_CLIENT_ID");
    }

    public static String getClientSecret() {
        return System.getenv("CTP_CLIENT_SECRET");
    }

}
