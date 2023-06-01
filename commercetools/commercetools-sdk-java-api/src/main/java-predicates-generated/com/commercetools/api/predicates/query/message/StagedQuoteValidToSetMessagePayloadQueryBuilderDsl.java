package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteValidToSetMessagePayloadQueryBuilderDsl  {
    public StagedQuoteValidToSetMessagePayloadQueryBuilderDsl() {
    }

    public static StagedQuoteValidToSetMessagePayloadQueryBuilderDsl of() {
        return new StagedQuoteValidToSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteValidToSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessagePayloadQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StagedQuoteValidToSetMessagePayloadQueryBuilderDsl> validTo() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validTo")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteValidToSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
