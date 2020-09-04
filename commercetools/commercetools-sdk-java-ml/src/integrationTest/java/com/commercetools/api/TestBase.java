package com.commercetools.api;

import com.commercetools.ml.defaultconfig.MLApiRootFactory;
import com.commercetools.ml.client.ByProjectKeyRequestBuilder;
import com.commercetools.ml.defaultconfig.ServiceHosts;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import java.util.Optional;

public class TestBase {

    public final String projectKey = requireEnvVar("CTP_PROJECT_KEY");
    public final String clientId = requireEnvVar("CTP_CLIENT_ID");
    public final String clientSecret = requireEnvVar("CTP_CLIENT_SECRET");
    public final String tokenUrl = ServiceHosts.GCP_EUROPE.getOAuthTokenUrl();
    public final String ml_host = ServiceHosts.GCP_EUROPE.getApiUrl();

    public final ByProjectKeyRequestBuilder mlApiBuilder = MLApiRootFactory.create(
            ClientCredentials.of().withClientId(clientId)
                .withClientSecret(clientSecret)
                .withScopes("")
                .build(),
            tokenUrl,
            ml_host)
            .withProjectKey(projectKey);

    public static String requireEnvVar(String varName) {
        return Optional.ofNullable(System.getenv(varName)).orElseThrow(() -> new RuntimeException("Cannot find environment variable '" + varName + "'"));
    }

}
