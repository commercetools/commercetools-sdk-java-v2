
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl {
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl> shippingMethodName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodName")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressAndCustomShippingMethodActionQueryBuilderDsl::of);
    }

}
