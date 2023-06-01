package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetDescriptionActionQueryBuilderDsl  {
    public ProductSetDescriptionActionQueryBuilderDsl() {
    }

    public static ProductSetDescriptionActionQueryBuilderDsl of() {
        return new ProductSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetDescriptionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSetDescriptionActionQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSetDescriptionActionQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductSetDescriptionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetDescriptionActionQueryBuilderDsl::of));
    }
    
}
