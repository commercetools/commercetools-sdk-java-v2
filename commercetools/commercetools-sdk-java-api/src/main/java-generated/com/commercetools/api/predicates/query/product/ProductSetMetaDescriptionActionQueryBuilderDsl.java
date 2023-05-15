
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSetMetaDescriptionActionQueryBuilderDsl {
    public ProductSetMetaDescriptionActionQueryBuilderDsl() {
    }

    public static ProductSetMetaDescriptionActionQueryBuilderDsl of() {
        return new ProductSetMetaDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetMetaDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetMetaDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSetMetaDescriptionActionQueryBuilderDsl> metaDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductSetMetaDescriptionActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductSetMetaDescriptionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetMetaDescriptionActionQueryBuilderDsl::of));
    }
}
