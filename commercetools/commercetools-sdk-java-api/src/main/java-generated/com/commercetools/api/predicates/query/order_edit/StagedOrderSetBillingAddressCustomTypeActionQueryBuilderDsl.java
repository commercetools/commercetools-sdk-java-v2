
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl {
    public StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl of() {
        return new StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            StagedOrderSetBillingAddressCustomTypeActionQueryBuilderDsl::of);
    }

}
