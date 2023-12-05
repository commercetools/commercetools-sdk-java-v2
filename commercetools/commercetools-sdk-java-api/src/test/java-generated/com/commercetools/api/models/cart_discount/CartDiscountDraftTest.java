
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CartDiscountDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountDraftBuilder builder) {
        CartDiscountDraft cartDiscountDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountDraft).isInstanceOf(CartDiscountDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CartDiscountDraft.builder()
                        .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CartDiscountDraft.builder().key("key") },
                new Object[] { CartDiscountDraft.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { CartDiscountDraft.builder()
                        .value(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl()) },
                new Object[] { CartDiscountDraft.builder().cartPredicate("cartPredicate") },
                new Object[] { CartDiscountDraft.builder()
                        .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) },
                new Object[] { CartDiscountDraft.builder().sortOrder("sortOrder") },
                new Object[] { CartDiscountDraft.builder()
                        .stores(Collections
                                .singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) },
                new Object[] { CartDiscountDraft.builder().isActive(true) },
                new Object[] { CartDiscountDraft.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CartDiscountDraft.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { CartDiscountDraft.builder().requiresDiscountCode(true) },
                new Object[] { CartDiscountDraft.builder()
                        .stackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking")) },
                new Object[] { CartDiscountDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void name() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void value() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueDraftImpl());
    }

    @Test
    public void cartPredicate() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }

    @Test
    public void target() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }

    @Test
    public void sortOrder() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void stores() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }

    @Test
    public void isActive() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void validFrom() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void requiresDiscountCode() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setRequiresDiscountCode(true);
        Assertions.assertThat(value.getRequiresDiscountCode()).isEqualTo(true);
    }

    @Test
    public void stackingMode() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setStackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getStackingMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
    }

    @Test
    public void custom() {
        CartDiscountDraft value = CartDiscountDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
