package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductRevertStagedChangesActionQueryBuilderDsl  {
    public ProductRevertStagedChangesActionQueryBuilderDsl() {
    }

    public static ProductRevertStagedChangesActionQueryBuilderDsl of() {
        return new ProductRevertStagedChangesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRevertStagedChangesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertStagedChangesActionQueryBuilderDsl::of));
    }
    
}
