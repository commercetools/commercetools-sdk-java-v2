
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
public class ProductPublishedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPublishedMessagePayloadBuilder builder) {
        ProductPublishedMessagePayload productPublishedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPublishedMessagePayload).isInstanceOf(ProductPublishedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductPublishedMessagePayload.builder()
                        .removedImageUrls(Collections.singletonList("removedImageUrls")) },
                new Object[] { ProductPublishedMessagePayload.builder()
                        .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) },
                new Object[] { ProductPublishedMessagePayload.builder()
                        .scope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All")) } };
    }

    @Test
    public void removedImageUrls() {
        ProductPublishedMessagePayload value = ProductPublishedMessagePayload.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }

    @Test
    public void productProjection() {
        ProductPublishedMessagePayload value = ProductPublishedMessagePayload.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }

    @Test
    public void scope() {
        ProductPublishedMessagePayload value = ProductPublishedMessagePayload.of();
        value.setScope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
    }
}
