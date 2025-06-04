
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomerPasswordTokenCreatedMessageQueryBuilderDsl {
    public CustomerPasswordTokenCreatedMessageQueryBuilderDsl() {
    }

    public static CustomerPasswordTokenCreatedMessageQueryBuilderDsl of() {
        return new CustomerPasswordTokenCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> customerId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerId")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> expiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expiresAt")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<CustomerPasswordTokenCreatedMessageQueryBuilderDsl> invalidateOlderTokens() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("invalidateOlderTokens")),
            p -> new CombinationQueryPredicate<>(p, CustomerPasswordTokenCreatedMessageQueryBuilderDsl::of));
    }

}
