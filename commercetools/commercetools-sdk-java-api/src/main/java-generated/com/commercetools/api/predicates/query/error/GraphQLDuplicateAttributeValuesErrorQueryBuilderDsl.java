
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl {
    public GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl of() {
        return new GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateAttributeValuesErrorQueryBuilderDsl::of));
    }
}
