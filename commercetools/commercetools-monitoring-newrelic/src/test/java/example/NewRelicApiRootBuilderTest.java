
package example;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.monitoring.newrelic.NewRelicContext;
import com.commercetools.monitoring.newrelic.NewRelicTelemetryMiddleware;
import com.newrelic.api.agent.NewRelic;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ContextApiHttpClient;

public class NewRelicApiRootBuilderTest {

    String projectKey;

    ApiHttpClient apiHttpClient;

    public void addNewRelic() {
        ApiHttpClient client = ApiRootBuilder.of()
                .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
                .withTelemetryMiddleware(new NewRelicTelemetryMiddleware())
                .buildClient();
    }

    public void contextClient() {
        ContextApiHttpClient contextClient = ContextApiHttpClient.of(apiHttpClient,
            NewRelicContext.of(NewRelic.getAgent().getTransaction()), false // don't close the ApiHttpClient
        );
        ProjectApiRoot apiRoot = ProjectApiRoot.fromClient(projectKey, contextClient);
    }

    public void contextApiRoot() {
        ProjectApiRoot apiRoot = ProjectApiRoot.withContext(projectKey, apiHttpClient,
            NewRelicContext.of(NewRelic.getAgent().getTransaction()), false // don't close the apiHttpClient
        );
    }
}
