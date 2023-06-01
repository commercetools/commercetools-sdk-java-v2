package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl  {
    public MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl() {
    }

    public static MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl of() {
        return new MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
        p -> new CombinationQueryPredicate<>(p, MyCartSetDeleteDaysAfterLastModificationActionQueryBuilderDsl::of));
    }
    
}
