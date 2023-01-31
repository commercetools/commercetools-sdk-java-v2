
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyReviewsRequestBuilder implements ByProjectKeyReviewsRequestBuilderMixin {

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

    public ByProjectKeyReviewsPost post(UnaryOperator<com.commercetools.api.models.review.ReviewDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.review.ReviewDraftBuilder.of()).build());
    }

    public ByProjectKeyReviewsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyReviewsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyReviewsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyReviewsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyReviewsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.review.Review> review,
            java.util.List<com.commercetools.api.models.review.ReviewUpdateAction> actions) {
        return withId(review.getId()).post(builder -> com.commercetools.api.models.review.ReviewUpdate.builder()
                .version(review.getVersion())
                .actions(actions));
    }

    public ByProjectKeyReviewsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.review.Review> review,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.review.ReviewUpdateAction, com.commercetools.api.models.review.ReviewUpdateActionBuilder>> op) {
        return withId(review.getId()).post(builder -> com.commercetools.api.models.review.ReviewUpdate.builder()
                .version(review.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.review.ReviewUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.review.ReviewUpdateAction, com.commercetools.api.models.review.ReviewUpdateActionBuilder, ByProjectKeyReviewsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.review.Review> review) {
        return builder -> withId(review.getId()).post(b -> com.commercetools.api.models.review.ReviewUpdate.builder()
                .version(review.getVersion())
                .actions(builder.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.review.ReviewUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyReviewsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.review.Review> review) {
        return withId(review.getId()).delete().withVersion(review.getVersion());
    }

    public ByProjectKeyReviewsPost create(com.commercetools.api.models.review.ReviewDraft reviewDraft) {
        return post(reviewDraft);
    }

    public ByProjectKeyReviewsPost create(UnaryOperator<com.commercetools.api.models.review.ReviewDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.review.ReviewDraftBuilder.of()).build());
    }

}
