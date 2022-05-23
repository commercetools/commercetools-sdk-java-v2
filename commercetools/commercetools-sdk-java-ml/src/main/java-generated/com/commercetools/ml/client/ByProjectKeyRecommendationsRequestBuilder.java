
package com.commercetools.ml.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyRecommendationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyRecommendationsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyRecommendationsProjectCategoriesRequestBuilder projectCategories() {
        return new ByProjectKeyRecommendationsProjectCategoriesRequestBuilder(apiHttpClient, projectKey);
    }

    public ByProjectKeyRecommendationsGeneralCategoriesRequestBuilder generalCategories() {
        return new ByProjectKeyRecommendationsGeneralCategoriesRequestBuilder(apiHttpClient, projectKey);
    }
}
