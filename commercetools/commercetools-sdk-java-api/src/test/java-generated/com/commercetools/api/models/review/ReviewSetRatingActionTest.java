
package com.commercetools.api.models.review;

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
public class ReviewSetRatingActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewSetRatingActionBuilder builder) {
        ReviewSetRatingAction reviewSetRatingAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetRatingAction).isInstanceOf(ReviewSetRatingAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewSetRatingAction.builder().rating(5) } };
    }

    @Test
    public void rating() {
        ReviewSetRatingAction value = ReviewSetRatingAction.of();
        value.setRating(5);
        Assertions.assertThat(value.getRating()).isEqualTo(5);
    }
}
