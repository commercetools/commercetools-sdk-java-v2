package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CreatedByQueryBuilderDsl  {
    public CreatedByQueryBuilderDsl() {
    }

    public static CreatedByQueryBuilderDsl of() {
        return new CreatedByQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CreatedByQueryBuilderDsl> clientId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("clientId")),
        p -> new CombinationQueryPredicate<>(p, CreatedByQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CreatedByQueryBuilderDsl> externalUserId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalUserId")),
        p -> new CombinationQueryPredicate<>(p, CreatedByQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CreatedByQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            CreatedByQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<CreatedByQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
        p -> new CombinationQueryPredicate<>(p, CreatedByQueryBuilderDsl::of));
    }
    
}
