
package com.commercetools.api.models.recurring_order;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurringOrderDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurringOrderDraftBuilder builder) {
        RecurringOrderDraft recurringOrderDraft = builder.buildUnchecked();
        Assertions.assertThat(recurringOrderDraft).isInstanceOf(RecurringOrderDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurringOrderDraft.builder().key("key") },
                new Object[] { "cart",
                        RecurringOrderDraft.builder()
                                .cart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl()) },
                new Object[] { "cartVersion", RecurringOrderDraft.builder().cartVersion(7L) },
                new Object[] { "startsAt",
                        RecurringOrderDraft.builder().startsAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "state",
                        RecurringOrderDraft.builder()
                                .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "custom", RecurringOrderDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void key() {
        RecurringOrderDraft value = RecurringOrderDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void cart() {
        RecurringOrderDraft value = RecurringOrderDraft.of();
        value.setCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
        Assertions.assertThat(value.getCart())
                .isEqualTo(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
    }

    @Test
    public void cartVersion() {
        RecurringOrderDraft value = RecurringOrderDraft.of();
        value.setCartVersion(7L);
        Assertions.assertThat(value.getCartVersion()).isEqualTo(7L);
    }

    @Test
    public void startsAt() {
        RecurringOrderDraft value = RecurringOrderDraft.of();
        value.setStartsAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getStartsAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void state() {
        RecurringOrderDraft value = RecurringOrderDraft.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void custom() {
        RecurringOrderDraft value = RecurringOrderDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
