
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class LineItemQueryBuilderDsl {
    public LineItemQueryBuilderDsl() {
    }

    public static LineItemQueryBuilderDsl of() {
        return new LineItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LineItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> productSlug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productSlug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> productType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productType"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> variant(
            Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variant"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<LineItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> totalPrice(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("totalPrice"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> discountedPricePerQuantity(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountedPricePerQuantity"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceForQuantityQueryBuilderDsl
                            .of())),
            LineItemQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<LineItemQueryBuilderDsl> discountedPricePerQuantity() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("discountedPricePerQuantity")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> taxedPricePortions(
            Function<com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPricePortions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.MethodTaxedPriceQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<LineItemQueryBuilderDsl> taxedPricePortions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxedPricePortions")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.ItemStateQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<LineItemQueryBuilderDsl> state() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> taxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxRate"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> perMethodTaxRate(
            Function<com.commercetools.api.predicates.query.cart.MethodTaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.MethodTaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("perMethodTaxRate"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.MethodTaxRateQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<LineItemQueryBuilderDsl> perMethodTaxRate() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("perMethodTaxRate")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> distributionChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<LineItemQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQueryBuilderDsl> lineItemMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemMode")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LineItemQueryBuilderDsl> inventoryMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inventoryMode")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> shippingDetails(
            Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<LineItemQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            LineItemQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<LineItemQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<LineItemQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, LineItemQueryBuilderDsl::of));
    }

}
