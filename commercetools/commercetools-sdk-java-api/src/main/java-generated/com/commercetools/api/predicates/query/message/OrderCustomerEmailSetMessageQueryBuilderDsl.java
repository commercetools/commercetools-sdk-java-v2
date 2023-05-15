
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomerEmailSetMessageQueryBuilderDsl {
    public OrderCustomerEmailSetMessageQueryBuilderDsl() {
    }

    public static OrderCustomerEmailSetMessageQueryBuilderDsl of() {
        return new OrderCustomerEmailSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomerEmailSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderCustomerEmailSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCustomerEmailSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderCustomerEmailSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomerEmailSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderCustomerEmailSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomerEmailSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderCustomerEmailSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomerEmailSetMessageQueryBuilderDsl> oldEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldEmail")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomerEmailSetMessageQueryBuilderDsl::of));
    }
}
