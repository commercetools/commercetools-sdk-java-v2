
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupUpdateActionQueryBuilderDsl {
    public DiscountGroupUpdateActionQueryBuilderDsl() {
    }

    public static DiscountGroupUpdateActionQueryBuilderDsl of() {
        return new DiscountGroupUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.discount_group.DiscountGroupSetDescriptionActionQueryBuilderDsl
                    .of()),
            DiscountGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupUpdateActionQueryBuilderDsl> asSetIsActive(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetIsActiveActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetIsActiveActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.discount_group.DiscountGroupSetIsActiveActionQueryBuilderDsl.of()),
            DiscountGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.discount_group.DiscountGroupSetKeyActionQueryBuilderDsl.of()),
            DiscountGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.discount_group.DiscountGroupSetNameActionQueryBuilderDsl.of()),
            DiscountGroupUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<DiscountGroupUpdateActionQueryBuilderDsl> asSetSortOrder(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetSortOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupSetSortOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.discount_group.DiscountGroupSetSortOrderActionQueryBuilderDsl.of()),
            DiscountGroupUpdateActionQueryBuilderDsl::of);
    }
}
