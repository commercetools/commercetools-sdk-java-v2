
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantUpdateActionQueryBuilderDsl {
    public VariantUpdateActionQueryBuilderDsl() {
    }

    public static VariantUpdateActionQueryBuilderDsl of() {
        return new VariantUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, VariantUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asAddAsset(
            Function<com.commercetools.api.predicates.query.variant.VariantAddAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantAddAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantAddAssetActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asAddExternalImage(
            Function<com.commercetools.api.predicates.query.variant.VariantAddExternalImageActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantAddExternalImageActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantAddExternalImageActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asChangeAssetName(
            Function<com.commercetools.api.predicates.query.variant.VariantChangeAssetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantChangeAssetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantChangeAssetNameActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asChangeAssetOrder(
            Function<com.commercetools.api.predicates.query.variant.VariantChangeAssetOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantChangeAssetOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantChangeAssetOrderActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asPublish(
            Function<com.commercetools.api.predicates.query.variant.VariantPublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantPublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantPublishActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asRemoveAsset(
            Function<com.commercetools.api.predicates.query.variant.VariantRemoveAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantRemoveAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantRemoveAssetActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asRemoveImage(
            Function<com.commercetools.api.predicates.query.variant.VariantRemoveImageActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantRemoveImageActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantRemoveImageActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asRemoveStagedChanges(
            Function<com.commercetools.api.predicates.query.variant.VariantRemoveStagedChangesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantRemoveStagedChangesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.variant.VariantRemoveStagedChangesActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAssetCustomField(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAssetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAssetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.variant.VariantSetAssetCustomFieldActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAssetCustomType(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAssetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAssetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.variant.VariantSetAssetCustomTypeActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAssetDescription(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAssetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAssetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.variant.VariantSetAssetDescriptionActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAssetKey(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAssetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAssetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetAssetKeyActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAssetSources(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAssetSourcesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAssetSourcesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetAssetSourcesActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAssetTags(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAssetTagsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAssetTagsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetAssetTagsActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAssets(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAssetsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAssetsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetAssetsActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAttribute(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAttributeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAttributeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetAttributeActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetAttributes(
            Function<com.commercetools.api.predicates.query.variant.VariantSetAttributesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetAttributesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetAttributesActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetImages(
            Function<com.commercetools.api.predicates.query.variant.VariantSetImagesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetImagesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetImagesActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.variant.VariantSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetKeyActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asSetSku(
            Function<com.commercetools.api.predicates.query.variant.VariantSetSkuActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantSetSkuActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantSetSkuActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantUpdateActionQueryBuilderDsl> asUnpublish(
            Function<com.commercetools.api.predicates.query.variant.VariantUnpublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantUnpublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantUnpublishActionQueryBuilderDsl.of()),
            VariantUpdateActionQueryBuilderDsl::of);
    }
}
