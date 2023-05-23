
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingQueryBuilderDsl {
    public ShippingQueryBuilderDsl() {
    }

    public static ShippingQueryBuilderDsl of() {
        return new ShippingQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, ShippingQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingQueryBuilderDsl> shippingInfo(
            Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            ShippingQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            ShippingQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            ShippingQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingQueryBuilderDsl> shippingCustomFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingCustomFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ShippingQueryBuilderDsl::of);
    }

}
