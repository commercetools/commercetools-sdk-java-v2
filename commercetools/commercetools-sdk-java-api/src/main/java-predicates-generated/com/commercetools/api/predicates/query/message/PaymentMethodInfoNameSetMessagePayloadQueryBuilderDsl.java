
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl {
    public PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl> oldName(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldName"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentMethodInfoNameSetMessagePayloadQueryBuilderDsl::of);
    }

}
