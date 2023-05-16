
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategorySetMetaKeywordsActionQueryBuilderDsl {
    public CategorySetMetaKeywordsActionQueryBuilderDsl() {
    }

    public static CategorySetMetaKeywordsActionQueryBuilderDsl of() {
        return new CategorySetMetaKeywordsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetMetaKeywordsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetMetaKeywordsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategorySetMetaKeywordsActionQueryBuilderDsl> metaKeywords(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategorySetMetaKeywordsActionQueryBuilderDsl::of);
    }

}
