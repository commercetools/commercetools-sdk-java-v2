
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringUpdateActionQueryBuilderDsl {
    public ProductTailoringUpdateActionQueryBuilderDsl() {
    }

    public static ProductTailoringUpdateActionQueryBuilderDsl of() {
        return new ProductTailoringUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asAddAsset(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddAssetActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asAddExternalImage(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddExternalImageActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddExternalImageActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddExternalImageActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asAddVariant(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddVariantActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddVariantActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringAddVariantActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asChangeAssetName(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringChangeAssetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringChangeAssetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringChangeAssetNameActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asChangeAssetOrder(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringChangeAssetOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringChangeAssetOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringChangeAssetOrderActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asMoveImageToPosition(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringMoveImageToPositionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringMoveImageToPositionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringMoveImageToPositionActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asPublish(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringPublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringPublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringPublishActionQueryBuilderDsl.of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asRemoveAsset(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveAssetActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asRemoveImage(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveImageActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveImageActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveImageActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asRemoveVariant(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveVariantActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveVariantActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringRemoveVariantActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetAssetCustomField(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetCustomFieldActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetAssetCustomType(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetCustomTypeActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetAssetDescription(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetDescriptionActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetAssetKey(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetKeyActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetAssetSources(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetSourcesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetSourcesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetSourcesActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetAssetTags(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetTagsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetTagsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetAssetTagsActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetDescriptionActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetImages(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetExternalImagesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetExternalImagesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetExternalImagesActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetImageLabel(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetImageLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetImageLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetImageLabelActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaAttributes(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaAttributesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaAttributesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaAttributesActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaDescription(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaDescriptionActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaKeywords(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaKeywordsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaKeywordsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaKeywordsActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetMetaTitle(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaTitleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaTitleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetMetaTitleActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetName(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetNameActionQueryBuilderDsl.of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asSetSlug(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetSlugActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetSlugActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringSetSlugActionQueryBuilderDsl.of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringUpdateActionQueryBuilderDsl> asUnpublish(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUnpublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUnpublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUnpublishActionQueryBuilderDsl
                    .of()),
            ProductTailoringUpdateActionQueryBuilderDsl::of);
    }
}
