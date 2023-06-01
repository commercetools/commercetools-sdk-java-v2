package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetSearchKeywordsActionQueryBuilderDsl  {
    public ProductSetSearchKeywordsActionQueryBuilderDsl() {
    }

    public static ProductSetSearchKeywordsActionQueryBuilderDsl of() {
        return new ProductSetSearchKeywordsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetSearchKeywordsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetSearchKeywordsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSetSearchKeywordsActionQueryBuilderDsl> searchKeywords(
        Function<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("searchKeywords"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.SearchKeywordsQueryBuilderDsl.of())),
            ProductSetSearchKeywordsActionQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductSetSearchKeywordsActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetSearchKeywordsActionQueryBuilderDsl::of));
    }
    
}
