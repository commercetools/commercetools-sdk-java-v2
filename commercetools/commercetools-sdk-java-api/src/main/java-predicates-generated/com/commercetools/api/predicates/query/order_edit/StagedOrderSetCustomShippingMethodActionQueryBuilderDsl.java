
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetCustomShippingMethodActionQueryBuilderDsl {
    public StagedOrderSetCustomShippingMethodActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomShippingMethodActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomShippingMethodActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomShippingMethodActionQueryBuilderDsl> shippingMethodName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodName")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomShippingMethodActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetCustomShippingMethodActionQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            StagedOrderSetCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetCustomShippingMethodActionQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            StagedOrderSetCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetCustomShippingMethodActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            StagedOrderSetCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedOrderSetCustomShippingMethodActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            StagedOrderSetCustomShippingMethodActionQueryBuilderDsl::of);
    }

}
