package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CategoryUpdateActionQueryBuilderDsl  {
    public CategoryUpdateActionQueryBuilderDsl() {
    }

    public static CategoryUpdateActionQueryBuilderDsl of() {
        return new CategoryUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CategoryUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asAddAsset(
        Function<com.commercetools.api.predicates.query.category.CategoryAddAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryAddAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryAddAssetActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asChangeAssetName(
        Function<com.commercetools.api.predicates.query.category.CategoryChangeAssetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryChangeAssetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryChangeAssetNameActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asChangeAssetOrder(
        Function<com.commercetools.api.predicates.query.category.CategoryChangeAssetOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryChangeAssetOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryChangeAssetOrderActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asChangeName(
        Function<com.commercetools.api.predicates.query.category.CategoryChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryChangeNameActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asChangeOrderHint(
        Function<com.commercetools.api.predicates.query.category.CategoryChangeOrderHintActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryChangeOrderHintActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryChangeOrderHintActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asChangeParent(
        Function<com.commercetools.api.predicates.query.category.CategoryChangeParentActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryChangeParentActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryChangeParentActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asChangeSlug(
        Function<com.commercetools.api.predicates.query.category.CategoryChangeSlugActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryChangeSlugActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryChangeSlugActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asRemoveAsset(
        Function<com.commercetools.api.predicates.query.category.CategoryRemoveAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryRemoveAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategoryRemoveAssetActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetAssetCustomField(
        Function<com.commercetools.api.predicates.query.category.CategorySetAssetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetAssetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetAssetCustomFieldActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetAssetCustomType(
        Function<com.commercetools.api.predicates.query.category.CategorySetAssetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetAssetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetAssetCustomTypeActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetAssetDescription(
        Function<com.commercetools.api.predicates.query.category.CategorySetAssetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetAssetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetAssetDescriptionActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetAssetKey(
        Function<com.commercetools.api.predicates.query.category.CategorySetAssetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetAssetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetAssetKeyActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetAssetSources(
        Function<com.commercetools.api.predicates.query.category.CategorySetAssetSourcesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetAssetSourcesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetAssetSourcesActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetAssetTags(
        Function<com.commercetools.api.predicates.query.category.CategorySetAssetTagsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetAssetTagsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetAssetTagsActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.category.CategorySetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetCustomFieldActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.category.CategorySetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetCustomTypeActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetDescription(
        Function<com.commercetools.api.predicates.query.category.CategorySetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetDescriptionActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetExternalId(
        Function<com.commercetools.api.predicates.query.category.CategorySetExternalIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetExternalIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetExternalIdActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetKey(
        Function<com.commercetools.api.predicates.query.category.CategorySetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetKeyActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetMetaDescription(
        Function<com.commercetools.api.predicates.query.category.CategorySetMetaDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetMetaDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetMetaDescriptionActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetMetaKeywords(
        Function<com.commercetools.api.predicates.query.category.CategorySetMetaKeywordsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetMetaKeywordsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetMetaKeywordsActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<CategoryUpdateActionQueryBuilderDsl> asSetMetaTitle(
        Function<com.commercetools.api.predicates.query.category.CategorySetMetaTitleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategorySetMetaTitleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.category.CategorySetMetaTitleActionQueryBuilderDsl.of()),
            CategoryUpdateActionQueryBuilderDsl::of);
    }
}
