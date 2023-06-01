package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductRevertStagedVariantChangesActionQueryBuilderDsl  {
    public ProductRevertStagedVariantChangesActionQueryBuilderDsl() {
    }

    public static ProductRevertStagedVariantChangesActionQueryBuilderDsl of() {
        return new ProductRevertStagedVariantChangesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRevertStagedVariantChangesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertStagedVariantChangesActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductRevertStagedVariantChangesActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertStagedVariantChangesActionQueryBuilderDsl::of));
    }
    
}
