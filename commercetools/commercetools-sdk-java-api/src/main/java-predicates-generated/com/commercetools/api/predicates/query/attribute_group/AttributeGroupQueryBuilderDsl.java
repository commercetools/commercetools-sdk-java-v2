package com.commercetools.api.predicates.query.attribute_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AttributeGroupQueryBuilderDsl  {
    public AttributeGroupQueryBuilderDsl() {
    }

    public static AttributeGroupQueryBuilderDsl of() {
        return new AttributeGroupQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AttributeGroupQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<AttributeGroupQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AttributeGroupQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<AttributeGroupQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AttributeGroupQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            AttributeGroupQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AttributeGroupQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            AttributeGroupQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AttributeGroupQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeGroupQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AttributeGroupQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            AttributeGroupQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AttributeGroupQueryBuilderDsl> attributes(
        Function<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("attributes"))
            .inner(fn.apply(com.commercetools.api.predicates.query.attribute_group.AttributeReferenceQueryBuilderDsl.of())),
            AttributeGroupQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<AttributeGroupQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
                p -> new CombinationQueryPredicate<>(p, AttributeGroupQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AttributeGroupQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, AttributeGroupQueryBuilderDsl::of));
    }
    
}
