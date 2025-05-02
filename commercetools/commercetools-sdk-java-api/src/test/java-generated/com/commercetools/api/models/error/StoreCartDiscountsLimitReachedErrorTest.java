
package com.commercetools.api.models.error;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreCartDiscountsLimitReachedErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreCartDiscountsLimitReachedErrorBuilder builder) {
        StoreCartDiscountsLimitReachedError storeCartDiscountsLimitReachedError = builder.buildUnchecked();
        Assertions.assertThat(storeCartDiscountsLimitReachedError)
                .isInstanceOf(StoreCartDiscountsLimitReachedError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "message", StoreCartDiscountsLimitReachedError.builder().message("message") },
                new Object[] { "stores",
                        StoreCartDiscountsLimitReachedError.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) } };
    }

    @Test
    public void message() {
        StoreCartDiscountsLimitReachedError value = StoreCartDiscountsLimitReachedError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void stores() {
        StoreCartDiscountsLimitReachedError value = StoreCartDiscountsLimitReachedError.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }
}
