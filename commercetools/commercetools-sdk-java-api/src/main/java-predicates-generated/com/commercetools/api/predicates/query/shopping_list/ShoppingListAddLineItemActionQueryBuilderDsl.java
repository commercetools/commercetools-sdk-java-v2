
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListAddLineItemActionQueryBuilderDsl {
    public ShoppingListAddLineItemActionQueryBuilderDsl() {
    }

    public static ShoppingListAddLineItemActionQueryBuilderDsl of() {
        return new ShoppingListAddLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListAddLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListAddLineItemActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListAddLineItemActionQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListAddLineItemActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListAddLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListAddLineItemActionQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListAddLineItemActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ShoppingListAddLineItemActionQueryBuilderDsl::of);
    }

}
