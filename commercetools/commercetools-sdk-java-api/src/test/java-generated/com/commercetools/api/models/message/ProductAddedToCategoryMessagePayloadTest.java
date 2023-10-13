
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
public class ProductAddedToCategoryMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductAddedToCategoryMessagePayloadBuilder builder) {
        ProductAddedToCategoryMessagePayload productAddedToCategoryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productAddedToCategoryMessagePayload)
                .isInstanceOf(ProductAddedToCategoryMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductAddedToCategoryMessagePayload.builder()
                        .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { ProductAddedToCategoryMessagePayload.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductAddedToCategoryMessagePayload value = ProductAddedToCategoryMessagePayload.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductAddedToCategoryMessagePayload value = ProductAddedToCategoryMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
