package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderRemoveLineItemActionQueryBuilderDsl  {
    public StagedOrderRemoveLineItemActionQueryBuilderDsl() {
    }

    public static StagedOrderRemoveLineItemActionQueryBuilderDsl of() {
        return new StagedOrderRemoveLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveLineItemActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderRemoveLineItemActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveLineItemActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedOrderRemoveLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveLineItemActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderRemoveLineItemActionQueryBuilderDsl> externalPrice(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StagedOrderRemoveLineItemActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderRemoveLineItemActionQueryBuilderDsl> externalTotalPrice(
        Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            StagedOrderRemoveLineItemActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderRemoveLineItemActionQueryBuilderDsl> shippingDetailsToRemove(
        Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingDetailsToRemove"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            StagedOrderRemoveLineItemActionQueryBuilderDsl::of);
    }
    
    
}
