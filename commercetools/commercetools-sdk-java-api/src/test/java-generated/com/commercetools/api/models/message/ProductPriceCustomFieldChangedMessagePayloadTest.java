
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
public class ProductPriceCustomFieldChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldChangedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldChangedMessagePayload productPriceCustomFieldChangedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldChangedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductPriceCustomFieldChangedMessagePayload.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldChangedMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldChangedMessagePayload.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldChangedMessagePayload.builder().name("name") },
                new Object[] { ProductPriceCustomFieldChangedMessagePayload.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldChangedMessagePayload value = ProductPriceCustomFieldChangedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
