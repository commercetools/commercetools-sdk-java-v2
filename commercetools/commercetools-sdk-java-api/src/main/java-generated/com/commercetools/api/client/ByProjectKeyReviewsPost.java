
package com.commercetools.api.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Create Review</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyReviewsPost
        extends ApiMethod<ByProjectKeyReviewsPost, com.commercetools.api.models.review.Review>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyReviewsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyReviewsPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyReviewsPost> {

    private String projectKey;

    private com.commercetools.api.models.review.ReviewDraft reviewDraft;

    public ByProjectKeyReviewsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.review.ReviewDraft reviewDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.reviewDraft = reviewDraft;
    }

    public ByProjectKeyReviewsPost(ByProjectKeyReviewsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.reviewDraft = t.reviewDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/reviews", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(reviewDraft);
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), body);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.review.Review> executeBlocking(Duration timeout) {
        return blockingWait(execute(), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.review.Review>> execute() {
        return apiHttpClient().execute(this.createHttpRequest(), com.commercetools.api.models.review.Review.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public ByProjectKeyReviewsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyReviewsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyReviewsPost copy() {
        return new ByProjectKeyReviewsPost(this);
    }
}
