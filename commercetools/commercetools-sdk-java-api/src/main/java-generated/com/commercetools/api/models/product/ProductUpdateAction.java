
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddAssetActionImpl.class, name = ProductAddAssetAction.ADD_ASSET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddExternalImageActionImpl.class, name = ProductAddExternalImageAction.ADD_EXTERNAL_IMAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddPriceActionImpl.class, name = ProductAddPriceAction.ADD_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddToCategoryActionImpl.class, name = ProductAddToCategoryAction.ADD_TO_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddVariantActionImpl.class, name = ProductAddVariantAction.ADD_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeAssetNameActionImpl.class, name = ProductChangeAssetNameAction.CHANGE_ASSET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeAssetOrderActionImpl.class, name = ProductChangeAssetOrderAction.CHANGE_ASSET_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeMasterVariantActionImpl.class, name = ProductChangeMasterVariantAction.CHANGE_MASTER_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeNameActionImpl.class, name = ProductChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangePriceActionImpl.class, name = ProductChangePriceAction.CHANGE_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeSlugActionImpl.class, name = ProductChangeSlugAction.CHANGE_SLUG),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductLegacySetSkuActionImpl.class, name = ProductLegacySetSkuAction.LEGACY_SET_SKU),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductMoveImageToPositionActionImpl.class, name = ProductMoveImageToPositionAction.MOVE_IMAGE_TO_POSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductPublishActionImpl.class, name = ProductPublishAction.PUBLISH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveAssetActionImpl.class, name = ProductRemoveAssetAction.REMOVE_ASSET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveFromCategoryActionImpl.class, name = ProductRemoveFromCategoryAction.REMOVE_FROM_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveImageActionImpl.class, name = ProductRemoveImageAction.REMOVE_IMAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemovePriceActionImpl.class, name = ProductRemovePriceAction.REMOVE_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveVariantActionImpl.class, name = ProductRemoveVariantAction.REMOVE_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRevertStagedChangesActionImpl.class, name = ProductRevertStagedChangesAction.REVERT_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionImpl.class, name = ProductRevertStagedVariantChangesAction.REVERT_STAGED_VARIANT_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetCustomFieldActionImpl.class, name = ProductSetAssetCustomFieldAction.SET_ASSET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetCustomTypeActionImpl.class, name = ProductSetAssetCustomTypeAction.SET_ASSET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetDescriptionActionImpl.class, name = ProductSetAssetDescriptionAction.SET_ASSET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetKeyActionImpl.class, name = ProductSetAssetKeyAction.SET_ASSET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetSourcesActionImpl.class, name = ProductSetAssetSourcesAction.SET_ASSET_SOURCES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetTagsActionImpl.class, name = ProductSetAssetTagsAction.SET_ASSET_TAGS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAttributeActionImpl.class, name = ProductSetAttributeAction.SET_ATTRIBUTE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionImpl.class, name = ProductSetAttributeInAllVariantsAction.SET_ATTRIBUTE_IN_ALL_VARIANTS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetCategoryOrderHintActionImpl.class, name = ProductSetCategoryOrderHintAction.SET_CATEGORY_ORDER_HINT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetDescriptionActionImpl.class, name = ProductSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetDiscountedPriceActionImpl.class, name = ProductSetDiscountedPriceAction.SET_DISCOUNTED_PRICE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetImageLabelActionImpl.class, name = ProductSetImageLabelAction.SET_IMAGE_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetKeyActionImpl.class, name = ProductSetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetMetaDescriptionActionImpl.class, name = ProductSetMetaDescriptionAction.SET_META_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetMetaKeywordsActionImpl.class, name = ProductSetMetaKeywordsAction.SET_META_KEYWORDS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetMetaTitleActionImpl.class, name = ProductSetMetaTitleAction.SET_META_TITLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetPriceModeActionImpl.class, name = ProductSetPriceModeAction.SET_PRICE_MODE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetPricesActionImpl.class, name = ProductSetPricesAction.SET_PRICES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionImpl.class, name = ProductSetProductPriceCustomFieldAction.SET_PRODUCT_PRICE_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionImpl.class, name = ProductSetProductPriceCustomTypeAction.SET_PRODUCT_PRICE_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductVariantKeyActionImpl.class, name = ProductSetProductVariantKeyAction.SET_PRODUCT_VARIANT_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetSearchKeywordsActionImpl.class, name = ProductSetSearchKeywordsAction.SET_SEARCH_KEYWORDS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetSkuActionImpl.class, name = ProductSetSkuAction.SET_SKU),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetTaxCategoryActionImpl.class, name = ProductSetTaxCategoryAction.SET_TAX_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductTransitionStateActionImpl.class, name = ProductTransitionStateAction.TRANSITION_STATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductUnpublishActionImpl.class, name = ProductUnpublishAction.UNPUBLISH) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProductUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    public static com.commercetools.api.models.product.ProductAddAssetActionBuilder addAssetBuilder() {
        return com.commercetools.api.models.product.ProductAddAssetActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductAddExternalImageActionBuilder addExternalImageBuilder() {
        return com.commercetools.api.models.product.ProductAddExternalImageActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductAddPriceActionBuilder addPriceBuilder() {
        return com.commercetools.api.models.product.ProductAddPriceActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductAddToCategoryActionBuilder addToCategoryBuilder() {
        return com.commercetools.api.models.product.ProductAddToCategoryActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductAddVariantActionBuilder addVariantBuilder() {
        return com.commercetools.api.models.product.ProductAddVariantActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductChangeAssetNameActionBuilder changeAssetNameBuilder() {
        return com.commercetools.api.models.product.ProductChangeAssetNameActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductChangeAssetOrderActionBuilder changeAssetOrderBuilder() {
        return com.commercetools.api.models.product.ProductChangeAssetOrderActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductChangeMasterVariantActionBuilder changeMasterVariantBuilder() {
        return com.commercetools.api.models.product.ProductChangeMasterVariantActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.product.ProductChangeNameActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductChangePriceActionBuilder changePriceBuilder() {
        return com.commercetools.api.models.product.ProductChangePriceActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductChangeSlugActionBuilder changeSlugBuilder() {
        return com.commercetools.api.models.product.ProductChangeSlugActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductLegacySetSkuActionBuilder legacySetSkuBuilder() {
        return com.commercetools.api.models.product.ProductLegacySetSkuActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductMoveImageToPositionActionBuilder moveImageToPositionBuilder() {
        return com.commercetools.api.models.product.ProductMoveImageToPositionActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductPublishActionBuilder publishBuilder() {
        return com.commercetools.api.models.product.ProductPublishActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductRemoveAssetActionBuilder removeAssetBuilder() {
        return com.commercetools.api.models.product.ProductRemoveAssetActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductRemoveFromCategoryActionBuilder removeFromCategoryBuilder() {
        return com.commercetools.api.models.product.ProductRemoveFromCategoryActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductRemoveImageActionBuilder removeImageBuilder() {
        return com.commercetools.api.models.product.ProductRemoveImageActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductRemovePriceActionBuilder removePriceBuilder() {
        return com.commercetools.api.models.product.ProductRemovePriceActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductRemoveVariantActionBuilder removeVariantBuilder() {
        return com.commercetools.api.models.product.ProductRemoveVariantActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductRevertStagedChangesActionBuilder revertStagedChangesBuilder() {
        return com.commercetools.api.models.product.ProductRevertStagedChangesActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionBuilder revertStagedVariantChangesBuilder() {
        return com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAssetCustomFieldActionBuilder setAssetCustomFieldBuilder() {
        return com.commercetools.api.models.product.ProductSetAssetCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAssetCustomTypeActionBuilder setAssetCustomTypeBuilder() {
        return com.commercetools.api.models.product.ProductSetAssetCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAssetDescriptionActionBuilder setAssetDescriptionBuilder() {
        return com.commercetools.api.models.product.ProductSetAssetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAssetKeyActionBuilder setAssetKeyBuilder() {
        return com.commercetools.api.models.product.ProductSetAssetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAssetSourcesActionBuilder setAssetSourcesBuilder() {
        return com.commercetools.api.models.product.ProductSetAssetSourcesActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAssetTagsActionBuilder setAssetTagsBuilder() {
        return com.commercetools.api.models.product.ProductSetAssetTagsActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAttributeActionBuilder setAttributeBuilder() {
        return com.commercetools.api.models.product.ProductSetAttributeActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionBuilder setAttributeInAllVariantsBuilder() {
        return com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetCategoryOrderHintActionBuilder setCategoryOrderHintBuilder() {
        return com.commercetools.api.models.product.ProductSetCategoryOrderHintActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.product.ProductSetDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetDiscountedPriceActionBuilder setDiscountedPriceBuilder() {
        return com.commercetools.api.models.product.ProductSetDiscountedPriceActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetImageLabelActionBuilder setImageLabelBuilder() {
        return com.commercetools.api.models.product.ProductSetImageLabelActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.product.ProductSetKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetMetaDescriptionActionBuilder setMetaDescriptionBuilder() {
        return com.commercetools.api.models.product.ProductSetMetaDescriptionActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetMetaKeywordsActionBuilder setMetaKeywordsBuilder() {
        return com.commercetools.api.models.product.ProductSetMetaKeywordsActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetMetaTitleActionBuilder setMetaTitleBuilder() {
        return com.commercetools.api.models.product.ProductSetMetaTitleActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetPriceModeActionBuilder setPriceModeBuilder() {
        return com.commercetools.api.models.product.ProductSetPriceModeActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetPricesActionBuilder setPricesBuilder() {
        return com.commercetools.api.models.product.ProductSetPricesActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionBuilder setProductPriceCustomFieldBuilder() {
        return com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionBuilder setProductPriceCustomTypeBuilder() {
        return com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetProductVariantKeyActionBuilder setProductVariantKeyBuilder() {
        return com.commercetools.api.models.product.ProductSetProductVariantKeyActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetSearchKeywordsActionBuilder setSearchKeywordsBuilder() {
        return com.commercetools.api.models.product.ProductSetSearchKeywordsActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetSkuActionBuilder setSkuBuilder() {
        return com.commercetools.api.models.product.ProductSetSkuActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductSetTaxCategoryActionBuilder setTaxCategoryBuilder() {
        return com.commercetools.api.models.product.ProductSetTaxCategoryActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductTransitionStateActionBuilder transitionStateBuilder() {
        return com.commercetools.api.models.product.ProductTransitionStateActionBuilder.of();
    }

    public static com.commercetools.api.models.product.ProductUnpublishActionBuilder unpublishBuilder() {
        return com.commercetools.api.models.product.ProductUnpublishActionBuilder.of();
    }

    default <T> T withProductUpdateAction(Function<ProductUpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUpdateAction>";
            }
        };
    }
}
