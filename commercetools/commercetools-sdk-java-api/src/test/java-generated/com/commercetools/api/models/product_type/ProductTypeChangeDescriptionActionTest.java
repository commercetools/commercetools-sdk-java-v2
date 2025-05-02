
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeChangeDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeChangeDescriptionActionBuilder builder) {
        ProductTypeChangeDescriptionAction productTypeChangeDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeChangeDescriptionAction)
                .isInstanceOf(ProductTypeChangeDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "description",
                ProductTypeChangeDescriptionAction.builder().description("description") } };
    }

    @Test
    public void description() {
        ProductTypeChangeDescriptionAction value = ProductTypeChangeDescriptionAction.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }
}
