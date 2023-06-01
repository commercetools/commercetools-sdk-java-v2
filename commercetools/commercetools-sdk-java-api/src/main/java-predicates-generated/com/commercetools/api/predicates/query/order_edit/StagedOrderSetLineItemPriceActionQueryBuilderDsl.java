package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetLineItemPriceActionQueryBuilderDsl  {
    public StagedOrderSetLineItemPriceActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLineItemPriceActionQueryBuilderDsl of() {
        return new StagedOrderSetLineItemPriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemPriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemPriceActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetLineItemPriceActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemPriceActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetLineItemPriceActionQueryBuilderDsl> externalPrice(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StagedOrderSetLineItemPriceActionQueryBuilderDsl::of);
    }
    
    
}
