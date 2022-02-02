
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyReviewsPost extends
        BodyApiMethod<ByProjectKeyReviewsPost, com.commercetools.api.models.review.Review, com.commercetools.api.models.review.ReviewDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyReviewsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyReviewsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyReviewsPost> {

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
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(reviewDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.review.Review> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.review.Review.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.review.Review>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.review.Review.class);
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

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyReviewsPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyReviewsPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyReviewsPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyReviewsPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.review.ReviewDraft getBody() {
        return reviewDraft;
    }

    public ByProjectKeyReviewsPost withBody(com.commercetools.api.models.review.ReviewDraft reviewDraft) {
        ByProjectKeyReviewsPost t = copy();
        t.reviewDraft = reviewDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyReviewsPost that = (ByProjectKeyReviewsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(reviewDraft, that.reviewDraft).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(reviewDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyReviewsPost copy() {
        return new ByProjectKeyReviewsPost(this);
    }
}
