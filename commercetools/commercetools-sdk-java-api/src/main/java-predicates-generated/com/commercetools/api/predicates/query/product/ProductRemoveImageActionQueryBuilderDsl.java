package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductRemoveImageActionQueryBuilderDsl  {
    public ProductRemoveImageActionQueryBuilderDsl() {
    }

    public static ProductRemoveImageActionQueryBuilderDsl of() {
        return new ProductRemoveImageActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemoveImageActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveImageActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductRemoveImageActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveImageActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductRemoveImageActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveImageActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductRemoveImageActionQueryBuilderDsl> imageUrl() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imageUrl")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveImageActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductRemoveImageActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductRemoveImageActionQueryBuilderDsl::of));
    }
    
}
