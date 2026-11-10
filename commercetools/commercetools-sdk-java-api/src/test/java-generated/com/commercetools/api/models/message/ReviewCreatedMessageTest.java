
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewCreatedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewCreatedMessageBuilder builder) {
        ReviewCreatedMessage reviewCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(reviewCreatedMessage).isInstanceOf(ReviewCreatedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "review",
                ReviewCreatedMessage.builder().review(new com.commercetools.api.models.review.ReviewImpl()) } };
    }

    @Test
    public void review() {
        ReviewCreatedMessage value = ReviewCreatedMessage.of();
        value.setReview(new com.commercetools.api.models.review.ReviewImpl());
        Assertions.assertThat(value.getReview()).isEqualTo(new com.commercetools.api.models.review.ReviewImpl());
    }
}
