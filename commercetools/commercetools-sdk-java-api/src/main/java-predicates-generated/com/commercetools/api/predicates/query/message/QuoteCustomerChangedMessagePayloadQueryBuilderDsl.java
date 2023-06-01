
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteCustomerChangedMessagePayloadQueryBuilderDsl {
    public QuoteCustomerChangedMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteCustomerChangedMessagePayloadQueryBuilderDsl of() {
        return new QuoteCustomerChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteCustomerChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteCustomerChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteCustomerChangedMessagePayloadQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteCustomerChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteCustomerChangedMessagePayloadQueryBuilderDsl> previousCustomer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("previousCustomer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            QuoteCustomerChangedMessagePayloadQueryBuilderDsl::of);
    }

}
