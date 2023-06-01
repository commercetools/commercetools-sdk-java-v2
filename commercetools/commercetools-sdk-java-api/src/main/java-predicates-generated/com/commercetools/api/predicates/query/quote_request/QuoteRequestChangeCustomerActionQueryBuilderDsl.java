
package com.commercetools.api.predicates.query.quote_request;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestChangeCustomerActionQueryBuilderDsl {
    public QuoteRequestChangeCustomerActionQueryBuilderDsl() {
    }

    public static QuoteRequestChangeCustomerActionQueryBuilderDsl of() {
        return new QuoteRequestChangeCustomerActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestChangeCustomerActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestChangeCustomerActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestChangeCustomerActionQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            QuoteRequestChangeCustomerActionQueryBuilderDsl::of);
    }

}
