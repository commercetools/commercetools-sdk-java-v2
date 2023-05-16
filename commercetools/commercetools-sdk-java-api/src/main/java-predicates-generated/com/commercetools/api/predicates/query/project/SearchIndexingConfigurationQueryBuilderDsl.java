
package com.commercetools.api.predicates.query.project;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SearchIndexingConfigurationQueryBuilderDsl {
    public SearchIndexingConfigurationQueryBuilderDsl() {
    }

    public static SearchIndexingConfigurationQueryBuilderDsl of() {
        return new SearchIndexingConfigurationQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SearchIndexingConfigurationQueryBuilderDsl> products(
            Function<com.commercetools.api.predicates.query.project.SearchIndexingConfigurationValuesQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.SearchIndexingConfigurationValuesQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("products"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.project.SearchIndexingConfigurationValuesQueryBuilderDsl
                            .of())),
            SearchIndexingConfigurationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<SearchIndexingConfigurationQueryBuilderDsl> orders(
            Function<com.commercetools.api.predicates.query.project.SearchIndexingConfigurationValuesQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.SearchIndexingConfigurationValuesQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("orders"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.project.SearchIndexingConfigurationValuesQueryBuilderDsl
                            .of())),
            SearchIndexingConfigurationQueryBuilderDsl::of);
    }

}
