
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyProductProjectionsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductProjectionsKeyByKeyGet get() {
        return new ByProjectKeyProductProjectionsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

}
