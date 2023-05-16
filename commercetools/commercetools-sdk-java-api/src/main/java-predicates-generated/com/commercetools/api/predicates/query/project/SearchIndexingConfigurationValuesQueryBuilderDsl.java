
package com.commercetools.api.predicates.query.project;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchIndexingConfigurationValuesQueryBuilderDsl {
    public SearchIndexingConfigurationValuesQueryBuilderDsl() {
    }

    public static SearchIndexingConfigurationValuesQueryBuilderDsl of() {
        return new SearchIndexingConfigurationValuesQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SearchIndexingConfigurationValuesQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, SearchIndexingConfigurationValuesQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SearchIndexingConfigurationValuesQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, SearchIndexingConfigurationValuesQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SearchIndexingConfigurationValuesQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            SearchIndexingConfigurationValuesQueryBuilderDsl::of);
    }

}
