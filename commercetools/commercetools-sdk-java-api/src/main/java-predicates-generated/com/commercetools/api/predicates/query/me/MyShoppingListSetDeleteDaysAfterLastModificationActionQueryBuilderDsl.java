package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl  {
    public MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl() {
    }

    public static MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl of() {
        return new MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }
    
}
