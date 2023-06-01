package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyShoppingListSetDescriptionActionQueryBuilderDsl  {
    public MyShoppingListSetDescriptionActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetDescriptionActionQueryBuilderDsl of() {
        return new MyShoppingListSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetDescriptionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyShoppingListSetDescriptionActionQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            MyShoppingListSetDescriptionActionQueryBuilderDsl::of);
    }
    
    
}
