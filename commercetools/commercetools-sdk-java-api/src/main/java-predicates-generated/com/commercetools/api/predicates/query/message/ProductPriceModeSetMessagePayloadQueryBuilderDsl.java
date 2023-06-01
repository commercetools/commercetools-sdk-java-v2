package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductPriceModeSetMessagePayloadQueryBuilderDsl  {
    public ProductPriceModeSetMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPriceModeSetMessagePayloadQueryBuilderDsl of() {
        return new ProductPriceModeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceModeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceModeSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceModeSetMessagePayloadQueryBuilderDsl> to() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("to")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceModeSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
