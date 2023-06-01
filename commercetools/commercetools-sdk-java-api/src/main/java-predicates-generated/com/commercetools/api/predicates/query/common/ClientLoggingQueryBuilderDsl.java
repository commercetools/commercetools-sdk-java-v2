package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ClientLoggingQueryBuilderDsl  {
    public ClientLoggingQueryBuilderDsl() {
    }

    public static ClientLoggingQueryBuilderDsl of() {
        return new ClientLoggingQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ClientLoggingQueryBuilderDsl> clientId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("clientId")),
        p -> new CombinationQueryPredicate<>(p, ClientLoggingQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ClientLoggingQueryBuilderDsl> externalUserId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalUserId")),
        p -> new CombinationQueryPredicate<>(p, ClientLoggingQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ClientLoggingQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            ClientLoggingQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ClientLoggingQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
        p -> new CombinationQueryPredicate<>(p, ClientLoggingQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<ClientLoggingQueryBuilderDsl> asCreatedBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of()),
            ClientLoggingQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<ClientLoggingQueryBuilderDsl> asLastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of()),
            ClientLoggingQueryBuilderDsl::of);
    }
}
