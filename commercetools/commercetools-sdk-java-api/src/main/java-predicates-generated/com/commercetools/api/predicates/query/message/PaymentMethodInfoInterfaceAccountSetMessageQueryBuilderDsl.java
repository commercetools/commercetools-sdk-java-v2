
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl {
    public PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl() {
    }

    public static PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl of() {
        return new PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl> oldInterfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoInterfaceAccountSetMessageQueryBuilderDsl::of));
    }

}
