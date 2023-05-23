
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SuggestTokenizerQueryBuilderDsl {
    public SuggestTokenizerQueryBuilderDsl() {
    }

    public static SuggestTokenizerQueryBuilderDsl of() {
        return new SuggestTokenizerQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SuggestTokenizerQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, SuggestTokenizerQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SuggestTokenizerQueryBuilderDsl> asCustom(
            Function<com.commercetools.api.predicates.query.product.CustomTokenizerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.CustomTokenizerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.CustomTokenizerQueryBuilderDsl.of()),
            SuggestTokenizerQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SuggestTokenizerQueryBuilderDsl> asWhitespace(
            Function<com.commercetools.api.predicates.query.product.WhitespaceTokenizerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.WhitespaceTokenizerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.WhitespaceTokenizerQueryBuilderDsl.of()),
            SuggestTokenizerQueryBuilderDsl::of);
    }
}
