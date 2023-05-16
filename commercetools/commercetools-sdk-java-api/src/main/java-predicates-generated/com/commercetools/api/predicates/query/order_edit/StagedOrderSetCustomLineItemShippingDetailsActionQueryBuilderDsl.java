
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl {
    public StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            StagedOrderSetCustomLineItemShippingDetailsActionQueryBuilderDsl::of);
    }

}
