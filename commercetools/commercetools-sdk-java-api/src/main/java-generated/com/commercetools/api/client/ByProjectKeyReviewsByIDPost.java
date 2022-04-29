
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyReviewsByIDPost extends
        BodyApiMethod<ByProjectKeyReviewsByIDPost, com.commercetools.api.models.review.Review, com.commercetools.api.models.review.ReviewUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyReviewsByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyReviewsByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyReviewsByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyReviewsByIDPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.review.ReviewUpdate reviewUpdate;

    public ByProjectKeyReviewsByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.review.ReviewUpdate reviewUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.reviewUpdate = reviewUpdate;
    }

    public ByProjectKeyReviewsByIDPost(ByProjectKeyReviewsByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.reviewUpdate = t.reviewUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/reviews/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(reviewUpdate)));

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

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyReviewsByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyReviewsByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyReviewsByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyReviewsByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyReviewsByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyReviewsByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyReviewsByIDPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyReviewsByIDPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.review.ReviewUpdate getBody() {
        return reviewUpdate;
    }

    public ByProjectKeyReviewsByIDPost withBody(com.commercetools.api.models.review.ReviewUpdate reviewUpdate) {
        ByProjectKeyReviewsByIDPost t = copy();
        t.reviewUpdate = reviewUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyReviewsByIDPost that = (ByProjectKeyReviewsByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(reviewUpdate, that.reviewUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(reviewUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyReviewsByIDPost copy() {
        return new ByProjectKeyReviewsByIDPost(this);
    }
}
