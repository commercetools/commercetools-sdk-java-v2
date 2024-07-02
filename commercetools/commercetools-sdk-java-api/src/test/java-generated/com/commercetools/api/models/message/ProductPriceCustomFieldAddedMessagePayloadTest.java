
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
public class ProductPriceCustomFieldAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldAddedMessagePayloadBuilder builder) {
        ProductPriceCustomFieldAddedMessagePayload productPriceCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldAddedMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductPriceCustomFieldAddedMessagePayload.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldAddedMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldAddedMessagePayload.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { ProductPriceCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void name() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        ProductPriceCustomFieldAddedMessagePayload value = ProductPriceCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
