package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class WhitespaceTokenizerQueryBuilderDsl  {
    public WhitespaceTokenizerQueryBuilderDsl() {
    }

    public static WhitespaceTokenizerQueryBuilderDsl of() {
        return new WhitespaceTokenizerQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<WhitespaceTokenizerQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, WhitespaceTokenizerQueryBuilderDsl::of));
    }
    
}
