
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
public class ReviewSetTargetActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewSetTargetActionBuilder builder) {
        ReviewSetTargetAction reviewSetTargetAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetTargetAction).isInstanceOf(ReviewSetTargetAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewSetTargetAction.builder().target("target") } };
    }

    @Test
    public void target() {
        ReviewSetTargetAction value = ReviewSetTargetAction.of();
        value.setTarget("target");
        Assertions.assertThat(value.getTarget()).isEqualTo("target");
    }
}
