
package com.commercetools.api.predicates.query.quote;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteChangeCustomerActionQueryBuilderDsl {
    public QuoteChangeCustomerActionQueryBuilderDsl() {
    }

    public static QuoteChangeCustomerActionQueryBuilderDsl of() {
        return new QuoteChangeCustomerActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteChangeCustomerActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteChangeCustomerActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteChangeCustomerActionQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            QuoteChangeCustomerActionQueryBuilderDsl::of);
    }

}
