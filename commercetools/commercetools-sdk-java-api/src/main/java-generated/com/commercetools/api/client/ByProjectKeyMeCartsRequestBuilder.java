
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeCartsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMeCartsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeCartsGet get() {
        return new ByProjectKeyMeCartsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyMeCartsPost post(com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        return new ByProjectKeyMeCartsPost(apiHttpClient, projectKey, myCartDraft);
    }

    public ByProjectKeyMeCartsPostString post(final String myCartDraft) {
        return new ByProjectKeyMeCartsPostString(apiHttpClient, projectKey, myCartDraft);
    }

    public ByProjectKeyMeCartsPost post(UnaryOperator<com.commercetools.api.models.me.MyCartDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyCartDraftBuilder.of()).build());
    }

    public ByProjectKeyMeCartsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyMeCartsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeCartsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyMeCartsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyMeCartsReplicateRequestBuilder replicate() {
        return new ByProjectKeyMeCartsReplicateRequestBuilder(apiHttpClient, projectKey);
    }

}
