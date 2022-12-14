
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyImageSearchRequestBuilder imageSearch() {
        return new ByProjectKeyImageSearchRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecommendationsRequestBuilder recommendations() {
        return new ByProjectKeyRecommendationsRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeySimilaritiesRequestBuilder similarities() {
        return new ByProjectKeySimilaritiesRequestBuilder(apiHttpClient, projectKey);
    }

}
