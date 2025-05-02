
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreReferenceBuilder builder) {
        StoreReference storeReference = builder.buildUnchecked();
        Assertions.assertThat(storeReference).isInstanceOf(StoreReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        StoreReference.builder().obj(new com.commercetools.api.models.store.StoreImpl()) },
                new Object[] { "id", StoreReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        StoreReference value = StoreReference.of();
        value.setObj(new com.commercetools.api.models.store.StoreImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.store.StoreImpl());
    }

    @Test
    public void id() {
        StoreReference value = StoreReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
