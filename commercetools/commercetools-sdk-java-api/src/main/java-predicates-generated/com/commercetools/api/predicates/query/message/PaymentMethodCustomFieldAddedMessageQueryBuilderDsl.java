
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodCustomFieldAddedMessageQueryBuilderDsl {
    public PaymentMethodCustomFieldAddedMessageQueryBuilderDsl() {
    }

    public static PaymentMethodCustomFieldAddedMessageQueryBuilderDsl of() {
        return new PaymentMethodCustomFieldAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodCustomFieldAddedMessageQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodCustomFieldAddedMessageQueryBuilderDsl::of));
    }

}
