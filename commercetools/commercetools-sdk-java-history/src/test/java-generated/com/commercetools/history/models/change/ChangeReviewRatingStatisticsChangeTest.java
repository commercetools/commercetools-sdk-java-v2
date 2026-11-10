
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeReviewRatingStatisticsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeReviewRatingStatisticsChangeBuilder builder) {
        ChangeReviewRatingStatisticsChange changeReviewRatingStatisticsChange = builder.buildUnchecked();
        Assertions.assertThat(changeReviewRatingStatisticsChange)
                .isInstanceOf(ChangeReviewRatingStatisticsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", ChangeReviewRatingStatisticsChange.builder().change("change") },
                new Object[] { "previousValue", ChangeReviewRatingStatisticsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ReviewRatingStatisticsImpl()) },
                new Object[] { "nextValue", ChangeReviewRatingStatisticsChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReviewRatingStatisticsImpl()) } };
    }

    @Test
    public void change() {
        ChangeReviewRatingStatisticsChange value = ChangeReviewRatingStatisticsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeReviewRatingStatisticsChange value = ChangeReviewRatingStatisticsChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReviewRatingStatisticsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReviewRatingStatisticsImpl());
    }

    @Test
    public void nextValue() {
        ChangeReviewRatingStatisticsChange value = ChangeReviewRatingStatisticsChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReviewRatingStatisticsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReviewRatingStatisticsImpl());
    }
}
