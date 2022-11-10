
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeSignupRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMeSignupRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeSignupPost post(com.commercetools.api.models.me.MyCustomerDraft myCustomerDraft) {
        return new ByProjectKeyMeSignupPost(apiHttpClient, projectKey, myCustomerDraft);
    }

    public ByProjectKeyMeSignupPost post(UnaryOperator<com.commercetools.api.models.me.MyCustomerDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyCustomerDraftBuilder.of()).build());
    }

}
