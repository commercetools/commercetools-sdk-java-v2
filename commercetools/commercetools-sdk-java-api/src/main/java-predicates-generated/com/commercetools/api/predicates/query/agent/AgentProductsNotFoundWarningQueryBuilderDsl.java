
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentProductsNotFoundWarningQueryBuilderDsl {
    public AgentProductsNotFoundWarningQueryBuilderDsl() {
    }

    public static AgentProductsNotFoundWarningQueryBuilderDsl of() {
        return new AgentProductsNotFoundWarningQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentProductsNotFoundWarningQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentProductsNotFoundWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentProductsNotFoundWarningQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentProductsNotFoundWarningQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<AgentProductsNotFoundWarningQueryBuilderDsl> products() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("products")),
            p -> new CombinationQueryPredicate<>(p, AgentProductsNotFoundWarningQueryBuilderDsl::of));
    }

}
