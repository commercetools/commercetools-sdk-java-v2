package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductVariantSelectionIncludeOnlyQueryBuilderDsl  {
    public ProductVariantSelectionIncludeOnlyQueryBuilderDsl() {
    }

    public static ProductVariantSelectionIncludeOnlyQueryBuilderDsl of() {
        return new ProductVariantSelectionIncludeOnlyQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantSelectionIncludeOnlyQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionIncludeOnlyQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProductVariantSelectionIncludeOnlyQueryBuilderDsl> skus() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skus")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionIncludeOnlyQueryBuilderDsl::of));
    }
    
}
