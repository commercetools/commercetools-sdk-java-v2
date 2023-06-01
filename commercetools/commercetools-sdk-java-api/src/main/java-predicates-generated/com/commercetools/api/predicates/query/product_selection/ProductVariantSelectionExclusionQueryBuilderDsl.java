package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


@Deprecated
public class ProductVariantSelectionExclusionQueryBuilderDsl  {
    public ProductVariantSelectionExclusionQueryBuilderDsl() {
    }

    public static ProductVariantSelectionExclusionQueryBuilderDsl of() {
        return new ProductVariantSelectionExclusionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantSelectionExclusionQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionExclusionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProductVariantSelectionExclusionQueryBuilderDsl> skus() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skus")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantSelectionExclusionQueryBuilderDsl::of));
    }
    
}
