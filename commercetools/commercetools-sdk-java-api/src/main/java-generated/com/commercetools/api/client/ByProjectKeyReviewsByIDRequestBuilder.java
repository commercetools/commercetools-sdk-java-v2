
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyReviewsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyReviewsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyReviewsByIDGet get() {
        return new ByProjectKeyReviewsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyReviewsByIDHead head() {
        return new ByProjectKeyReviewsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyReviewsByIDPost post(com.commercetools.api.models.review.ReviewUpdate reviewUpdate) {
        return new ByProjectKeyReviewsByIDPost(apiHttpClient, projectKey, ID, reviewUpdate);
    }

    public ByProjectKeyReviewsByIDPostString post(final String reviewUpdate) {
        return new ByProjectKeyReviewsByIDPostString(apiHttpClient, projectKey, ID, reviewUpdate);
    }

    public ByProjectKeyReviewsByIDPost post(UnaryOperator<com.commercetools.api.models.review.ReviewUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.review.ReviewUpdateBuilder.of()).build());
    }

    public ByProjectKeyReviewsByIDDelete delete() {
        return new ByProjectKeyReviewsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyReviewsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
