
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl {
    public ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl() {
    }

    public static ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl of() {
        return new ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> textLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl::of);
    }

}
