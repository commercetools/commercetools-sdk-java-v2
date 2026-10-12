
package com.commercetools.api.models.category;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CategoryRemoveStoreActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CategoryRemoveStoreActionBuilder builder) {
        CategoryRemoveStoreAction categoryRemoveStoreAction = builder.buildUnchecked();
        Assertions.assertThat(categoryRemoveStoreAction).isInstanceOf(CategoryRemoveStoreAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "store", CategoryRemoveStoreAction.builder()
                .store(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()) } };
    }

    @Test
    public void store() {
        CategoryRemoveStoreAction value = CategoryRemoveStoreAction.of();
        value.setStore(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreResourceIdentifierImpl());
    }
}
