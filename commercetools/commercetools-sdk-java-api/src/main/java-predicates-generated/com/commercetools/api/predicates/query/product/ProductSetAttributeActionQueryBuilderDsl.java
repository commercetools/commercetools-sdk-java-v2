package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetAttributeActionQueryBuilderDsl  {
    public ProductSetAttributeActionQueryBuilderDsl() {
    }

    public static ProductSetAttributeActionQueryBuilderDsl of() {
        return new ProductSetAttributeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAttributeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAttributeActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSetAttributeActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAttributeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAttributeActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAttributeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAttributeActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAttributeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAttributeActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAttributeActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetAttributeActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAttributeActionQueryBuilderDsl::of));
    }
    
}
