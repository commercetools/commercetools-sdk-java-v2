
package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteSetSellerCommentActionQueryBuilderDsl {
    public StagedQuoteSetSellerCommentActionQueryBuilderDsl() {
    }

    public static StagedQuoteSetSellerCommentActionQueryBuilderDsl of() {
        return new StagedQuoteSetSellerCommentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteSetSellerCommentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSetSellerCommentActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteSetSellerCommentActionQueryBuilderDsl> sellerComment() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sellerComment")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteSetSellerCommentActionQueryBuilderDsl::of));
    }

}
