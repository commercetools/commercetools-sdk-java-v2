
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl {
    public QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl of() {
        return new QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl> previousCustomer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("previousCustomer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteRequestCustomerChangedMessagePayloadQueryBuilderDsl::of);
    }

}
