
package com.commercetools.api;

import java.util.Optional;

import com.commercetools.ml.client.ByProjectKeyRequestBuilder;
import com.commercetools.ml.defaultconfig.MLApiRootFactory;
import com.commercetools.ml.defaultconfig.ServiceRegion;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

public class TestBase {

    public final String projectKey = requireEnvVar("CTP_PROJECT_KEY");
    public final String clientId = requireEnvVar("CTP_CLIENT_ID");
    public final String clientSecret = requireEnvVar("CTP_CLIENT_SECRET");
    public final String tokenUrl = ServiceRegion.GCP_EUROPE.getOAuthTokenUrl();
    public final String ml_host = ServiceRegion.GCP_EUROPE.getApiUrl();

    public final ByProjectKeyRequestBuilder mlApiBuilder = MLApiRootFactory.createForProject(projectKey,
        ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build(), tokenUrl, ml_host);

    public static String requireEnvVar(String varName) {
        return Optional.ofNullable(System.getenv(varName))
                .orElseThrow(() -> new RuntimeException("Cannot find environment variable '" + varName + "'"));
    }

}
