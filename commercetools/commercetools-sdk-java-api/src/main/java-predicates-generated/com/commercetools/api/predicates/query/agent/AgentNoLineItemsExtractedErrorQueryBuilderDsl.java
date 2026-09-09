
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentNoLineItemsExtractedErrorQueryBuilderDsl {
    public AgentNoLineItemsExtractedErrorQueryBuilderDsl() {
    }

    public static AgentNoLineItemsExtractedErrorQueryBuilderDsl of() {
        return new AgentNoLineItemsExtractedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentNoLineItemsExtractedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentNoLineItemsExtractedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentNoLineItemsExtractedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentNoLineItemsExtractedErrorQueryBuilderDsl::of));
    }

}
