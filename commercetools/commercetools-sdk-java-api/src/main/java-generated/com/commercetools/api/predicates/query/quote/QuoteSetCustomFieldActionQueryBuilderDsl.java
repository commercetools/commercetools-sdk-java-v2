
package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

public class QuoteSetCustomFieldActionQueryBuilderDsl {
    public QuoteSetCustomFieldActionQueryBuilderDsl() {
    }

    public static QuoteSetCustomFieldActionQueryBuilderDsl of() {
        return new QuoteSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, QuoteSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<QuoteSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, QuoteSetCustomFieldActionQueryBuilderDsl::of));
    }
}
