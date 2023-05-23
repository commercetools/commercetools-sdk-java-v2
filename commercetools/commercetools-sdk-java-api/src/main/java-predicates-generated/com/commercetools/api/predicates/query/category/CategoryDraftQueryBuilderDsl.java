
package com.commercetools.api.predicates.query.category;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryDraftQueryBuilderDsl {
    public CategoryDraftQueryBuilderDsl() {
    }

    public static CategoryDraftQueryBuilderDsl of() {
        return new CategoryDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> parent(
            Function<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("parent"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.category.CategoryResourceIdentifierQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CategoryDraftQueryBuilderDsl> orderHint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderHint")),
            p -> new CombinationQueryPredicate<>(p, CategoryDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategoryDraftQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, CategoryDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> metaTitle(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaTitle"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> metaDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> metaKeywords(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("metaKeywords"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CategoryDraftQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetDraftQueryBuilderDsl.of())),
            CategoryDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CategoryDraftQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, CategoryDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategoryDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CategoryDraftQueryBuilderDsl::of));
    }

}
