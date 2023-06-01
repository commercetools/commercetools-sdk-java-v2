package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLDuplicateVariantValuesErrorQueryBuilderDsl  {
    public GraphQLDuplicateVariantValuesErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicateVariantValuesErrorQueryBuilderDsl of() {
        return new GraphQLDuplicateVariantValuesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateVariantValuesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateVariantValuesErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLDuplicateVariantValuesErrorQueryBuilderDsl> variantValues(
        Function<com.commercetools.api.predicates.query.error.VariantValuesQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.VariantValuesQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantValues"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.VariantValuesQueryBuilderDsl.of())),
            GraphQLDuplicateVariantValuesErrorQueryBuilderDsl::of);
    }
    
    
}
