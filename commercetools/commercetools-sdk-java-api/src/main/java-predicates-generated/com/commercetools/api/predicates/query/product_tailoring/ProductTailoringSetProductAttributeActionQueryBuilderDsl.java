
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetProductAttributeActionQueryBuilderDsl {
    public ProductTailoringSetProductAttributeActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetProductAttributeActionQueryBuilderDsl of() {
        return new ProductTailoringSetProductAttributeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetProductAttributeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetProductAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetProductAttributeActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetProductAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetProductAttributeActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetProductAttributeActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetProductAttributeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetProductAttributeActionQueryBuilderDsl::of));
    }

}
