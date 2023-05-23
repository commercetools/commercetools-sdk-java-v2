
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl {
    public MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl of() {
        return new MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl> textLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItemId")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl::of);
    }

}
