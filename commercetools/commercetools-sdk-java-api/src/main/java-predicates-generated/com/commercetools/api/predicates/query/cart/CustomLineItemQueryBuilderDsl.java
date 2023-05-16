
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomLineItemQueryBuilderDsl {
    public CustomLineItemQueryBuilderDsl() {
    }

    public static CustomLineItemQueryBuilderDsl of() {
        return new CustomLineItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomLineItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> money(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("money"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomLineItemQueryBuilderDsl> slug() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("slug")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CustomLineItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomLineItemQueryBuilderDsl> state() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> taxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxRate"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> discountedPricePerQuantity(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountedPricePerQuantity"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl
                            .of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomLineItemQueryBuilderDsl> discountedPricePerQuantity() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedPricePerQuantity")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomLineItemQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl.of())),
            CustomLineItemQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CustomLineItemQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, CustomLineItemQueryBuilderDsl::of));
    }

}
