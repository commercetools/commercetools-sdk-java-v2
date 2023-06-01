package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentInteractionAddedMessagePayloadQueryBuilderDsl  {
    public PaymentInteractionAddedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentInteractionAddedMessagePayloadQueryBuilderDsl of() {
        return new PaymentInteractionAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentInteractionAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PaymentInteractionAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentInteractionAddedMessagePayloadQueryBuilderDsl> interaction(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("interaction"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            PaymentInteractionAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
