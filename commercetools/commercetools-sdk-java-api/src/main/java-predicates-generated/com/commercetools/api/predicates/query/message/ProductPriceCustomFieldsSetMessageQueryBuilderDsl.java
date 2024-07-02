
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceCustomFieldsSetMessageQueryBuilderDsl {
    public ProductPriceCustomFieldsSetMessageQueryBuilderDsl() {
    }

    public static ProductPriceCustomFieldsSetMessageQueryBuilderDsl of() {
        return new ProductPriceCustomFieldsSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> customField(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customField"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldsSetMessageQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldsSetMessageQueryBuilderDsl::of));
    }

}
