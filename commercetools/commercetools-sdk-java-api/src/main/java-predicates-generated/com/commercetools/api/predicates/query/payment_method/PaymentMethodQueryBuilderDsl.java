
package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodQueryBuilderDsl {
    public PaymentMethodQueryBuilderDsl() {
    }

    public static PaymentMethodQueryBuilderDsl of() {
        return new PaymentMethodQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentMethodQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            PaymentMethodQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            PaymentMethodQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> paymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodQueryBuilderDsl> token(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("token"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl.of())),
            PaymentMethodQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> paymentMethodStatus() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentMethodStatus")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<PaymentMethodQueryBuilderDsl> _default() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("default")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            PaymentMethodQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            PaymentMethodQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            PaymentMethodQueryBuilderDsl::of);
    }

}
