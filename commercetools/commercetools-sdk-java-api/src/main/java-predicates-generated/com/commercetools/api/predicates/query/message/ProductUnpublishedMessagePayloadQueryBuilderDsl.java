package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductUnpublishedMessagePayloadQueryBuilderDsl  {
    public ProductUnpublishedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductUnpublishedMessagePayloadQueryBuilderDsl of() {
        return new ProductUnpublishedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductUnpublishedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductUnpublishedMessagePayloadQueryBuilderDsl::of));
    }
    
}
