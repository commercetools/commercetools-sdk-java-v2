package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomTokenizerQueryBuilderDsl  {
    public CustomTokenizerQueryBuilderDsl() {
    }

    public static CustomTokenizerQueryBuilderDsl of() {
        return new CustomTokenizerQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomTokenizerQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CustomTokenizerQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<CustomTokenizerQueryBuilderDsl> inputs() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("inputs")),
        p -> new CombinationQueryPredicate<>(p, CustomTokenizerQueryBuilderDsl::of));
    }
    
}
