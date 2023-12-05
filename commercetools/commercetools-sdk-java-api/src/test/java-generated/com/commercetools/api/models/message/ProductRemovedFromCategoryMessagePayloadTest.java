
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
public class ProductRemovedFromCategoryMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRemovedFromCategoryMessagePayloadBuilder builder) {
        ProductRemovedFromCategoryMessagePayload productRemovedFromCategoryMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productRemovedFromCategoryMessagePayload)
                .isInstanceOf(ProductRemovedFromCategoryMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductRemovedFromCategoryMessagePayload.builder()
                        .category(new com.commercetools.api.models.category.CategoryReferenceImpl()) },
                new Object[] { ProductRemovedFromCategoryMessagePayload.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductRemovedFromCategoryMessagePayload value = ProductRemovedFromCategoryMessagePayload.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryReferenceImpl());
    }

    @Test
    public void staged() {
        ProductRemovedFromCategoryMessagePayload value = ProductRemovedFromCategoryMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
