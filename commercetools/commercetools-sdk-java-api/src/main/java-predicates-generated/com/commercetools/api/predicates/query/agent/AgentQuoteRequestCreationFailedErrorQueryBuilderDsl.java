
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentQuoteRequestCreationFailedErrorQueryBuilderDsl {
    public AgentQuoteRequestCreationFailedErrorQueryBuilderDsl() {
    }

    public static AgentQuoteRequestCreationFailedErrorQueryBuilderDsl of() {
        return new AgentQuoteRequestCreationFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentQuoteRequestCreationFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentQuoteRequestCreationFailedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentQuoteRequestCreationFailedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentQuoteRequestCreationFailedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentQuoteRequestCreationFailedErrorQueryBuilderDsl> cartId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartId")),
            p -> new CombinationQueryPredicate<>(p, AgentQuoteRequestCreationFailedErrorQueryBuilderDsl::of));
    }

}
