
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl {
    public StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl of() {
        return new StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl> externalTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxAmount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl.of())),
            StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemTaxAmountActionQueryBuilderDsl::of));
    }
}
