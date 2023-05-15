
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetCustomFieldActionQueryBuilderDsl {
    public DiscountCodeSetCustomFieldActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetCustomFieldActionQueryBuilderDsl of() {
        return new DiscountCodeSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetCustomFieldActionQueryBuilderDsl::of));
    }
}
