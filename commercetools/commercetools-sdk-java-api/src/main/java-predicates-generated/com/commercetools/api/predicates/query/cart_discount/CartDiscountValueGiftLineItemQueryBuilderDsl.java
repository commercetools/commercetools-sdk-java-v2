
package com.commercetools.api.predicates.query.cart_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartDiscountValueGiftLineItemQueryBuilderDsl {
    public CartDiscountValueGiftLineItemQueryBuilderDsl() {
    }

    public static CartDiscountValueGiftLineItemQueryBuilderDsl of() {
        return new CartDiscountValueGiftLineItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountValueGiftLineItemQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueGiftLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountValueGiftLineItemQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            CartDiscountValueGiftLineItemQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CartDiscountValueGiftLineItemQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountValueGiftLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartDiscountValueGiftLineItemQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            CartDiscountValueGiftLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartDiscountValueGiftLineItemQueryBuilderDsl> distributionChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            CartDiscountValueGiftLineItemQueryBuilderDsl::of);
    }

}
