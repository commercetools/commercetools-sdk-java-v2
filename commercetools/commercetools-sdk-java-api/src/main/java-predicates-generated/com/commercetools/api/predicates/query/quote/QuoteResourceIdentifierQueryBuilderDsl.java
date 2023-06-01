package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteResourceIdentifierQueryBuilderDsl  {
    public QuoteResourceIdentifierQueryBuilderDsl() {
    }

    public static QuoteResourceIdentifierQueryBuilderDsl of() {
        return new QuoteResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, QuoteResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, QuoteResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<QuoteResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, QuoteResourceIdentifierQueryBuilderDsl::of));
    }
    
}
