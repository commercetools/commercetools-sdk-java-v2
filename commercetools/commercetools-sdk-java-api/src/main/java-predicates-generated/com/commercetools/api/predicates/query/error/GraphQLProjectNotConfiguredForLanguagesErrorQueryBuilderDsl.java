
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl {
    public GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl() {
    }

    public static GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl of() {
        return new GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
            p -> new CombinationQueryPredicate<>(p, GraphQLProjectNotConfiguredForLanguagesErrorQueryBuilderDsl::of));
    }

}
