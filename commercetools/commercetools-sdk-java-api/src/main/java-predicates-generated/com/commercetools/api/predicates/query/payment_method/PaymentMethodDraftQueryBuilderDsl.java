
package com.commercetools.api.predicates.query.payment_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodDraftQueryBuilderDsl {
    public PaymentMethodDraftQueryBuilderDsl() {
    }

    public static PaymentMethodDraftQueryBuilderDsl of() {
        return new PaymentMethodDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentMethodDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodDraftQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            PaymentMethodDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodDraftQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            PaymentMethodDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodDraftQueryBuilderDsl> method() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("method")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodDraftQueryBuilderDsl> paymentInterface() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentInterface")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentMethodDraftQueryBuilderDsl> interfaceAccount() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceAccount")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodDraftQueryBuilderDsl> token(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("token"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment_method.PaymentMethodTokenQueryBuilderDsl.of())),
            PaymentMethodDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<PaymentMethodDraftQueryBuilderDsl> paymentMethodStatus() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentMethodStatus")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDraftQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<PaymentMethodDraftQueryBuilderDsl> _default() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("default")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            PaymentMethodDraftQueryBuilderDsl::of);
    }

}
