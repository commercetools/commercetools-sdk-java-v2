
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetMetaKeywordsActionQueryBuilderDsl {
    public ProductTailoringSetMetaKeywordsActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetMetaKeywordsActionQueryBuilderDsl of() {
        return new ProductTailoringSetMetaKeywordsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetMetaKeywordsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetMetaKeywordsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetMetaKeywordsActionQueryBuilderDsl> metaKeywords(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSetMetaKeywordsActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetMetaKeywordsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetMetaKeywordsActionQueryBuilderDsl::of));
    }

}
