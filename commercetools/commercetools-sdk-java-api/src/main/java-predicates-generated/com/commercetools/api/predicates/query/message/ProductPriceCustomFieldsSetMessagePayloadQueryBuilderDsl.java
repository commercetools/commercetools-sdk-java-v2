
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl {
    public ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl of() {
        return new ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl> customField(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customField"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessagePayloadQueryBuilderDsl::of));
    }

}
