
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl {
    public PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl() {
    }

    public static PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl of() {
        return new PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> _interface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl> oldInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceSetMessageQueryBuilderDsl::of));
    }

}
