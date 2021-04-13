package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String passwordToken;
    

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String passwordToken) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.passwordToken = passwordToken;
    }

    public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet get() {
        return new ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(apiHttpClient, projectKey, passwordToken);
    }

}
