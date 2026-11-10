
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetProductAttributeActionQueryBuilderDsl {
    public ProductSetProductAttributeActionQueryBuilderDsl() {
    }

    public static ProductSetProductAttributeActionQueryBuilderDsl of() {
        return new ProductSetProductAttributeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetProductAttributeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetProductAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetProductAttributeActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSetProductAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetProductAttributeActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductSetProductAttributeActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetProductAttributeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetProductAttributeActionQueryBuilderDsl::of));
    }

}
