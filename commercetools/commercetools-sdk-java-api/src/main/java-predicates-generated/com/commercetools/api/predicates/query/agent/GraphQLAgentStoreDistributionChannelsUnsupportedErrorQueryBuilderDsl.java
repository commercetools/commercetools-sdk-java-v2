
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl {
    public GraphQLAgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl of() {
        return new GraphQLAgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")), p -> new CombinationQueryPredicate<>(p,
                GraphQLAgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl::of));
    }

}
