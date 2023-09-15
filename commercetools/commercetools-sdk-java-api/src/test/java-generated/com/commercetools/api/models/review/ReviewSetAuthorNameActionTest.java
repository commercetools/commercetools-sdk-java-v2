
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
public class ReviewSetAuthorNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewSetAuthorNameActionBuilder builder) {
        ReviewSetAuthorNameAction reviewSetAuthorNameAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetAuthorNameAction).isInstanceOf(ReviewSetAuthorNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewSetAuthorNameAction.builder().authorName("authorName") } };
    }

    @Test
    public void authorName() {
        ReviewSetAuthorNameAction value = ReviewSetAuthorNameAction.of();
        value.setAuthorName("authorName");
        Assertions.assertThat(value.getAuthorName()).isEqualTo("authorName");
    }
}
