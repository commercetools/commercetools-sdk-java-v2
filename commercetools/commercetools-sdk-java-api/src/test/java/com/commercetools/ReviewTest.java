
package com.commercetools;

import static com.commercetools.TestUtils.stringFromResource;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.review.Review;
import com.commercetools.api.models.review.ReviewDraft;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReviewTest {

    @Test
    public void productReview() throws IOException {
        Review review = JsonUtils.fromJsonString(stringFromResource("product-review.json"), Review.class);

        assertThat(review.getTarget()).isInstanceOf(ProductReference.class);
    }

    @Test
    public void channelReview() throws IOException {
        Review review = JsonUtils.fromJsonString(stringFromResource("channel-review.json"), Review.class);

        assertThat(review.getTarget()).isInstanceOf(ChannelReference.class);
    }

    @Test
    public void setProductReview() {
        Review review = Review.of();
        review.setTarget(ProductReference.of());

        assertThat(review.getTarget()).isInstanceOf(ProductReference.class);
    }

    @Test
    public void setChannelReview() {
        Review review = Review.of();
        review.setTarget(ChannelReference.of());

        assertThat(review.getTarget()).isInstanceOf(ChannelReference.class);
    }

    @Test
    public void setObjectReview() {
        Review review = Review.of();
        review.setTarget((Object) ProductReference.of());

        assertThat(review.getTarget()).isInstanceOf(ProductReference.class);
    }

    @Test
    public void setInvalidObjectReview() {
        Review review = Review.of();
        Assertions.assertThatThrownBy(() -> {
            review.setTarget(ChannelResourceIdentifier.of());
        }).isInstanceOfAny(AssertionError.class, ClassCastException.class);
    }

    @Test
    public void productReviewDraft() throws IOException {
        ReviewDraft review = JsonUtils.fromJsonString(stringFromResource("product-review.json"), ReviewDraft.class);

        assertThat(review.getTarget()).isInstanceOf(ProductResourceIdentifier.class);
    }

    @Test
    public void channelReviewDraft() throws IOException {
        ReviewDraft review = JsonUtils.fromJsonString(stringFromResource("channel-review.json"), ReviewDraft.class);

        assertThat(review.getTarget()).isInstanceOf(ChannelResourceIdentifier.class);
    }

    @Test
    public void setProductReviewDraft() {
        ReviewDraft review = ReviewDraft.of();
        review.setTarget(ProductResourceIdentifier.of());

        assertThat(review.getTarget()).isInstanceOf(ProductResourceIdentifier.class);
    }

    @Test
    public void setChannelReviewDraft() {
        ReviewDraft review = ReviewDraft.of();
        review.setTarget(ChannelResourceIdentifier.of());

        assertThat(review.getTarget()).isInstanceOf(ChannelResourceIdentifier.class);
    }

    @Test
    public void setObjectReviewDraft() {
        ReviewDraft review = ReviewDraft.of();
        review.setTarget((Object) ProductResourceIdentifier.of());

        assertThat(review.getTarget()).isInstanceOf(ProductResourceIdentifier.class);
    }

    @Test
    public void setInvalidObjectReviewDraft() {
        ReviewDraft review = ReviewDraft.of();
        Assertions.assertThatThrownBy(() -> {
            review.setTarget((Object) ChannelReference.of());
        }).isInstanceOfAny(AssertionError.class, ClassCastException.class);
    }

    @Test
    public void serializeDraft() throws JsonProcessingException {
        ReviewDraft draft = ReviewDraft.of();
        draft.setTarget(ProductResourceIdentifier.of());
        String s = JsonUtils.toJsonString(draft);
        Assertions.assertThat(s).isEqualTo("{\"target\":{\"typeId\":\"product\"}}");
    }

    @Test
    public void serialize() throws JsonProcessingException {
        Review review = Review.of();
        review.setTarget(ProductReference.of());
        String s = JsonUtils.toJsonString(review);
        Assertions.assertThat(s).isEqualTo("{\"target\":{\"typeId\":\"product\"}}");
    }
}
