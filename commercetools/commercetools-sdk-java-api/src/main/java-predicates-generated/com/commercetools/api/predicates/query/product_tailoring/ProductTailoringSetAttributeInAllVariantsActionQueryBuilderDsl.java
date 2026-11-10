
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl {
    public ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl of() {
        return new ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")), p -> new CombinationQueryPredicate<>(p,
                ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p,
                ProductTailoringSetAttributeInAllVariantsActionQueryBuilderDsl::of));
    }

}
