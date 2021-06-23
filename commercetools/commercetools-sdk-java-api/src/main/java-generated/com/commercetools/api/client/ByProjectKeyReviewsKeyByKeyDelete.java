
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
*  <p>Delete Review by key</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyReviewsKeyByKeyDelete
        extends ApiMethod<ByProjectKeyReviewsKeyByKeyDelete, com.commercetools.api.models.review.Review>
        implements com.commercetools.api.client.DataerasureTrait<ByProjectKeyReviewsKeyByKeyDelete>,
        com.commercetools.api.client.VersionedTrait<ByProjectKeyReviewsKeyByKeyDelete>,
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyReviewsKeyByKeyDelete>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyReviewsKeyByKeyDelete>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyReviewsKeyByKeyDelete>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyReviewsKeyByKeyDelete> {

    private String projectKey;
    private String key;

    public ByProjectKeyReviewsKeyByKeyDelete(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyReviewsKeyByKeyDelete(ByProjectKeyReviewsKeyByKeyDelete t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/reviews/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }

        return new ApiHttpRequest(ApiHttpMethod.DELETE, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.review.Review> executeBlocking(final ApiHttpClient client,
            Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.api.models.review.Review.class), request,
            timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.review.Review>> execute(
            final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), com.commercetools.api.models.review.Review.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getDataErasure() {
        return this.getQueryParam("dataErasure");
    }

    public List<String> getVersion() {
        return this.getQueryParam("version");
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

    public ByProjectKeyReviewsKeyByKeyDelete withDataErasure(final boolean dataErasure) {
        return copy().withQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyReviewsKeyByKeyDelete addDataErasure(final boolean dataErasure) {
        return copy().addQueryParam("dataErasure", dataErasure);
    }

    public ByProjectKeyReviewsKeyByKeyDelete withVersion(final long version) {
        return copy().withQueryParam("version", version);
    }

    public ByProjectKeyReviewsKeyByKeyDelete addVersion(final long version) {
        return copy().addQueryParam("version", version);
    }

    public ByProjectKeyReviewsKeyByKeyDelete withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    public ByProjectKeyReviewsKeyByKeyDelete addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    @Override
    protected ByProjectKeyReviewsKeyByKeyDelete copy() {
        return new ByProjectKeyReviewsKeyByKeyDelete(this);
    }
}
