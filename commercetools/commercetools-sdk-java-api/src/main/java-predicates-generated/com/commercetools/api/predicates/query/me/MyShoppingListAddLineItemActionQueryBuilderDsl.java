
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListAddLineItemActionQueryBuilderDsl {
    public MyShoppingListAddLineItemActionQueryBuilderDsl() {
    }

    public static MyShoppingListAddLineItemActionQueryBuilderDsl of() {
        return new MyShoppingListAddLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListAddLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListAddLineItemActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListAddLineItemActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListAddLineItemActionQueryBuilderDsl> productId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyShoppingListAddLineItemActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MyShoppingListAddLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<MyShoppingListAddLineItemActionQueryBuilderDsl> addedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedAt")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListAddLineItemActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListAddLineItemActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            MyShoppingListAddLineItemActionQueryBuilderDsl::of);
    }

}
