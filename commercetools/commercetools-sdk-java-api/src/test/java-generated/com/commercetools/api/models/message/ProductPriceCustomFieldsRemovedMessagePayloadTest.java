
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
public class ProductPriceCustomFieldsRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldsRemovedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldsRemovedMessagePayload productPriceCustomFieldsRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsRemovedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldsRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductPriceCustomFieldsRemovedMessagePayload.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldsRemovedMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldsRemovedMessagePayload.builder().staged(true) } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldsRemovedMessagePayload value = ProductPriceCustomFieldsRemovedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldsRemovedMessagePayload value = ProductPriceCustomFieldsRemovedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldsRemovedMessagePayload value = ProductPriceCustomFieldsRemovedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
