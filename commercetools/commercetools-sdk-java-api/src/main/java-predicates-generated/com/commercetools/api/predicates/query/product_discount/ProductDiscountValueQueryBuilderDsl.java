
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountValueQueryBuilderDsl {
    public ProductDiscountValueQueryBuilderDsl() {
    }

    public static ProductDiscountValueQueryBuilderDsl of() {
        return new ProductDiscountValueQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountValueQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountValueQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountValueQueryBuilderDsl> asAbsolute(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueAbsoluteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueAbsoluteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountValueAbsoluteQueryBuilderDsl.of()),
            ProductDiscountValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountValueQueryBuilderDsl> asExternal(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueExternalQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueExternalQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountValueExternalQueryBuilderDsl.of()),
            ProductDiscountValueQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDiscountValueQueryBuilderDsl> asRelative(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueRelativeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueRelativeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_discount.ProductDiscountValueRelativeQueryBuilderDsl.of()),
            ProductDiscountValueQueryBuilderDsl::of);
    }
}
