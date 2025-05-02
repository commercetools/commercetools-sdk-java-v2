
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewRatingStatisticsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewRatingStatisticsBuilder builder) {
        ReviewRatingStatistics reviewRatingStatistics = builder.buildUnchecked();
        Assertions.assertThat(reviewRatingStatistics).isInstanceOf(ReviewRatingStatistics.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "averageRating", ReviewRatingStatistics.builder().averageRating(6) },
                new Object[] { "highestRating", ReviewRatingStatistics.builder().highestRating(4) },
                new Object[] { "lowestRating", ReviewRatingStatistics.builder().lowestRating(8) },
                new Object[] { "count", ReviewRatingStatistics.builder().count(2) },
                new Object[] { "ratingsDistribution",
                        ReviewRatingStatistics.builder().ratingsDistribution("ratingsDistribution") } };
    }

    @Test
    public void averageRating() {
        ReviewRatingStatistics value = ReviewRatingStatistics.of();
        value.setAverageRating(6);
        Assertions.assertThat(value.getAverageRating()).isEqualTo(6);
    }

    @Test
    public void highestRating() {
        ReviewRatingStatistics value = ReviewRatingStatistics.of();
        value.setHighestRating(4);
        Assertions.assertThat(value.getHighestRating()).isEqualTo(4);
    }

    @Test
    public void lowestRating() {
        ReviewRatingStatistics value = ReviewRatingStatistics.of();
        value.setLowestRating(8);
        Assertions.assertThat(value.getLowestRating()).isEqualTo(8);
    }

    @Test
    public void count() {
        ReviewRatingStatistics value = ReviewRatingStatistics.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }

    @Test
    public void ratingsDistribution() {
        ReviewRatingStatistics value = ReviewRatingStatistics.of();
        value.setRatingsDistribution("ratingsDistribution");
        Assertions.assertThat(value.getRatingsDistribution()).isEqualTo("ratingsDistribution");
    }
}
