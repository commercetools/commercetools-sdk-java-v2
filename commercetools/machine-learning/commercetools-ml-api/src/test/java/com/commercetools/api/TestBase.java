package com.commercetools.api;

import com.commercetools.api.ml.config.MLApiRootFactory;
import com.commercetools.api.ml.generated.client.ByProjectKeyRequestBuilder;

import java.util.Optional;

public class TestBase {

    public final String projectKey = requireEnvVar("CTP_PROJECT_KEY");
    public final String clientId = requireEnvVar("CTP_CLIENT_ID");
    public final String clientSecret = requireEnvVar("CTP_CLIENT_SECRET");
    public final String tokenUrl = requireEnvVar("CTP_AUTH_URL");
    public final String ml_host = requireEnvVar("CTP_ML_API_URL");

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
