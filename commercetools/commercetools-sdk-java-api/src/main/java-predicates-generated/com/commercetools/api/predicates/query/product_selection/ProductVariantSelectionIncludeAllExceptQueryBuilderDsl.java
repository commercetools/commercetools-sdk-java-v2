package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductVariantSelectionIncludeAllExceptQueryBuilderDsl  {
    public ProductVariantSelectionIncludeAllExceptQueryBuilderDsl() {
    }

    public static ProductVariantSelectionIncludeAllExceptQueryBuilderDsl of() {
        return new ProductVariantSelectionIncludeAllExceptQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantSelectionIncludeAllExceptQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionIncludeAllExceptQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProductVariantSelectionIncludeAllExceptQueryBuilderDsl> skus() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skus")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionIncludeAllExceptQueryBuilderDsl::of));
    }
    
}
