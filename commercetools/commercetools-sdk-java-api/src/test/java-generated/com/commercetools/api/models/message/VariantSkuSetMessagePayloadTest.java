
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class VariantSkuSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, VariantSkuSetMessagePayloadBuilder builder) {
        VariantSkuSetMessagePayload variantSkuSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(variantSkuSetMessagePayload).isInstanceOf(VariantSkuSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sku", VariantSkuSetMessagePayload.builder().sku("sku") },
                new Object[] { "oldSku", VariantSkuSetMessagePayload.builder().oldSku("oldSku") },
                new Object[] { "staged", VariantSkuSetMessagePayload.builder().staged(true) } };
    }

    @Test
    public void sku() {
        VariantSkuSetMessagePayload value = VariantSkuSetMessagePayload.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void oldSku() {
        VariantSkuSetMessagePayload value = VariantSkuSetMessagePayload.of();
        value.setOldSku("oldSku");
        Assertions.assertThat(value.getOldSku()).isEqualTo("oldSku");
    }

    @Test
    public void staged() {
        VariantSkuSetMessagePayload value = VariantSkuSetMessagePayload.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
