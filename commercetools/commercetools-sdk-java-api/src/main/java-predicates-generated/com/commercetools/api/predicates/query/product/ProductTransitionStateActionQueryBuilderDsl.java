package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductTransitionStateActionQueryBuilderDsl  {
    public ProductTransitionStateActionQueryBuilderDsl() {
    }

    public static ProductTransitionStateActionQueryBuilderDsl of() {
        return new ProductTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductTransitionStateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductTransitionStateActionQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            ProductTransitionStateActionQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
        p -> new CombinationQueryPredicate<>(p, ProductTransitionStateActionQueryBuilderDsl::of));
    }
    
}
