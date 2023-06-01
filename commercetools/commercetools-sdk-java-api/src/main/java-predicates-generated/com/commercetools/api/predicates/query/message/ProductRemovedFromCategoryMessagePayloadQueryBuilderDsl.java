package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl  {
    public ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl() {
    }

    public static ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl of() {
        return new ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl> category(
        Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("category"))
            .inner(fn.apply(com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of())),
            ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessagePayloadQueryBuilderDsl::of));
    }
    
}
