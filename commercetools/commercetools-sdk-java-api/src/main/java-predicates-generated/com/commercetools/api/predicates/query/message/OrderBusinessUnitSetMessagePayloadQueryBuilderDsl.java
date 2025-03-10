
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderBusinessUnitSetMessagePayloadQueryBuilderDsl {
    public OrderBusinessUnitSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderBusinessUnitSetMessagePayloadQueryBuilderDsl of() {
        return new OrderBusinessUnitSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderBusinessUnitSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderBusinessUnitSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderBusinessUnitSetMessagePayloadQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            OrderBusinessUnitSetMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderBusinessUnitSetMessagePayloadQueryBuilderDsl> oldbusinessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldbusinessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            OrderBusinessUnitSetMessagePayloadQueryBuilderDsl::of);
    }

}
