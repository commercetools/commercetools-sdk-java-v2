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
public class ByProjectKeyReviewsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyReviewsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyReviewsKeyByKeyGet get() {
        return new ByProjectKeyReviewsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyReviewsKeyByKeyPost post(com.commercetools.api.models.review.ReviewUpdate reviewUpdate) {
        return new ByProjectKeyReviewsKeyByKeyPost(apiHttpClient, projectKey, key, reviewUpdate);
    }
    
    
    public ByProjectKeyReviewsKeyByKeyPostString post(final String reviewUpdate) {
        return new ByProjectKeyReviewsKeyByKeyPostString(apiHttpClient, projectKey, key, reviewUpdate);
    }
    public ByProjectKeyReviewsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.review.ReviewUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.review.ReviewUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyReviewsKeyByKeyDelete delete() {
        return new ByProjectKeyReviewsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyReviewsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
