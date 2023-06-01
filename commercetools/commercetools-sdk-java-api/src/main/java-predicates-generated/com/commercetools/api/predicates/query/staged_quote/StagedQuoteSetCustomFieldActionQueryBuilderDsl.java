package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteSetCustomFieldActionQueryBuilderDsl  {
    public StagedQuoteSetCustomFieldActionQueryBuilderDsl() {
    }

    public static StagedQuoteSetCustomFieldActionQueryBuilderDsl of() {
        return new StagedQuoteSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
