
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl {
    public ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl() {
    }

    public static ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl of() {
        return new ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl> variantKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantKey")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl.of())),
            ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl::of));
    }

}
