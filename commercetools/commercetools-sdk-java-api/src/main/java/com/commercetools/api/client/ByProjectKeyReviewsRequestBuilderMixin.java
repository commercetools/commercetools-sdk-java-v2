
package com.commercetools.api.client;

import java.util.List;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewDraft;
import com.commercetools.api.models.review.ReviewDraftBuilder;
import com.commercetools.api.models.review.ReviewUpdate;
import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewUpdateActionBuilder;

public interface ByProjectKeyReviewsRequestBuilderMixin {
    public ByProjectKeyReviewsPost post(ReviewDraft reviewDraft);

    public ByProjectKeyReviewsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyReviewsByIDPost update(Versioned<Review> review, List<ReviewUpdateAction> actions) {
        return withId(review.getId())
                .post(builder -> ReviewUpdate.builder().version(review.getVersion()).actions(actions));
    }

    public default ByProjectKeyReviewsByIDPost update(Versioned<Review> review,
            UnaryOperator<UpdateActionBuilder<ReviewUpdateAction, ReviewUpdateActionBuilder>> op) {
        return withId(review.getId()).post(builder -> ReviewUpdate.builder()
                .version(review.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(ReviewUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<ReviewUpdateAction, ReviewUpdateActionBuilder, ByProjectKeyReviewsByIDPost> update(
            Versioned<Review> review) {
        return builder -> withId(review.getId()).post(b -> ReviewUpdate.builder()
                .version(review.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(ReviewUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyReviewsByIDDelete delete(Versioned<Review> review) {
        return withId(review.getId()).delete().withVersion(review.getVersion());
    }

    public default ByProjectKeyReviewsPost create(ReviewDraft reviewDraft) {
        return post(reviewDraft);
    }

    public default ByProjectKeyReviewsPost create(UnaryOperator<ReviewDraftBuilder> op) {
        return post(op.apply(ReviewDraftBuilder.of()).build());
    }
}
