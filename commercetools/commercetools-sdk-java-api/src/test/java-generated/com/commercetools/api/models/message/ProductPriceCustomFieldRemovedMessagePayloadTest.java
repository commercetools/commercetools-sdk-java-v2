
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
public class ProductPriceCustomFieldRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldRemovedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldRemovedMessagePayload productPriceCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldRemovedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductPriceCustomFieldRemovedMessagePayload.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldRemovedMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldRemovedMessagePayload.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldRemovedMessagePayload value = ProductPriceCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
