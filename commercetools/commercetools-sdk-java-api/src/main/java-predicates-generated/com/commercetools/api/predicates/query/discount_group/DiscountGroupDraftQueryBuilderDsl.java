
package com.commercetools.api.predicates.query.discount_group;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupDraftQueryBuilderDsl {
    public DiscountGroupDraftQueryBuilderDsl() {
    }

    public static DiscountGroupDraftQueryBuilderDsl of() {
        return new DiscountGroupDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<DiscountGroupDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountGroupDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountGroupDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            DiscountGroupDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<DiscountGroupDraftQueryBuilderDsl> sortOrder() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sortOrder")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupDraftQueryBuilderDsl::of));
    }

}
