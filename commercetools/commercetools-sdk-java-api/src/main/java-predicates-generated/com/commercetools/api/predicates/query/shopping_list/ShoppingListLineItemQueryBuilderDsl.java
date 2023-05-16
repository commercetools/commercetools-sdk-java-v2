
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListLineItemQueryBuilderDsl {
    public ShoppingListLineItemQueryBuilderDsl() {
    }

    public static ShoppingListLineItemQueryBuilderDsl of() {
        return new ShoppingListLineItemQueryBuilderDsl();
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListLineItemQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ShoppingListLineItemQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListLineItemQueryBuilderDsl> deactivatedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deactivatedAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListLineItemQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemQueryBuilderDsl> productType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productType"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl.of())),
            ShoppingListLineItemQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemQueryBuilderDsl> variant(
            Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variant"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ShoppingListLineItemQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListLineItemQueryBuilderDsl> productSlug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productSlug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListLineItemQueryBuilderDsl::of);
    }

}
