package com.commercetools.sdk.examples;

import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.project.Project;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStarted {

    @Test
    public void project() {
        ApiRoot apiRoot = ApiFactory.create(
                ClientCredentials.of().withClientId(System.getenv("CTP_CLIENT_ID"))
                        .withClientSecret(System.getenv("CTP_CLIENT_SECRET"))
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
                ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());

        Project response = apiRoot.withProjectKey(System.getenv("CTP_PROJECT_KEY"))
                .get()
                .executeBlocking().getBody();

        Assertions.assertEquals(System.getenv("CTP_PROJECT_KEY"), response.getKey());
    }
}
