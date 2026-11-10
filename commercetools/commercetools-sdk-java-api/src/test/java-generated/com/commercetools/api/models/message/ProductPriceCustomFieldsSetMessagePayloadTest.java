
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceCustomFieldsSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceCustomFieldsSetMessagePayloadBuilder builder) {
        ProductPriceCustomFieldsSetMessagePayload productPriceCustomFieldsSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productPriceCustomFieldsSetMessagePayload)
                .isInstanceOf(ProductPriceCustomFieldsSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "priceId", ProductPriceCustomFieldsSetMessagePayload.builder().priceId("priceId") },
                new Object[] { "variantId", ProductPriceCustomFieldsSetMessagePayload.builder().variantId(5L) },
                new Object[] { "staged", ProductPriceCustomFieldsSetMessagePayload.builder().staged(true) },
                new Object[] { "customField",
                        ProductPriceCustomFieldsSetMessagePayload.builder()
                                .customField(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId",
                        ProductPriceCustomFieldsSetMessagePayload.builder().oldTypeId("oldTypeId") } };
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
