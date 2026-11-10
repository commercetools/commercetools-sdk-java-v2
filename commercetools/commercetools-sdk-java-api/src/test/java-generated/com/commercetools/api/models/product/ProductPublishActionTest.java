
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductPublishActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductPublishActionBuilder builder) {
        ProductPublishAction productPublishAction = builder.buildUnchecked();
        Assertions.assertThat(productPublishAction).isInstanceOf(ProductPublishAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "scope", ProductPublishAction.builder()
                .scope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All")) } };
    }

    @Test
    public void scope() {
        ProductPublishAction value = ProductPublishAction.of();
        value.setScope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
    }
}
