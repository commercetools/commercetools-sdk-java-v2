
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyReviewsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyReviewsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyReviewsGet get() {
        return new ByProjectKeyReviewsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyReviewsPost post(com.commercetools.api.models.review.ReviewDraft reviewDraft) {
        return new ByProjectKeyReviewsPost(apiHttpClient, projectKey, reviewDraft);
    }

    public ByProjectKeyReviewsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyReviewsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyReviewsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyReviewsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
