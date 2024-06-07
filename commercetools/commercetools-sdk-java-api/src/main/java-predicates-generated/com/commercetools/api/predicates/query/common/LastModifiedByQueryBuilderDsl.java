
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class LastModifiedByQueryBuilderDsl {
    public LastModifiedByQueryBuilderDsl() {
    }

    public static LastModifiedByQueryBuilderDsl of() {
        return new LastModifiedByQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LastModifiedByQueryBuilderDsl> clientId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("clientId")),
            p -> new CombinationQueryPredicate<>(p, LastModifiedByQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LastModifiedByQueryBuilderDsl> externalUserId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalUserId")),
            p -> new CombinationQueryPredicate<>(p, LastModifiedByQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LastModifiedByQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            LastModifiedByQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<LastModifiedByQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, LastModifiedByQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LastModifiedByQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            LastModifiedByQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LastModifiedByQueryBuilderDsl> attributedTo(
            Function<com.commercetools.api.predicates.query.common.AttributionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AttributionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributedTo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AttributionQueryBuilderDsl.of())),
            LastModifiedByQueryBuilderDsl::of);
    }

}
