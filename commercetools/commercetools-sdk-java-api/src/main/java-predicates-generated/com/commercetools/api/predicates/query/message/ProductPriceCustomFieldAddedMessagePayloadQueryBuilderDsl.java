
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl {
    public ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl of() {
        return new ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessagePayloadQueryBuilderDsl::of));
    }

}
