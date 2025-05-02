
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeAddAttributeDefinitionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeAddAttributeDefinitionActionBuilder builder) {
        ProductTypeAddAttributeDefinitionAction productTypeAddAttributeDefinitionAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeAddAttributeDefinitionAction)
                .isInstanceOf(ProductTypeAddAttributeDefinitionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "attribute", ProductTypeAddAttributeDefinitionAction.builder()
                .attribute(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl()) } };
    }

    @Test
    public void attribute() {
        ProductTypeAddAttributeDefinitionAction value = ProductTypeAddAttributeDefinitionAction.of();
        value.setAttribute(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl());
        Assertions.assertThat(value.getAttribute())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl());
    }
}
