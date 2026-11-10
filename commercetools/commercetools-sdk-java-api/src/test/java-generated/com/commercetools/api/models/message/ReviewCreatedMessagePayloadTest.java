
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewCreatedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewCreatedMessagePayloadBuilder builder) {
        ReviewCreatedMessagePayload reviewCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(reviewCreatedMessagePayload).isInstanceOf(ReviewCreatedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "review",
                ReviewCreatedMessagePayload.builder().review(new com.commercetools.api.models.review.ReviewImpl()) } };
    }

    @Test
    public void review() {
        ReviewCreatedMessagePayload value = ReviewCreatedMessagePayload.of();
        value.setReview(new com.commercetools.api.models.review.ReviewImpl());
        Assertions.assertThat(value.getReview()).isEqualTo(new com.commercetools.api.models.review.ReviewImpl());
    }
}
