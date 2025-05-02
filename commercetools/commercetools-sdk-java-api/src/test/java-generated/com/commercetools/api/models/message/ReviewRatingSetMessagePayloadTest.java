
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewRatingSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewRatingSetMessagePayloadBuilder builder) {
        ReviewRatingSetMessagePayload reviewRatingSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(reviewRatingSetMessagePayload).isInstanceOf(ReviewRatingSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldRating", ReviewRatingSetMessagePayload.builder().oldRating(0.9492049) },
                new Object[] { "newRating", ReviewRatingSetMessagePayload.builder().newRating(0.33994043) },
                new Object[] { "includedInStatistics",
                        ReviewRatingSetMessagePayload.builder().includedInStatistics(true) },
                new Object[] { "target", ReviewRatingSetMessagePayload.builder()
                        .target(new com.commercetools.api.models.common.ReferenceImpl()) } };
    }

    @Test
    public void oldRating() {
        ReviewRatingSetMessagePayload value = ReviewRatingSetMessagePayload.of();
        value.setOldRating(0.9492049);
        Assertions.assertThat(value.getOldRating()).isEqualTo(0.9492049);
    }

    @Test
    public void newRating() {
        ReviewRatingSetMessagePayload value = ReviewRatingSetMessagePayload.of();
        value.setNewRating(0.33994043);
        Assertions.assertThat(value.getNewRating()).isEqualTo(0.33994043);
    }

    @Test
    public void includedInStatistics() {
        ReviewRatingSetMessagePayload value = ReviewRatingSetMessagePayload.of();
        value.setIncludedInStatistics(true);
        Assertions.assertThat(value.getIncludedInStatistics()).isEqualTo(true);
    }

    @Test
    public void target() {
        ReviewRatingSetMessagePayload value = ReviewRatingSetMessagePayload.of();
        value.setTarget(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getTarget()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }
}
