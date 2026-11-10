
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentProductsNotFoundErrorQueryBuilderDsl {
    public AgentProductsNotFoundErrorQueryBuilderDsl() {
    }

    public static AgentProductsNotFoundErrorQueryBuilderDsl of() {
        return new AgentProductsNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentProductsNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentProductsNotFoundErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentProductsNotFoundErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentProductsNotFoundErrorQueryBuilderDsl::of));
    }

}
