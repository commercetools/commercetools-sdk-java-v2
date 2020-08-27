package com.commercetools.api;

import com.commercetools.ml.defaultconfig.MLApiRootFactory;
import com.commercetools.ml.client.ByProjectKeyRequestBuilder;

import java.util.Optional;

public class TestBase {

    public final String projectKey = requireEnvVar("CTP_PROJECT_KEY");
    public final String clientId = requireEnvVar("CTP_CLIENT_ID");
    public final String clientSecret = requireEnvVar("CTP_CLIENT_SECRET");
    public final String tokenUrl = "https://auth.europe-west1.gcp.commercetools.com/oauth/token";
    public final String ml_host = "https://ml-eu.europe-west1.gcp.commercetools.com";

    public final ByProjectKeyRequestBuilder mlApiBuilder = MLApiRootFactory.create(clientId,
            clientSecret,
            "",
            tokenUrl,
            ml_host)
            .withProjectKey(projectKey);

    public static String requireEnvVar(String varName) {
        return Optional.ofNullable(System.getenv(varName)).orElseThrow(() -> new RuntimeException("Cannot find environment variable '" + varName + "'"));
    }

}
