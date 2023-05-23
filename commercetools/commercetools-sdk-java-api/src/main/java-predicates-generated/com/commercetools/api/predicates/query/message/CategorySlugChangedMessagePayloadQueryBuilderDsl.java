
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategorySlugChangedMessagePayloadQueryBuilderDsl {
    public CategorySlugChangedMessagePayloadQueryBuilderDsl() {
    }

    public static CategorySlugChangedMessagePayloadQueryBuilderDsl of() {
        return new CategorySlugChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySlugChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CategorySlugChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategorySlugChangedMessagePayloadQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategorySlugChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategorySlugChangedMessagePayloadQueryBuilderDsl> oldSlug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldSlug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategorySlugChangedMessagePayloadQueryBuilderDsl::of);
    }

}
