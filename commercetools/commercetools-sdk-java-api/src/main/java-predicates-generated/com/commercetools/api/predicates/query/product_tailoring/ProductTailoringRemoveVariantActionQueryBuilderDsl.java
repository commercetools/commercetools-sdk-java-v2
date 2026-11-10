
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringRemoveVariantActionQueryBuilderDsl {
    public ProductTailoringRemoveVariantActionQueryBuilderDsl() {
    }

    public static ProductTailoringRemoveVariantActionQueryBuilderDsl of() {
        return new ProductTailoringRemoveVariantActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveVariantActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveVariantActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringRemoveVariantActionQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveVariantActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveVariantActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveVariantActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringRemoveVariantActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveVariantActionQueryBuilderDsl::of));
    }

}
