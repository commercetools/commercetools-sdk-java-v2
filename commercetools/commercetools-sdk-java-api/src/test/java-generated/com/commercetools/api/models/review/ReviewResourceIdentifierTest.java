
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
public class ReviewResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewResourceIdentifierBuilder builder) {
        ReviewResourceIdentifier reviewResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(reviewResourceIdentifier).isInstanceOf(ReviewResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewResourceIdentifier.builder().id("id") },
                new Object[] { ReviewResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ReviewResourceIdentifier value = ReviewResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ReviewResourceIdentifier value = ReviewResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
