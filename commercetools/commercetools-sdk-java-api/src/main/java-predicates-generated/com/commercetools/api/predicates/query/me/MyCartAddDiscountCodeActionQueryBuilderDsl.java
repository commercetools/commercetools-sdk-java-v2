package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartAddDiscountCodeActionQueryBuilderDsl  {
    public MyCartAddDiscountCodeActionQueryBuilderDsl() {
    }

    public static MyCartAddDiscountCodeActionQueryBuilderDsl of() {
        return new MyCartAddDiscountCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartAddDiscountCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddDiscountCodeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartAddDiscountCodeActionQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddDiscountCodeActionQueryBuilderDsl::of));
    }
    
}
