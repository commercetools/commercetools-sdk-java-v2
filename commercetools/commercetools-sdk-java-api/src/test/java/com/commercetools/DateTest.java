package com.commercetools;

import com.commercetools.api.models.cart.Cart;
import io.vrap.rmf.base.client.utils.json.JsonUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTest {
    @Test
    public void t() throws IOException {
        ZonedDateTime t = ZonedDateTime.of(2020, 1, 1, 11, 1, 9, 0, ZoneId.of("Z"));
        Cart cart = Cart.builder().createdAt(t).buildUnchecked();

        String cartString = JsonUtils.toJsonString(cart);
        Assertions.assertThat(cartString).isEqualTo("{\"createdAt\":\"2020-01-01T11:01:09.000Z\"}");

        Cart c = JsonUtils.fromJsonString(cartString, Cart.class);
        Assertions.assertThat(c.getCreatedAt()).isEqualTo(t);
    }

}
