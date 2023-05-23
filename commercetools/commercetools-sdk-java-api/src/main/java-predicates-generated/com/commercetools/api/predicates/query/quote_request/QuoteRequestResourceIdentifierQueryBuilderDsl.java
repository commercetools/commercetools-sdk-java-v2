
package com.commercetools.api.predicates.query.quote_request;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestResourceIdentifierQueryBuilderDsl {
    public QuoteRequestResourceIdentifierQueryBuilderDsl() {
    }

    public static QuoteRequestResourceIdentifierQueryBuilderDsl of() {
        return new QuoteRequestResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteRequestResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestResourceIdentifierQueryBuilderDsl::of));
    }

}
