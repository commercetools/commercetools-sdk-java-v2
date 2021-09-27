package com.commercetools.sdk.examples;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.api.models.project.Project;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStarted {

    @Test
    public void project() {
        ProjectApiRoot apiRoot = ApiRootBuilder.of().defaultClient(
                ClientCredentials.of().withClientId(System.getenv("CTP_CLIENT_ID"))
                        .withClientSecret(System.getenv("CTP_CLIENT_SECRET"))
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1).build(System.getenv("CTP_PROJECT_KEY"));

        Project response = apiRoot
                .get()
                .executeBlocking().getBody();

        Assertions.assertEquals(System.getenv("CTP_PROJECT_KEY"), response.getKey());
    }
}
