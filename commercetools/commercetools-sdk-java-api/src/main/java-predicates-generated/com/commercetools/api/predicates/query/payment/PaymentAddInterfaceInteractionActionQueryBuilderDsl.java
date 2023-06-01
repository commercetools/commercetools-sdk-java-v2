package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentAddInterfaceInteractionActionQueryBuilderDsl  {
    public PaymentAddInterfaceInteractionActionQueryBuilderDsl() {
    }

    public static PaymentAddInterfaceInteractionActionQueryBuilderDsl of() {
        return new PaymentAddInterfaceInteractionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentAddInterfaceInteractionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentAddInterfaceInteractionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentAddInterfaceInteractionActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            PaymentAddInterfaceInteractionActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<PaymentAddInterfaceInteractionActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            PaymentAddInterfaceInteractionActionQueryBuilderDsl::of);
    }
    
    
}
