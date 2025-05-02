
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPriceModeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPriceModeSetMessageBuilder builder) {
        ProductPriceModeSetMessage productPriceModeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(productPriceModeSetMessage).isInstanceOf(ProductPriceModeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "to", ProductPriceModeSetMessage.builder()
                .to(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded")) } };
    }

    @Test
    public void to() {
        ProductPriceModeSetMessage value = ProductPriceModeSetMessage.of();
        value.setTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
        Assertions.assertThat(value.getTo())
                .isEqualTo(com.commercetools.api.models.product.ProductPriceModeEnum.findEnum("Embedded"));
    }
}
