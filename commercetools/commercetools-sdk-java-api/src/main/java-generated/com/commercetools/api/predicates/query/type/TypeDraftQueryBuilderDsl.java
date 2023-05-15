
package com.commercetools.api.predicates.query.type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TypeDraftQueryBuilderDsl {
    public TypeDraftQueryBuilderDsl() {
    }

    public static TypeDraftQueryBuilderDsl of() {
        return new TypeDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<TypeDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, TypeDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TypeDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TypeDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            TypeDraftQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<TypeDraftQueryBuilderDsl> resourceTypeIds() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceTypeIds")),
            p -> new CombinationQueryPredicate<>(p, TypeDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<TypeDraftQueryBuilderDsl> fieldDefinitions(
            Function<com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fieldDefinitions"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldDefinitionQueryBuilderDsl.of())),
            TypeDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<TypeDraftQueryBuilderDsl> fieldDefinitions() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fieldDefinitions")),
            p -> new CombinationQueryPredicate<>(p, TypeDraftQueryBuilderDsl::of));
    }
}
