
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class VariantSkuSetMessagePayloadQueryBuilderDsl {
    public VariantSkuSetMessagePayloadQueryBuilderDsl() {
    }

    public static VariantSkuSetMessagePayloadQueryBuilderDsl of() {
        return new VariantSkuSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantSkuSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSkuSetMessagePayloadQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantSkuSetMessagePayloadQueryBuilderDsl> oldSku() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldSku")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<VariantSkuSetMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, VariantSkuSetMessagePayloadQueryBuilderDsl::of));
    }

}
