
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLDuplicateEnumValuesErrorQueryBuilderDsl {
    public GraphQLDuplicateEnumValuesErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicateEnumValuesErrorQueryBuilderDsl of() {
        return new GraphQLDuplicateEnumValuesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateEnumValuesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateEnumValuesErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<GraphQLDuplicateEnumValuesErrorQueryBuilderDsl> duplicates() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("duplicates")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateEnumValuesErrorQueryBuilderDsl::of));
    }

}
