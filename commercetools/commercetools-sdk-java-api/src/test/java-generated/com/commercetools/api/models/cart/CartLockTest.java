
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartLockTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartLockBuilder builder) {
        CartLock cartLock = builder.buildUnchecked();
        Assertions.assertThat(cartLock).isInstanceOf(CartLock.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "createdAt", CartLock.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "clientId", CartLock.builder().clientId("clientId") } };
    }

    @Test
    public void createdAt() {
        CartLock value = CartLock.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void clientId() {
        CartLock value = CartLock.of();
        value.setClientId("clientId");
        Assertions.assertThat(value.getClientId()).isEqualTo("clientId");
    }
}
