
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartAddCustomLineItemActionQueryBuilderDsl {
    public CartAddCustomLineItemActionQueryBuilderDsl() {
    }

    public static CartAddCustomLineItemActionQueryBuilderDsl of() {
        return new CartAddCustomLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddCustomLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddCustomLineItemActionQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddCustomLineItemActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CartAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartAddCustomLineItemActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CartAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartAddCustomLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, CartAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartAddCustomLineItemActionQueryBuilderDsl> slug() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("slug")),
            p -> new CombinationQueryPredicate<>(p, CartAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddCustomLineItemActionQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            CartAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddCustomLineItemActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddCustomLineItemActionQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            CartAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddCustomLineItemActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CartAddCustomLineItemActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartAddCustomLineItemActionQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, CartAddCustomLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddCustomLineItemActionQueryBuilderDsl> recurrenceInfo(
            Function<com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrenceInfo"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.CustomLineItemRecurrenceInfoDraftQueryBuilderDsl
                            .of())),
            CartAddCustomLineItemActionQueryBuilderDsl::of);
    }

}
