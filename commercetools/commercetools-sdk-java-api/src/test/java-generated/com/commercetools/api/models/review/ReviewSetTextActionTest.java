
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
public class ReviewSetTextActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewSetTextActionBuilder builder) {
        ReviewSetTextAction reviewSetTextAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetTextAction).isInstanceOf(ReviewSetTextAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewSetTextAction.builder().text("text") } };
    }

    @Test
    public void text() {
        ReviewSetTextAction value = ReviewSetTextAction.of();
        value.setText("text");
        Assertions.assertThat(value.getText()).isEqualTo("text");
    }
}
