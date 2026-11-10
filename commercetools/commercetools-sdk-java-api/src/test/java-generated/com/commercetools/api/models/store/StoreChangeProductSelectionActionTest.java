
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreChangeProductSelectionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreChangeProductSelectionActionBuilder builder) {
        StoreChangeProductSelectionAction storeChangeProductSelectionAction = builder.buildUnchecked();
        Assertions.assertThat(storeChangeProductSelectionAction).isInstanceOf(StoreChangeProductSelectionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productSelection", StoreChangeProductSelectionAction.builder()
                .productSelection(
                    new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl()) },
                new Object[] { "active", StoreChangeProductSelectionAction.builder().active(true) } };
    }

    @Test
    public void productSelection() {
        StoreChangeProductSelectionAction value = StoreChangeProductSelectionAction.of();
        value.setProductSelection(
            new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
        Assertions.assertThat(value.getProductSelection())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifierImpl());
    }

    @Test
    public void active() {
        StoreChangeProductSelectionAction value = StoreChangeProductSelectionAction.of();
        value.setActive(true);
        Assertions.assertThat(value.getActive()).isEqualTo(true);
    }
}
