package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl  {
    public StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl() {
    }

    public static StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl of() {
        return new StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl> sellerComment() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sellerComment")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteSellerCommentSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
