
package com.commercetools.api.models.store;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreUpdateBuilder builder) {
        StoreUpdate storeUpdate = builder.buildUnchecked();
        Assertions.assertThat(storeUpdate).isInstanceOf(StoreUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", StoreUpdate.builder().version(2L) }, new Object[] { "actions",
                StoreUpdate.builder()
                        .actions(Collections
                                .singletonList(new com.commercetools.api.models.store.StoreUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        StoreUpdate value = StoreUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        StoreUpdate value = StoreUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.store.StoreUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreUpdateActionImpl()));
    }
}
