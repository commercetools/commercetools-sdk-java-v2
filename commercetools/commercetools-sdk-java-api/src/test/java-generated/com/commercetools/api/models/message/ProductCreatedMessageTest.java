
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
public class ProductCreatedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductCreatedMessageBuilder builder) {
        ProductCreatedMessage productCreatedMessage = builder.buildUnchecked();
        Assertions.assertThat(productCreatedMessage).isInstanceOf(ProductCreatedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductCreatedMessage.builder()
                .productProjection(new com.commercetools.api.models.product.ProductProjectionImpl()) } };
    }

    @Test
    public void productProjection() {
        ProductCreatedMessage value = ProductCreatedMessage.of();
        value.setProductProjection(new com.commercetools.api.models.product.ProductProjectionImpl());
        Assertions.assertThat(value.getProductProjection())
                .isEqualTo(new com.commercetools.api.models.product.ProductProjectionImpl());
    }
}
