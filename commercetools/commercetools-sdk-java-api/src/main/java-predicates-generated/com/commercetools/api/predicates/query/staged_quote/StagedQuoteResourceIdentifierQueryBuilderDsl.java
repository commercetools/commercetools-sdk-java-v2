
package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteResourceIdentifierQueryBuilderDsl {
    public StagedQuoteResourceIdentifierQueryBuilderDsl() {
    }

    public static StagedQuoteResourceIdentifierQueryBuilderDsl of() {
        return new StagedQuoteResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedQuoteResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteResourceIdentifierQueryBuilderDsl::of));
    }

}
