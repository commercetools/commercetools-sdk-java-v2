
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeChangeGroupsActionQueryBuilderDsl {
    public DiscountCodeChangeGroupsActionQueryBuilderDsl() {
    }

    public static DiscountCodeChangeGroupsActionQueryBuilderDsl of() {
        return new DiscountCodeChangeGroupsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeChangeGroupsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeChangeGroupsActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<DiscountCodeChangeGroupsActionQueryBuilderDsl> groups() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("groups")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeChangeGroupsActionQueryBuilderDsl::of));
    }
}
