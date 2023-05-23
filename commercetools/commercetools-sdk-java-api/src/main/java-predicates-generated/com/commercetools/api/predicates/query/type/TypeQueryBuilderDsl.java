
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeQueryBuilderDsl {
    public TypeQueryBuilderDsl() {
    }

    public static TypeQueryBuilderDsl of() {
        return new TypeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, TypeQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<TypeQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, TypeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<TypeQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, TypeQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<TypeQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, TypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            TypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            TypeQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<TypeQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TypeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TypeQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<TypeQueryBuilderDsl> resourceTypeIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceTypeIds")),
            p -> new CombinationQueryPredicate<>(p, TypeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeQueryBuilderDsl> fieldDefinitions(
            Function<com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fieldDefinitions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl.of())),
            TypeQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TypeQueryBuilderDsl> fieldDefinitions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldDefinitions")),
            p -> new CombinationQueryPredicate<>(p, TypeQueryBuilderDsl::of));
    }

}
