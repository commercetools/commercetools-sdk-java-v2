
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
public class ProductCreatedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductCreatedMessagePayloadBuilder builder) {
        ProductCreatedMessagePayload productCreatedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productCreatedMessagePayload).isInstanceOf(ProductCreatedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductCreatedMessagePayload.builder()
                .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void productProjection() {
        ProductCreatedMessagePayload value = ProductCreatedMessagePayload.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
