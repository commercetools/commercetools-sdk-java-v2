
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
*  <p>Update Review by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyReviewsKeyByKeyPost
        extends ApiMethod<ByProjectKeyReviewsKeyByKeyPost, com.commercetools.api.models.review.Review>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyReviewsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyReviewsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyReviewsKeyByKeyPost>,
        com.commercetools.api.client.DeprecatableTrait<ByProjectKeyReviewsKeyByKeyPost> {

    private String projectKey;
    private String key;

    private com.commercetools.api.models.review.ReviewUpdate reviewUpdate;

    public ByProjectKeyReviewsKeyByKeyPost(final ApiHttpClient apiHttpClient, String projectKey, String key,
            com.commercetools.api.models.review.ReviewUpdate reviewUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
        this.reviewUpdate = reviewUpdate;
    }

    public ByProjectKeyReviewsKeyByKeyPost(ByProjectKeyReviewsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
        this.reviewUpdate = t.reviewUpdate;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/reviews/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            final byte[] body = apiHttpClient().getSerializerService().toJsonByteArray(reviewUpdate);
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

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ByProjectKeyReviewsKeyByKeyPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyReviewsKeyByKeyPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyReviewsKeyByKeyPost copy() {
        return new ByProjectKeyReviewsKeyByKeyPost(this);
    }
}
