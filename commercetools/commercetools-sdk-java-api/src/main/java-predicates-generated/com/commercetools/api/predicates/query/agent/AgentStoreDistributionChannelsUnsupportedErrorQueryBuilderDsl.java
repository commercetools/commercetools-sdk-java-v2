
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl {
    public AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl() {
    }

    public static AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl of() {
        return new AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentStoreDistributionChannelsUnsupportedErrorQueryBuilderDsl::of));
    }

}
