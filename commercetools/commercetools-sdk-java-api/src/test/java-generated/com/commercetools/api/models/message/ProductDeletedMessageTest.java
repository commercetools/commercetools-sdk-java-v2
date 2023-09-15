
package com.commercetools.api.models.message;

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
public class ProductDeletedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDeletedMessageBuilder builder) {
        ProductDeletedMessage productDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(productDeletedMessage).isInstanceOf(ProductDeletedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductDeletedMessage.builder()
                        .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { ProductDeletedMessage.builder()
                        .currentProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void removedImageUrls() {
        ProductDeletedMessage value = ProductDeletedMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void currentProjection() {
        ProductDeletedMessage value = ProductDeletedMessage.of();
        value.setCurrentProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getCurrentProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
