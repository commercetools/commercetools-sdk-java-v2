
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl {
    public StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl> externalTaxAmount(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxAmount"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ExternalTaxAmountDraftQueryBuilderDsl.of())),
            StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemTaxAmountActionQueryBuilderDsl::of));
    }

}
