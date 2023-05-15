
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl {
    public StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl> shippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl
                            .of())),
            StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressAndShippingMethodActionQueryBuilderDsl::of);
    }

}
