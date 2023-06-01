package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductPriceKeySetMessageQueryBuilderDsl  {
    public ProductPriceKeySetMessageQueryBuilderDsl() {
    }

    public static ProductPriceKeySetMessageQueryBuilderDsl of() {
        return new ProductPriceKeySetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPriceKeySetMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPriceKeySetMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductPriceKeySetMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPriceKeySetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPriceKeySetMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPriceKeySetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPriceKeySetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPriceKeySetMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ProductPriceKeySetMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductPriceKeySetMessageQueryBuilderDsl::of));
    }
    
}
