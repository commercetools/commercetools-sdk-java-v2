
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl {
    public PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl() {
    }

    public static PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl of() {
        return new PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldRemovedMessageQueryBuilderDsl::of));
    }

}
