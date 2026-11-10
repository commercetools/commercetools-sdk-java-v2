
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentNoLineItemsExtractedErrorQueryBuilderDsl {
    public GraphQLAgentNoLineItemsExtractedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentNoLineItemsExtractedErrorQueryBuilderDsl of() {
        return new GraphQLAgentNoLineItemsExtractedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentNoLineItemsExtractedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentNoLineItemsExtractedErrorQueryBuilderDsl::of));
    }

}
