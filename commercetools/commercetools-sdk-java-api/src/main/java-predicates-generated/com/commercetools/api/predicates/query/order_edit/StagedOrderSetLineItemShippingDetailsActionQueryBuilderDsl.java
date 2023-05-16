
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl {
    public StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl of() {
        return new StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            StagedOrderSetLineItemShippingDetailsActionQueryBuilderDsl::of);
    }

}
