
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
public class ProductSelectionProductRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionProductRemovedMessagePayloadBuilder builder) {
        ProductSelectionProductRemovedMessagePayload productSelectionProductRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productSelectionProductRemovedMessagePayload)
                .isInstanceOf(ProductSelectionProductRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionProductRemovedMessagePayload.builder()
                .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void product() {
        ProductSelectionProductRemovedMessagePayload value = ProductSelectionProductRemovedMessagePayload.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
