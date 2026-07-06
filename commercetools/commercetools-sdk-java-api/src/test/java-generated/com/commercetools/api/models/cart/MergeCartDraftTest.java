
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MergeCartDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MergeCartDraftBuilder builder) {
        MergeCartDraft mergeCartDraft = builder.buildUnchecked();
        Assertions.assertThat(mergeCartDraft).isInstanceOf(MergeCartDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "anonymousCart",
                        MergeCartDraft.builder()
                                .anonymousCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl()) },
                new Object[] { "mergeMode",
                        MergeCartDraft.builder()
                                .mergeMode(com.commercetools.api.models.cart.CartMergeMode
                                        .findEnum("MergeWithExistingCustomerCart")) },
                new Object[] { "updateProductData", MergeCartDraft.builder().updateProductData(true) },
                new Object[] { "anonymousId", MergeCartDraft.builder().anonymousId("anonymousId") } };
    }

    @Test
    public void anonymousCart() {
        MergeCartDraft value = MergeCartDraft.of();
        value.setAnonymousCart(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
        Assertions.assertThat(value.getAnonymousCart())
                .isEqualTo(new com.commercetools.api.models.cart.CartResourceIdentifierImpl());
    }

    @Test
    public void mergeMode() {
        MergeCartDraft value = MergeCartDraft.of();
        value.setMergeMode(com.commercetools.api.models.cart.CartMergeMode.findEnum("MergeWithExistingCustomerCart"));
        Assertions.assertThat(value.getMergeMode())
                .isEqualTo(com.commercetools.api.models.cart.CartMergeMode.findEnum("MergeWithExistingCustomerCart"));
    }

    @Test
    public void updateProductData() {
        MergeCartDraft value = MergeCartDraft.of();
        value.setUpdateProductData(true);
        Assertions.assertThat(value.getUpdateProductData()).isEqualTo(true);
    }

    @Test
    public void anonymousId() {
        MergeCartDraft value = MergeCartDraft.of();
        value.setAnonymousId("anonymousId");
        Assertions.assertThat(value.getAnonymousId()).isEqualTo("anonymousId");
    }
}
