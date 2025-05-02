
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreAddProductSelectionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreAddProductSelectionActionBuilder builder) {
        StoreAddProductSelectionAction storeAddProductSelectionAction = builder.buildUnchecked();
        Assertions.assertThat(storeAddProductSelectionAction).isInstanceOf(StoreAddProductSelectionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productSelection", StoreAddProductSelectionAction.builder()
                .productSelection(
                    new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl()) },
                new Object[] { "active", StoreAddProductSelectionAction.builder().active(true) } };
    }

    @Test
    public void productSelection() {
        StoreAddProductSelectionAction value = StoreAddProductSelectionAction.of();
        value.setProductSelection(
            new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
    }

    @Test
    public void active() {
        StoreAddProductSelectionAction value = StoreAddProductSelectionAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
