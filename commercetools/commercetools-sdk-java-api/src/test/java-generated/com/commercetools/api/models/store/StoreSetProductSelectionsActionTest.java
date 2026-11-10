
package com.commercetools.api.models.store;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetProductSelectionsActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetProductSelectionsActionBuilder builder) {
        StoreSetProductSelectionsAction storeSetProductSelectionsAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetProductSelectionsAction).isInstanceOf(StoreSetProductSelectionsAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "productSelections",
                StoreSetProductSelectionsAction.builder()
                        .productSelections(Collections.singletonList(
                            new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl())) } };
    }

    @Test
    public void productSelections() {
        StoreSetProductSelectionsAction value = StoreSetProductSelectionsAction.of();
        value.setProductSelections(
            Collections.singletonList(new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl()));
        Assertions.assertThat(value.getProductSelections())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.store.ProductSelectionSettingDraftImpl()));
    }
}
