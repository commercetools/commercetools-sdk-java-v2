package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductPricesSetMessagePayloadQueryBuilderDsl  {
    public ProductPricesSetMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPricesSetMessagePayloadQueryBuilderDsl of() {
        return new ProductPricesSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPricesSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessagePayloadQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductPricesSetMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPricesSetMessagePayloadQueryBuilderDsl> prices(
        Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("prices"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductPricesSetMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProductPricesSetMessagePayloadQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
                p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessagePayloadQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductPricesSetMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductPricesSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
