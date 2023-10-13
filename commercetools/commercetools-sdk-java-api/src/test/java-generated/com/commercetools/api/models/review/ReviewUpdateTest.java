
package com.commercetools.api.models.review;

import java.util.Collections;

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
public class ReviewUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewUpdateBuilder builder) {
        ReviewUpdate reviewUpdate = builder.buildUnchecked();
        Assertions.assertThat(reviewUpdate).isInstanceOf(ReviewUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewUpdate.builder().version(2L) },
                new Object[] { ReviewUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.review.ReviewUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ReviewUpdate value = ReviewUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ReviewUpdate value = ReviewUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.review.ReviewUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.review.ReviewUpdateActionImpl()));
    }
}
