
package com.commercetools.api.models.cart_discount;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CartDiscountTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CartDiscountBuilder builder) {
        CartDiscount cartDiscount = builder.buildUnchecked();
        Assertions.assertThat(cartDiscount).isInstanceOf(CartDiscount.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CartDiscount.builder().id("id") },
                new Object[] { "version", CartDiscount.builder().version(2L) },
                new Object[] { "createdAt",
                        CartDiscount.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        CartDiscount.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        CartDiscount.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        CartDiscount.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "name",
                        CartDiscount.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "key", CartDiscount.builder().key("key") },
                new Object[] { "description",
                        CartDiscount.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "value",
                        CartDiscount.builder()
                                .value(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl()) },
                new Object[] { "cartPredicate", CartDiscount.builder().cartPredicate("cartPredicate") },
                new Object[] { "target",
                        CartDiscount.builder()
                                .target(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl()) },
                new Object[] { "sortOrder", CartDiscount.builder().sortOrder("sortOrder") },
                new Object[] { "stores",
                        CartDiscount.builder()
                                .stores(Collections.singletonList(
                                    new com.commercetools.api.models.store.StoreKeyReferenceImpl())) },
                new Object[] { "isActive", CartDiscount.builder().isActive(true) },
                new Object[] { "validFrom",
                        CartDiscount.builder().validFrom(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "validUntil",
                        CartDiscount.builder().validUntil(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "requiresDiscountCode", CartDiscount.builder().requiresDiscountCode(true) },
                new Object[] { "references",
                        CartDiscount.builder()
                                .references(Collections
                                        .singletonList(new com.commercetools.api.models.common.ReferenceImpl())) },
                new Object[] { "stackingMode", CartDiscount.builder()
                        .stackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking")) },
                new Object[] { "custom",
                        CartDiscount.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "discountGroup",
                        CartDiscount.builder()
                                .discountGroup(
                                    new com.commercetools.api.models.discount_group.DiscountGroupReferenceImpl()) } };
    }

    @Test
    public void id() {
        CartDiscount value = CartDiscount.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        CartDiscount value = CartDiscount.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        CartDiscount value = CartDiscount.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        CartDiscount value = CartDiscount.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        CartDiscount value = CartDiscount.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        CartDiscount value = CartDiscount.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void name() {
        CartDiscount value = CartDiscount.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void key() {
        CartDiscount value = CartDiscount.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void description() {
        CartDiscount value = CartDiscount.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void value() {
        CartDiscount value = CartDiscount.of();
        value.setValue(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountValueImpl());
    }

    @Test
    public void cartPredicate() {
        CartDiscount value = CartDiscount.of();
        value.setCartPredicate("cartPredicate");
        Assertions.assertThat(value.getCartPredicate()).isEqualTo("cartPredicate");
    }

    @Test
    public void target() {
        CartDiscount value = CartDiscount.of();
        value.setTarget(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
        Assertions.assertThat(value.getTarget())
                .isEqualTo(new com.commercetools.api.models.cart_discount.CartDiscountTargetImpl());
    }

    @Test
    public void sortOrder() {
        CartDiscount value = CartDiscount.of();
        value.setSortOrder("sortOrder");
        Assertions.assertThat(value.getSortOrder()).isEqualTo("sortOrder");
    }

    @Test
    public void stores() {
        CartDiscount value = CartDiscount.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }

    @Test
    public void isActive() {
        CartDiscount value = CartDiscount.of();
        value.setIsActive(true);
        Assertions.assertThat(value.getIsActive()).isEqualTo(true);
    }

    @Test
    public void validFrom() {
        CartDiscount value = CartDiscount.of();
        value.setValidFrom(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidFrom()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void validUntil() {
        CartDiscount value = CartDiscount.of();
        value.setValidUntil(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getValidUntil()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void requiresDiscountCode() {
        CartDiscount value = CartDiscount.of();
        value.setRequiresDiscountCode(true);
        Assertions.assertThat(value.getRequiresDiscountCode()).isEqualTo(true);
    }

    @Test
    public void references() {
        CartDiscount value = CartDiscount.of();
        value.setReferences(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
        Assertions.assertThat(value.getReferences())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ReferenceImpl()));
    }

    @Test
    public void stackingMode() {
        CartDiscount value = CartDiscount.of();
        value.setStackingMode(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
        Assertions.assertThat(value.getStackingMode())
                .isEqualTo(com.commercetools.api.models.cart_discount.StackingMode.findEnum("Stacking"));
    }

    @Test
    public void custom() {
        CartDiscount value = CartDiscount.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void discountGroup() {
        CartDiscount value = CartDiscount.of();
        value.setDiscountGroup(new com.commercetools.api.models.discount_group.DiscountGroupReferenceImpl());
        Assertions.assertThat(value.getDiscountGroup())
                .isEqualTo(new com.commercetools.api.models.discount_group.DiscountGroupReferenceImpl());
    }
}
