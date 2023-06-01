package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl  {
    public StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl> externalTaxRate(
        Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            StagedOrderSetCustomLineItemTaxRateActionQueryBuilderDsl::of);
    }
    
    
}
