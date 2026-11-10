
package com.commercetools.api.models.product_type;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTypeSetSavedToLineItemActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTypeSetSavedToLineItemActionBuilder builder) {
        ProductTypeSetSavedToLineItemAction productTypeSetSavedToLineItemAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeSetSavedToLineItemAction)
                .isInstanceOf(ProductTypeSetSavedToLineItemAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "attributeName",
                        ProductTypeSetSavedToLineItemAction.builder().attributeName("attributeName") },
                new Object[] { "savedToLineItem",
                        ProductTypeSetSavedToLineItemAction.builder().savedToLineItem(true) } };
    }

    @Test
    public void attributeName() {
        ProductTypeSetSavedToLineItemAction value = ProductTypeSetSavedToLineItemAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void savedToLineItem() {
        ProductTypeSetSavedToLineItemAction value = ProductTypeSetSavedToLineItemAction.of();
        value.setSavedToLineItem(true);
        Assertions.assertThat(value.getSavedToLineItem()).isEqualTo(true);
    }
}
