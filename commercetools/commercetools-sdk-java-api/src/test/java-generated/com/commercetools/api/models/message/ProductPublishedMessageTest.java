
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
public class ProductPublishedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPublishedMessageBuilder builder) {
        ProductPublishedMessage productPublishedMessage = builder.buildUnchecked();
        Assertions.assertThat(productPublishedMessage).isInstanceOf(ProductPublishedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductPublishedMessage.builder()
                        .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { ProductPublishedMessage.builder()
                        .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) },
                new Object[] { ProductPublishedMessage.builder()
                        .scope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All")) } };
    }

    @Test
    public void removedImageUrls() {
        ProductPublishedMessage value = ProductPublishedMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void productProjection() {
        ProductPublishedMessage value = ProductPublishedMessage.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }

    @Test
    public void scope() {
        ProductPublishedMessage value = ProductPublishedMessage.of();
        value.setScope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
    }
}
