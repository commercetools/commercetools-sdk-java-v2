package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSetAssetCustomFieldActionQueryBuilderDsl  {
    public ProductSetAssetCustomFieldActionQueryBuilderDsl() {
    }

    public static ProductSetAssetCustomFieldActionQueryBuilderDsl of() {
        return new ProductSetAssetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> assetId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetId")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> assetKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assetKey")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSetAssetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, ProductSetAssetCustomFieldActionQueryBuilderDsl::of));
    }
    
}
