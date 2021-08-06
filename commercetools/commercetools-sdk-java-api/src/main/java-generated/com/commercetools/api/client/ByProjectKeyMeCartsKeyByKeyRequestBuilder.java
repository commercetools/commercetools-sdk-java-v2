
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyMeCartsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyMeCartsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeCartsKeyByKeyGet get() {
        return new ByProjectKeyMeCartsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyMeCartsKeyByKeyPost post(com.commercetools.api.models.me.MyCartUpdate myCartUpdate) {
        return new ByProjectKeyMeCartsKeyByKeyPost(apiHttpClient, projectKey, key, myCartUpdate);
    }

    public ByProjectKeyMeCartsKeyByKeyDelete delete() {
        return new ByProjectKeyMeCartsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
