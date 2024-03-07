
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetDescriptionActionQueryBuilderDsl {
    public ProductTailoringSetDescriptionActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetDescriptionActionQueryBuilderDsl of() {
        return new ProductTailoringSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductTailoringSetDescriptionActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetDescriptionActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetDescriptionActionQueryBuilderDsl::of));
    }

}
