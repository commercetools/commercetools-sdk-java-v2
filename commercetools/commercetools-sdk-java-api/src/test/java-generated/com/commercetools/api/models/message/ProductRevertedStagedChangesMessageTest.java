
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductRevertedStagedChangesMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductRevertedStagedChangesMessageBuilder builder) {
        ProductRevertedStagedChangesMessage productRevertedStagedChangesMessage = builder.buildUnchecked();
        Assertions.assertThat(productRevertedStagedChangesMessage)
                .isInstanceOf(ProductRevertedStagedChangesMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "removedImageUrls", ProductRevertedStagedChangesMessage.builder()
                .removedImageUrls(Collections.singletonList("removedImageUrls")) } };
    }

    @Test
    public void removedImageUrls() {
        ProductRevertedStagedChangesMessage value = ProductRevertedStagedChangesMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }
}
