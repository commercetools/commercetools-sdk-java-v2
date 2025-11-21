
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductUpdateActionQueryBuilderDsl {
    public ProductUpdateActionQueryBuilderDsl() {
    }

    public static ProductUpdateActionQueryBuilderDsl of() {
        return new ProductUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asAddAsset(
            Function<com.commercetools.api.predicates.query.product.ProductAddAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductAddAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductAddAssetActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asAddExternalImage(
            Function<com.commercetools.api.predicates.query.product.ProductAddExternalImageActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductAddExternalImageActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductAddExternalImageActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asAddPrice(
            Function<com.commercetools.api.predicates.query.product.ProductAddPriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductAddPriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductAddPriceActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asAddToCategory(
            Function<com.commercetools.api.predicates.query.product.ProductAddToCategoryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductAddToCategoryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductAddToCategoryActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asAddVariant(
            Function<com.commercetools.api.predicates.query.product.ProductAddVariantActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductAddVariantActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductAddVariantActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asChangeAssetName(
            Function<com.commercetools.api.predicates.query.product.ProductChangeAssetNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductChangeAssetNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductChangeAssetNameActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asChangeAssetOrder(
            Function<com.commercetools.api.predicates.query.product.ProductChangeAssetOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductChangeAssetOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductChangeAssetOrderActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asChangeMasterVariant(
            Function<com.commercetools.api.predicates.query.product.ProductChangeMasterVariantActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductChangeMasterVariantActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductChangeMasterVariantActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.product.ProductChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductChangeNameActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asChangePrice(
            Function<com.commercetools.api.predicates.query.product.ProductChangePriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductChangePriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductChangePriceActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asChangeSlug(
            Function<com.commercetools.api.predicates.query.product.ProductChangeSlugActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductChangeSlugActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductChangeSlugActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asMoveImageToPosition(
            Function<com.commercetools.api.predicates.query.product.ProductMoveImageToPositionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductMoveImageToPositionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductMoveImageToPositionActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asPublish(
            Function<com.commercetools.api.predicates.query.product.ProductPublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductPublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductPublishActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asRemoveAsset(
            Function<com.commercetools.api.predicates.query.product.ProductRemoveAssetActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductRemoveAssetActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductRemoveAssetActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asRemoveFromCategory(
            Function<com.commercetools.api.predicates.query.product.ProductRemoveFromCategoryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductRemoveFromCategoryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductRemoveFromCategoryActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asRemoveImage(
            Function<com.commercetools.api.predicates.query.product.ProductRemoveImageActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductRemoveImageActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductRemoveImageActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asRemovePrice(
            Function<com.commercetools.api.predicates.query.product.ProductRemovePriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductRemovePriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductRemovePriceActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asRemoveVariant(
            Function<com.commercetools.api.predicates.query.product.ProductRemoveVariantActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductRemoveVariantActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductRemoveVariantActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asRevertStagedChanges(
            Function<com.commercetools.api.predicates.query.product.ProductRevertStagedChangesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductRevertStagedChangesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductRevertStagedChangesActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asRevertStagedVariantChanges(
            Function<com.commercetools.api.predicates.query.product.ProductRevertStagedVariantChangesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductRevertStagedVariantChangesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product.ProductRevertStagedVariantChangesActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAssetCustomField(
            Function<com.commercetools.api.predicates.query.product.ProductSetAssetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAssetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetAssetCustomFieldActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAssetCustomType(
            Function<com.commercetools.api.predicates.query.product.ProductSetAssetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAssetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetAssetCustomTypeActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAssetDescription(
            Function<com.commercetools.api.predicates.query.product.ProductSetAssetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAssetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetAssetDescriptionActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAssetKey(
            Function<com.commercetools.api.predicates.query.product.ProductSetAssetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAssetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetAssetKeyActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAssetSources(
            Function<com.commercetools.api.predicates.query.product.ProductSetAssetSourcesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAssetSourcesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetAssetSourcesActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAssetTags(
            Function<com.commercetools.api.predicates.query.product.ProductSetAssetTagsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAssetTagsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetAssetTagsActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAttribute(
            Function<com.commercetools.api.predicates.query.product.ProductSetAttributeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAttributeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetAttributeActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetAttributeInAllVariants(
            Function<com.commercetools.api.predicates.query.product.ProductSetAttributeInAllVariantsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetAttributeInAllVariantsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product.ProductSetAttributeInAllVariantsActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetCategoryOrderHint(
            Function<com.commercetools.api.predicates.query.product.ProductSetCategoryOrderHintActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetCategoryOrderHintActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetCategoryOrderHintActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.product.ProductSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetDescriptionActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetDiscountedPrice(
            Function<com.commercetools.api.predicates.query.product.ProductSetDiscountedPriceActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetDiscountedPriceActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetDiscountedPriceActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetImageLabel(
            Function<com.commercetools.api.predicates.query.product.ProductSetImageLabelActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetImageLabelActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetImageLabelActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.product.ProductSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetKeyActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetMetaDescription(
            Function<com.commercetools.api.predicates.query.product.ProductSetMetaDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetMetaDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetMetaDescriptionActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetMetaKeywords(
            Function<com.commercetools.api.predicates.query.product.ProductSetMetaKeywordsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetMetaKeywordsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetMetaKeywordsActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetMetaTitle(
            Function<com.commercetools.api.predicates.query.product.ProductSetMetaTitleActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetMetaTitleActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetMetaTitleActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetPriceKey(
            Function<com.commercetools.api.predicates.query.product.ProductSetPriceKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetPriceKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetPriceKeyActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetPriceMode(
            Function<com.commercetools.api.predicates.query.product.ProductSetPriceModeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetPriceModeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetPriceModeActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetPrices(
            Function<com.commercetools.api.predicates.query.product.ProductSetPricesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetPricesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetPricesActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetProductAttribute(
            Function<com.commercetools.api.predicates.query.product.ProductSetProductAttributeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetProductAttributeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetProductAttributeActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetProductPriceCustomField(
            Function<com.commercetools.api.predicates.query.product.ProductSetProductPriceCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetProductPriceCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product.ProductSetProductPriceCustomFieldActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetProductPriceCustomType(
            Function<com.commercetools.api.predicates.query.product.ProductSetProductPriceCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetProductPriceCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.product.ProductSetProductPriceCustomTypeActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetProductVariantKey(
            Function<com.commercetools.api.predicates.query.product.ProductSetProductVariantKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetProductVariantKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.product.ProductSetProductVariantKeyActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetSearchKeywords(
            Function<com.commercetools.api.predicates.query.product.ProductSetSearchKeywordsActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetSearchKeywordsActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetSearchKeywordsActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetSku(
            Function<com.commercetools.api.predicates.query.product.ProductSetSkuActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetSkuActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetSkuActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asSetTaxCategory(
            Function<com.commercetools.api.predicates.query.product.ProductSetTaxCategoryActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductSetTaxCategoryActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductSetTaxCategoryActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asTransitionState(
            Function<com.commercetools.api.predicates.query.product.ProductTransitionStateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductTransitionStateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductTransitionStateActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductUpdateActionQueryBuilderDsl> asUnpublish(
            Function<com.commercetools.api.predicates.query.product.ProductUnpublishActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductUnpublishActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.product.ProductUnpublishActionQueryBuilderDsl.of()),
            ProductUpdateActionQueryBuilderDsl::of);
    }
}
