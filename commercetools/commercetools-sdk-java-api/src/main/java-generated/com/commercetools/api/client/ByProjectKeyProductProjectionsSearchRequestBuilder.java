
package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsSearchRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductProjectionsSearchRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductProjectionsSearchPost post(List<ApiMethod.ParamEntry<String, String>> formParams) {
        return new ByProjectKeyProductProjectionsSearchPost(apiHttpClient, projectKey, formParams);
    }

    public ByProjectKeyProductProjectionsSearchPost post() {
        return new ByProjectKeyProductProjectionsSearchPost(apiHttpClient, projectKey, new ArrayList<>());
    }

    public ByProjectKeyProductProjectionsSearchGet get() {
        return new ByProjectKeyProductProjectionsSearchGet(apiHttpClient, projectKey);
    }

}
