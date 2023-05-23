
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLLanguageUsedInStoresErrorQueryBuilderDsl {
    public GraphQLLanguageUsedInStoresErrorQueryBuilderDsl() {
    }

    public static GraphQLLanguageUsedInStoresErrorQueryBuilderDsl of() {
        return new GraphQLLanguageUsedInStoresErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLLanguageUsedInStoresErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLanguageUsedInStoresErrorQueryBuilderDsl::of));
    }

}
