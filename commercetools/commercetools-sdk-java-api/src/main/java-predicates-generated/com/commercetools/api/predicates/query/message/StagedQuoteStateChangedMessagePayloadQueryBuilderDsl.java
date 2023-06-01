package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteStateChangedMessagePayloadQueryBuilderDsl  {
    public StagedQuoteStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StagedQuoteStateChangedMessagePayloadQueryBuilderDsl of() {
        return new StagedQuoteStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteStateChangedMessagePayloadQueryBuilderDsl> stagedQuoteState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stagedQuoteState")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteStateChangedMessagePayloadQueryBuilderDsl> oldStagedQuoteState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStagedQuoteState")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
