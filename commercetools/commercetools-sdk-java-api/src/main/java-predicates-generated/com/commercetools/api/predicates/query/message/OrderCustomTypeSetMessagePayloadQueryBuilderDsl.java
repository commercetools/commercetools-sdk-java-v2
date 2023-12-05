
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomTypeSetMessagePayloadQueryBuilderDsl {
    public OrderCustomTypeSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomTypeSetMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomTypeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomTypeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomTypeSetMessagePayloadQueryBuilderDsl> customFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            OrderCustomTypeSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderCustomTypeSetMessagePayloadQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

}
