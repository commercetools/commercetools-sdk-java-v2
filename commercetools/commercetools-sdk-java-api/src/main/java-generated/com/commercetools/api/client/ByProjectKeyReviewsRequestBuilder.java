package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyReviewsRequestBuilder implements ByProjectKeyReviewsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyReviewsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyReviewsGet get() {
        return new ByProjectKeyReviewsGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyReviewsPost post(com.commercetools.api.models.review.ReviewDraft reviewDraft) {
        return new ByProjectKeyReviewsPost(apiHttpClient, projectKey, reviewDraft);
    }
    
    
    public ByProjectKeyReviewsPostString post(final String reviewDraft) {
        return new ByProjectKeyReviewsPostString(apiHttpClient, projectKey, reviewDraft);
    }
    public ByProjectKeyReviewsPost post(UnaryOperator<com.commercetools.api.models.review.ReviewDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.review.ReviewDraftBuilder.of()).build());
    }

    
    public ByProjectKeyReviewsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyReviewsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyReviewsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyReviewsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
