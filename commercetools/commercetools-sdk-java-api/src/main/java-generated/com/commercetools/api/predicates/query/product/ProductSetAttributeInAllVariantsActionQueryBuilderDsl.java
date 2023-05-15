
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductSetAttributeInAllVariantsActionQueryBuilderDsl {
    public ProductSetAttributeInAllVariantsActionQueryBuilderDsl() {
    }

    public static ProductSetAttributeInAllVariantsActionQueryBuilderDsl of() {
        return new ProductSetAttributeInAllVariantsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAttributeInAllVariantsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAttributeInAllVariantsActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetAttributeInAllVariantsActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetAttributeInAllVariantsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }
}
