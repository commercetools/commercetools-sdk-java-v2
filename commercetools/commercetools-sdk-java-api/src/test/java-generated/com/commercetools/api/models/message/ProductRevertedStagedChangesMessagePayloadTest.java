
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRevertedStagedChangesMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRevertedStagedChangesMessagePayloadBuilder builder) {
        ProductRevertedStagedChangesMessagePayload productRevertedStagedChangesMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(productRevertedStagedChangesMessagePayload)
                .isInstanceOf(ProductRevertedStagedChangesMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "removedImageUrls", ProductRevertedStagedChangesMessagePayload.builder()
                .removedImageUrls(Collections.singletonList("removedImageUrls")) } };
    }

    @Test
    public void removedImageUrls() {
        ProductRevertedStagedChangesMessagePayload value = ProductRevertedStagedChangesMessagePayload.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }
}
