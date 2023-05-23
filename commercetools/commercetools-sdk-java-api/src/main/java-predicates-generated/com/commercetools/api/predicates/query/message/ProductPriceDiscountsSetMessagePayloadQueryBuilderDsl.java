
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl {
    public ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl of() {
        return new ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl> updatedPrices(
            Function<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("updatedPrices"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.message.ProductPriceDiscountsSetUpdatedPriceQueryBuilderDsl
                            .of())),
            ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl> updatedPrices() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updatedPrices")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceDiscountsSetMessagePayloadQueryBuilderDsl::of));
    }

}
