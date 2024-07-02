
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
public class ProductPriceCustomFieldsSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPriceCustomFieldsSetMessagePayloadBuilder builder) {
        ProductPriceCustomFieldsSetMessagePayload productPriceCustomFieldsSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsSetMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldsSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPriceCustomFieldsSetMessagePayload.builder().priceId("priceId") },
                new Object[] { ProductPriceCustomFieldsSetMessagePayload.builder().variantId(5L) },
                new Object[] { ProductPriceCustomFieldsSetMessagePayload.builder().staged(true) },
                new Object[] { ProductPriceCustomFieldsSetMessagePayload.builder()
                        .customField(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { ProductPriceCustomFieldsSetMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void priceId() {
        ProductPriceCustomFieldsSetMessagePayload value = ProductPriceCustomFieldsSetMessagePayload.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variantId() {
        ProductPriceCustomFieldsSetMessagePayload value = ProductPriceCustomFieldsSetMessagePayload.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void staged() {
        ProductPriceCustomFieldsSetMessagePayload value = ProductPriceCustomFieldsSetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }

    @Test
    public void customField() {
        ProductPriceCustomFieldsSetMessagePayload value = ProductPriceCustomFieldsSetMessagePayload.of();
        value.setCustomField(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomField())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        ProductPriceCustomFieldsSetMessagePayload value = ProductPriceCustomFieldsSetMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
