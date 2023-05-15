
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLDuplicateAttributeValueErrorQueryBuilderDsl {
    public GraphQLDuplicateAttributeValueErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicateAttributeValueErrorQueryBuilderDsl of() {
        return new GraphQLDuplicateAttributeValueErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateAttributeValueErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateAttributeValueErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLDuplicateAttributeValueErrorQueryBuilderDsl> attribute(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attribute"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            GraphQLDuplicateAttributeValueErrorQueryBuilderDsl::of);
    }

}
