
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewSetRatingActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewSetRatingActionBuilder builder) {
        ReviewSetRatingAction reviewSetRatingAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetRatingAction).isInstanceOf(ReviewSetRatingAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "rating", ReviewSetRatingAction.builder().rating(5) } };
    }

    @Test
    public void rating() {
        ReviewSetRatingAction value = ReviewSetRatingAction.of();
        value.setRating(5);
        Assertions.assertThat(value.getRating()).isEqualTo(5);
    }
}
