
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetOrderTotalTaxActionQueryBuilderDsl {
    public StagedOrderSetOrderTotalTaxActionQueryBuilderDsl() {
    }

    public static StagedOrderSetOrderTotalTaxActionQueryBuilderDsl of() {
        return new StagedOrderSetOrderTotalTaxActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetOrderTotalTaxActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetOrderTotalTaxActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetOrderTotalTaxActionQueryBuilderDsl> externalTotalGross(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTotalGross"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StagedOrderSetOrderTotalTaxActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetOrderTotalTaxActionQueryBuilderDsl> externalTaxPortions(
            Function<com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("externalTaxPortions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxPortionDraftQueryBuilderDsl.of())),
            StagedOrderSetOrderTotalTaxActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StagedOrderSetOrderTotalTaxActionQueryBuilderDsl> externalTaxPortions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalTaxPortions")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetOrderTotalTaxActionQueryBuilderDsl::of));
    }

}
