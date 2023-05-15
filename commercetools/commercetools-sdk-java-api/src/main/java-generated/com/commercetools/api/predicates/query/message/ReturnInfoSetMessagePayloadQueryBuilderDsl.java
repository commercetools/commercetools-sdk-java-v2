
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ReturnInfoSetMessagePayloadQueryBuilderDsl {
    public ReturnInfoSetMessagePayloadQueryBuilderDsl() {
    }

    public static ReturnInfoSetMessagePayloadQueryBuilderDsl of() {
        return new ReturnInfoSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReturnInfoSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ReturnInfoSetMessagePayloadQueryBuilderDsl> returnInfo(
            Function<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("returnInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoQueryBuilderDsl.of())),
            ReturnInfoSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ReturnInfoSetMessagePayloadQueryBuilderDsl> returnInfo() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnInfo")),
            p -> new CombinationQueryPredicate<>(p, ReturnInfoSetMessagePayloadQueryBuilderDsl::of));
    }
}
