package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReturnInfoAddedMessagePayloadQueryBuilderDsl  {
    public ReturnInfoAddedMessagePayloadQueryBuilderDsl() {
    }

    public static ReturnInfoAddedMessagePayloadQueryBuilderDsl of() {
        return new ReturnInfoAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReturnInfoAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ReturnInfoAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReturnInfoAddedMessagePayloadQueryBuilderDsl> returnInfo(
        Function<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("returnInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl.of())),
            ReturnInfoAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
