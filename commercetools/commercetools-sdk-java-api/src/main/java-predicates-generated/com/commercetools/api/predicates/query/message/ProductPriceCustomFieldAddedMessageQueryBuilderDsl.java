
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceCustomFieldAddedMessageQueryBuilderDsl {
    public ProductPriceCustomFieldAddedMessageQueryBuilderDsl() {
    }

    public static ProductPriceCustomFieldAddedMessageQueryBuilderDsl of() {
        return new ProductPriceCustomFieldAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPriceCustomFieldAddedMessageQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceCustomFieldAddedMessageQueryBuilderDsl::of));
    }

}
