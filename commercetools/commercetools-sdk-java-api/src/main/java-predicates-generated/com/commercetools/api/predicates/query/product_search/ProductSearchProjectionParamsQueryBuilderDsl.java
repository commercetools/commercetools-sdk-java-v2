
package com.commercetools.api.predicates.query.product_search;

import com.commercetools.api.predicates.query.*;

public class ProductSearchProjectionParamsQueryBuilderDsl {
    public ProductSearchProjectionParamsQueryBuilderDsl() {
    }

    public static ProductSearchProjectionParamsQueryBuilderDsl of() {
        return new ProductSearchProjectionParamsQueryBuilderDsl();
    }

    public StringCollectionPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> expand() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expand")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> priceCurrency() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceCurrency")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> priceCountry() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceCountry")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> priceCustomerGroup() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceCustomerGroup")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> priceChannel() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceChannel")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> localeProjection() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("localeProjection")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSearchProjectionParamsQueryBuilderDsl> storeProjection() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("storeProjection")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchProjectionParamsQueryBuilderDsl::of));
    }

}
