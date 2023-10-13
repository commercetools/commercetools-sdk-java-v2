
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
public class ReviewReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewReferenceBuilder builder) {
        ReviewReference reviewReference = builder.buildUnchecked();
        Assertions.assertThat(reviewReference).isInstanceOf(ReviewReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ReviewReference.builder().obj(new com.commercetools.api.models.review.ReviewImpl()) },
                new Object[] { ReviewReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ReviewReference value = ReviewReference.of();
        value.setObj(new com.commercetools.api.models.review.ReviewImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.review.ReviewImpl());
    }

    @Test
    public void id() {
        ReviewReference value = ReviewReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
