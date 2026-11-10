
package com.commercetools.api.models.quote_request;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class QuoteRequestDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, QuoteRequestDraftBuilder builder) {
        QuoteRequestDraft quoteRequestDraft = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestDraft).isInstanceOf(QuoteRequestDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "cart",
                        QuoteRequestDraft.builder()
                                .cart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl()) },
                new Object[] { "cartVersion", QuoteRequestDraft.builder().cartVersion(7L) },
                new Object[] { "key", QuoteRequestDraft.builder().key("key") },
                new Object[] { "comment", QuoteRequestDraft.builder().comment("comment") },
                new Object[] { "custom",
                        QuoteRequestDraft.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "state",
                        QuoteRequestDraft.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "purchaseOrderNumber",
                        QuoteRequestDraft.builder().purchaseOrderNumber("purchaseOrderNumber") } };
    }

    @Test
    public void cart() {
        QuoteRequestDraft value = QuoteRequestDraft.of();
        value.setCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
        Assertions.assertThat(value.getCart())
                .isEqualTo(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
    }

    @Test
    public void cartVersion() {
        QuoteRequestDraft value = QuoteRequestDraft.of();
        value.setCartVersion(7L);
        Assertions.assertThat(value.getCartVersion()).isEqualTo(7L);
    }

    @Test
    public void key() {
        QuoteRequestDraft value = QuoteRequestDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void comment() {
        QuoteRequestDraft value = QuoteRequestDraft.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }

    @Test
    public void custom() {
        QuoteRequestDraft value = QuoteRequestDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void state() {
        QuoteRequestDraft value = QuoteRequestDraft.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void purchaseOrderNumber() {
        QuoteRequestDraft value = QuoteRequestDraft.of();
        value.setPurchaseOrderNumber("purchaseOrderNumber");
        Assertions.assertThat(value.getPurchaseOrderNumber()).isEqualTo("purchaseOrderNumber");
    }
}
