
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetCustomShippingMethodActionQueryBuilderDsl {
    public CartSetCustomShippingMethodActionQueryBuilderDsl() {
    }

    public static CartSetCustomShippingMethodActionQueryBuilderDsl of() {
        return new CartSetCustomShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetCustomShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomShippingMethodActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetCustomShippingMethodActionQueryBuilderDsl> shippingMethodName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodName")),
            p -> new CombinationQueryPredicate<>(p, CartSetCustomShippingMethodActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetCustomShippingMethodActionQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            CartSetCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartSetCustomShippingMethodActionQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            CartSetCustomShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartSetCustomShippingMethodActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartSetCustomShippingMethodActionQueryBuilderDsl::of);
    }

}
