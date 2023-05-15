
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ClientLoggingQueryBuilderDsl {
    public ClientLoggingQueryBuilderDsl() {
    }

    public static ClientLoggingQueryBuilderDsl of() {
        return new ClientLoggingQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ClientLoggingQueryBuilderDsl> clientId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("clientId")),
            p -> new CombinationQueryPredicate<>(p, ClientLoggingQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ClientLoggingQueryBuilderDsl> externalUserId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalUserId")),
            p -> new CombinationQueryPredicate<>(p, ClientLoggingQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ClientLoggingQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            ClientLoggingQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ClientLoggingQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, ClientLoggingQueryBuilderDsl::of));
    }
}
