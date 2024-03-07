
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetMetaDescriptionActionQueryBuilderDsl {
    public ProductTailoringSetMetaDescriptionActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetMetaDescriptionActionQueryBuilderDsl of() {
        return new ProductTailoringSetMetaDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetMetaDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetMetaDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetMetaDescriptionActionQueryBuilderDsl> metaDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSetMetaDescriptionActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetMetaDescriptionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetMetaDescriptionActionQueryBuilderDsl::of));
    }

}
