
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectSetProductCatalogModelActionQueryBuilderDsl {
    public ProjectSetProductCatalogModelActionQueryBuilderDsl() {
    }

    public static ProjectSetProductCatalogModelActionQueryBuilderDsl of() {
        return new ProjectSetProductCatalogModelActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectSetProductCatalogModelActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetProductCatalogModelActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectSetProductCatalogModelActionQueryBuilderDsl> productCatalogModel() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productCatalogModel")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetProductCatalogModelActionQueryBuilderDsl::of));
    }

}
