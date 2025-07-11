
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodCustomFieldChangedMessageQueryBuilderDsl {
    public PaymentMethodCustomFieldChangedMessageQueryBuilderDsl() {
    }

    public static PaymentMethodCustomFieldChangedMessageQueryBuilderDsl of() {
        return new PaymentMethodCustomFieldChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldChangedMessageQueryBuilderDsl> oldValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldValue")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldChangedMessageQueryBuilderDsl::of));
    }

}
