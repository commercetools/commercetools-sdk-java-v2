package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListLineItemDraftQueryBuilderDsl  {
    public ShoppingListLineItemDraftQueryBuilderDsl() {
    }

    public static ShoppingListLineItemDraftQueryBuilderDsl of() {
        return new ShoppingListLineItemDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemDraftQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ShoppingListLineItemDraftQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemDraftQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListLineItemDraftQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemDraftQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ShoppingListLineItemDraftQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemDraftQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListLineItemDraftQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ShoppingListLineItemDraftQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ShoppingListLineItemDraftQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemDraftQueryBuilderDsl::of));
    }
    
}
