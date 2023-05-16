
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductChangeMasterVariantActionQueryBuilderDsl {
    public ProductChangeMasterVariantActionQueryBuilderDsl() {
    }

    public static ProductChangeMasterVariantActionQueryBuilderDsl of() {
        return new ProductChangeMasterVariantActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductChangeMasterVariantActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeMasterVariantActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductChangeMasterVariantActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeMasterVariantActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductChangeMasterVariantActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeMasterVariantActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductChangeMasterVariantActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductChangeMasterVariantActionQueryBuilderDsl::of));
    }

}
