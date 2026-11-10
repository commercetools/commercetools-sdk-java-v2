
package com.commercetools.api.predicates.query.product_tailoring;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetAttributeActionQueryBuilderDsl {
    public ProductTailoringSetAttributeActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetAttributeActionQueryBuilderDsl of() {
        return new ProductTailoringSetAttributeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAttributeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAttributeActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringSetAttributeActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAttributeActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAttributeActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAttributeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetAttributeActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAttributeActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetAttributeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetAttributeActionQueryBuilderDsl::of));
    }

}
