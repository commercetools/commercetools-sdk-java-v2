package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyOrderFromCartDraftQueryBuilderDsl  {
    public MyOrderFromCartDraftQueryBuilderDsl() {
    }

    public static MyOrderFromCartDraftQueryBuilderDsl of() {
        return new MyOrderFromCartDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyOrderFromCartDraftQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, MyOrderFromCartDraftQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyOrderFromCartDraftQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, MyOrderFromCartDraftQueryBuilderDsl::of));
    }
    
}
