
package com.commercetools.history.models.change;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ChangeReviewRatingStatisticsChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeReviewRatingStatisticsChangeBuilder builder) {
        ChangeReviewRatingStatisticsChange changeReviewRatingStatisticsChange = builder.buildUnchecked();
        Assertions.assertThat(changeReviewRatingStatisticsChange)
                .isInstanceOf(ChangeReviewRatingStatisticsChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeReviewRatingStatisticsChange.builder().change("change") },
                new Object[] { ChangeReviewRatingStatisticsChange.builder()
                        .previousValue(new com.commercetools.history.models.common.ReviewRatingStatisticsImpl()) },
                new Object[] { ChangeReviewRatingStatisticsChange.builder()
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
