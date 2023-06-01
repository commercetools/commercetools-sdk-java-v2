package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductPublishActionQueryBuilderDsl  {
    public ProductPublishActionQueryBuilderDsl() {
    }

    public static ProductPublishActionQueryBuilderDsl of() {
        return new ProductPublishActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPublishActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPublishActionQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishActionQueryBuilderDsl::of));
    }
    
}
