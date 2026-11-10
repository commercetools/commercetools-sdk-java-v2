
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreRemoveProductSelectionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreRemoveProductSelectionActionBuilder builder) {
        StoreRemoveProductSelectionAction storeRemoveProductSelectionAction = builder.buildUnchecked();
        Assertions.assertThat(storeRemoveProductSelectionAction).isInstanceOf(StoreRemoveProductSelectionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productSelection", StoreRemoveProductSelectionAction.builder()
                .productSelection(
                    new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl()) } };
    }

    @Test
    public void productSelection() {
        StoreRemoveProductSelectionAction value = StoreRemoveProductSelectionAction.of();
        value.setProductSelection(
            new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
    }
}
