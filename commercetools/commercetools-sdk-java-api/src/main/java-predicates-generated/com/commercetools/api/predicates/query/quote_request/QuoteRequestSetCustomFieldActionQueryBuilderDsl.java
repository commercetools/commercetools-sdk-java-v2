package com.commercetools.api.predicates.query.quote_request;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteRequestSetCustomFieldActionQueryBuilderDsl  {
    public QuoteRequestSetCustomFieldActionQueryBuilderDsl() {
    }

    public static QuoteRequestSetCustomFieldActionQueryBuilderDsl of() {
        return new QuoteRequestSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestSetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteRequestSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestSetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
