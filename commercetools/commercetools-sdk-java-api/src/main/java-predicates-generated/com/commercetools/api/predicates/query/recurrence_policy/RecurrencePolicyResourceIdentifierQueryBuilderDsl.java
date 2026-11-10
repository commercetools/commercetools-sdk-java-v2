
package com.commercetools.api.predicates.query.recurrence_policy;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyResourceIdentifierQueryBuilderDsl {
    public RecurrencePolicyResourceIdentifierQueryBuilderDsl() {
    }

    public static RecurrencePolicyResourceIdentifierQueryBuilderDsl of() {
        return new RecurrencePolicyResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyResourceIdentifierQueryBuilderDsl::of));
    }

}
