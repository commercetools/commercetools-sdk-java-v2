
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringRemoveImageActionQueryBuilderDsl {
    public ProductTailoringRemoveImageActionQueryBuilderDsl() {
    }

    public static ProductTailoringRemoveImageActionQueryBuilderDsl of() {
        return new ProductTailoringRemoveImageActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveImageActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveImageActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringRemoveImageActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveImageActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveImageActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveImageActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringRemoveImageActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveImageActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringRemoveImageActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringRemoveImageActionQueryBuilderDsl::of));
    }

}
