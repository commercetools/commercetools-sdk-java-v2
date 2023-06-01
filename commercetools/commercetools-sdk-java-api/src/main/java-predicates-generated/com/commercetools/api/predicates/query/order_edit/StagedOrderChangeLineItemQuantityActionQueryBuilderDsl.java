package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderChangeLineItemQuantityActionQueryBuilderDsl  {
    public StagedOrderChangeLineItemQuantityActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeLineItemQuantityActionQueryBuilderDsl of() {
        return new StagedOrderChangeLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderChangeLineItemQuantityActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedOrderChangeLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderChangeLineItemQuantityActionQueryBuilderDsl> externalPrice(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StagedOrderChangeLineItemQuantityActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderChangeLineItemQuantityActionQueryBuilderDsl> externalTotalPrice(
        Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            StagedOrderChangeLineItemQuantityActionQueryBuilderDsl::of);
    }
    
    
}
