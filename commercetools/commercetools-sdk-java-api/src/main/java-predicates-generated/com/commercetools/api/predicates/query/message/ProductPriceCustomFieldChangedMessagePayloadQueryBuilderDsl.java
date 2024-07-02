
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl {
    public ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl of() {
        return new ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldChangedMessagePayloadQueryBuilderDsl::of));
    }

}
