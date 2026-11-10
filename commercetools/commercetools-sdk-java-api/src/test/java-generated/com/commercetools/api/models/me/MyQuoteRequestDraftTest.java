
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyQuoteRequestDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyQuoteRequestDraftBuilder builder) {
        MyQuoteRequestDraft myQuoteRequestDraft = builder.buildUnchecked();
        Assertions.assertThat(myQuoteRequestDraft).isInstanceOf(MyQuoteRequestDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "cartId", MyQuoteRequestDraft.builder().cartId("cartId") },
                new Object[] { "cartVersion", MyQuoteRequestDraft.builder().cartVersion(7L) },
                new Object[] { "comment", MyQuoteRequestDraft.builder().comment("comment") } };
    }

    @Test
    public void cartId() {
        MyQuoteRequestDraft value = MyQuoteRequestDraft.of();
        value.setCartId("cartId");
        Assertions.assertThat(value.getCartId()).isEqualTo("cartId");
    }

    @Test
    public void cartVersion() {
        MyQuoteRequestDraft value = MyQuoteRequestDraft.of();
        value.setCartVersion(7L);
        Assertions.assertThat(value.getCartVersion()).isEqualTo(7L);
    }

    @Test
    public void comment() {
        MyQuoteRequestDraft value = MyQuoteRequestDraft.of();
        value.setComment("comment");
        Assertions.assertThat(value.getComment()).isEqualTo("comment");
    }
}
