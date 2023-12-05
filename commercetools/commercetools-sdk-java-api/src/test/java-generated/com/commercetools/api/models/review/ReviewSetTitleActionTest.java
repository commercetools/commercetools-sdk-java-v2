
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
public class ReviewSetTitleActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewSetTitleActionBuilder builder) {
        ReviewSetTitleAction reviewSetTitleAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetTitleAction).isInstanceOf(ReviewSetTitleAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewSetTitleAction.builder().title("title") } };
    }

    @Test
    public void title() {
        ReviewSetTitleAction value = ReviewSetTitleAction.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
