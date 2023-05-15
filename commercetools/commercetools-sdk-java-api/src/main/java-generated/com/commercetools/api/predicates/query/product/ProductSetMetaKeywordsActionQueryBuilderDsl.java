
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSetMetaKeywordsActionQueryBuilderDsl {
    public ProductSetMetaKeywordsActionQueryBuilderDsl() {
    }

    public static ProductSetMetaKeywordsActionQueryBuilderDsl of() {
        return new ProductSetMetaKeywordsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetMetaKeywordsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetMetaKeywordsActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSetMetaKeywordsActionQueryBuilderDsl> metaKeywords(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSetMetaKeywordsActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductSetMetaKeywordsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetMetaKeywordsActionQueryBuilderDsl::of));
    }
}
