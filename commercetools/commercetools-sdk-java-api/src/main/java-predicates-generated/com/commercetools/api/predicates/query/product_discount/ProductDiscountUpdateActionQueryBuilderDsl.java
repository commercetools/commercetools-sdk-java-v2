
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountUpdateActionQueryBuilderDsl {
    public ProductDiscountUpdateActionQueryBuilderDsl() {
    }

    public static ProductDiscountUpdateActionQueryBuilderDsl of() {
        return new ProductDiscountUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asChangeIsActive(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeIsActiveActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeIsActiveActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeIsActiveActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeNameActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asChangePredicate(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangePredicateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangePredicateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountChangePredicateActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asChangeSortOrder(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeSortOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeSortOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeSortOrderActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asChangeValue(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeValueActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeValueActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountChangeValueActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountSetDescriptionActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountSetKeyActionQueryBuilderDsl.of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asSetValidFrom(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidFromActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidFromActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidFromActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asSetValidFromAndUntil(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidFromAndUntilActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountUpdateActionQueryBuilderDsl> asSetValidUntil(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidUntilActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidUntilActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountSetValidUntilActionQueryBuilderDsl
                    .of()),
            ProductDiscountUpdateActionQueryBuilderDsl::of);
    }
}
