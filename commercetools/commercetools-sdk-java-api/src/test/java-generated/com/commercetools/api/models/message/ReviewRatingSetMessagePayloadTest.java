
package com.commercetools.api.models.message;

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
public class ReviewRatingSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewRatingSetMessagePayloadBuilder builder) {
        ReviewRatingSetMessagePayload reviewRatingSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(reviewRatingSetMessagePayload).isInstanceOf(ReviewRatingSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewRatingSetMessagePayload.builder().oldRating(0.9492049) },
                new Object[] { ReviewRatingSetMessagePayload.builder().newRating(0.33994043) },
                new Object[] { ReviewRatingSetMessagePayload.builder().includedInStatistics(true) },
                new Object[] { ReviewRatingSetMessagePayload.builder()
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
