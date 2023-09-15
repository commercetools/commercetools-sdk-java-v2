
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
public class ReviewCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewCreatedMessageBuilder builder) {
        ReviewCreatedMessage reviewCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(reviewCreatedMessage).isInstanceOf(ReviewCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                ReviewCreatedMessage.builder().review(new com.commercetools.api.models.review.ReviewImpl()) } };
    }

    @Test
    public void review() {
        ReviewCreatedMessage value = ReviewCreatedMessage.of();
        value.setReview(new com.commercetools.api.models.review.ReviewImpl());
        Assertions.assertThat(value.getReview()).isEqualTo(new com.commercetools.api.models.review.ReviewImpl());
    }
}
