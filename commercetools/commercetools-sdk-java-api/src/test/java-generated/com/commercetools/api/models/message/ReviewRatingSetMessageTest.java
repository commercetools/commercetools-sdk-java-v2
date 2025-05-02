
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewRatingSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewRatingSetMessageBuilder builder) {
        ReviewRatingSetMessage reviewRatingSetMessage = builder.buildUnchecked();
        Assertions.assertThat(reviewRatingSetMessage).isInstanceOf(ReviewRatingSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "oldRating", ReviewRatingSetMessage.builder().oldRating(0.9492049) },
                new Object[] { "newRating", ReviewRatingSetMessage.builder().newRating(0.33994043) },
                new Object[] { "includedInStatistics", ReviewRatingSetMessage.builder().includedInStatistics(true) },
                new Object[] { "target", ReviewRatingSetMessage.builder()
                        .target(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void oldRating() {
        ReviewRatingSetMessage value = ReviewRatingSetMessage.of();
        value.setOldRating(0.9492049);
        Assertions.assertThat(value.getOldRating()).isEqualTo(0.9492049);
    }

    @Test
    public void newRating() {
        ReviewRatingSetMessage value = ReviewRatingSetMessage.of();
        value.setNewRating(0.33994043);
        Assertions.assertThat(value.getNewRating()).isEqualTo(0.33994043);
    }

    @Test
    public void includedInStatistics() {
        ReviewRatingSetMessage value = ReviewRatingSetMessage.of();
        value.setIncludedInStatistics(true);
        Assertions.assertThat(value.getIncludedInStatistics()).isEqualTo(true);
    }

    @Test
    public void target() {
        ReviewRatingSetMessage value = ReviewRatingSetMessage.of();
        value.setTarget(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getTarget()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
