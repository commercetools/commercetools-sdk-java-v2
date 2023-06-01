package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListResourceIdentifierQueryBuilderDsl  {
    public ShoppingListResourceIdentifierQueryBuilderDsl() {
    }

    public static ShoppingListResourceIdentifierQueryBuilderDsl of() {
        return new ShoppingListResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListResourceIdentifierQueryBuilderDsl::of));
    }
    
}
