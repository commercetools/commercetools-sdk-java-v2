package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductVariantExclusionQueryBuilderDsl  {
    public ProductVariantExclusionQueryBuilderDsl() {
    }

    public static ProductVariantExclusionQueryBuilderDsl of() {
        return new ProductVariantExclusionQueryBuilderDsl();
    }

    public StringCollectionPredicateBuilder<ProductVariantExclusionQueryBuilderDsl> skus() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skus")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantExclusionQueryBuilderDsl::of));
    }
    
}
