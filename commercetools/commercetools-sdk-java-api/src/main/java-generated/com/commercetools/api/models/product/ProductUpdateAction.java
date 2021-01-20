
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductAddAssetAction;
import com.commercetools.api.models.product.ProductAddExternalImageAction;
import com.commercetools.api.models.product.ProductAddPriceAction;
import com.commercetools.api.models.product.ProductAddToCategoryAction;
import com.commercetools.api.models.product.ProductAddVariantAction;
import com.commercetools.api.models.product.ProductChangeAssetNameAction;
import com.commercetools.api.models.product.ProductChangeAssetOrderAction;
import com.commercetools.api.models.product.ProductChangeMasterVariantAction;
import com.commercetools.api.models.product.ProductChangeNameAction;
import com.commercetools.api.models.product.ProductChangePriceAction;
import com.commercetools.api.models.product.ProductChangeSlugAction;
import com.commercetools.api.models.product.ProductLegacySetSkuAction;
import com.commercetools.api.models.product.ProductMoveImageToPositionAction;
import com.commercetools.api.models.product.ProductPublishAction;
import com.commercetools.api.models.product.ProductRemoveAssetAction;
import com.commercetools.api.models.product.ProductRemoveFromCategoryAction;
import com.commercetools.api.models.product.ProductRemoveImageAction;
import com.commercetools.api.models.product.ProductRemovePriceAction;
import com.commercetools.api.models.product.ProductRemoveVariantAction;
import com.commercetools.api.models.product.ProductRevertStagedChangesAction;
import com.commercetools.api.models.product.ProductRevertStagedVariantChangesAction;
import com.commercetools.api.models.product.ProductSetAssetCustomFieldAction;
import com.commercetools.api.models.product.ProductSetAssetCustomTypeAction;
import com.commercetools.api.models.product.ProductSetAssetDescriptionAction;
import com.commercetools.api.models.product.ProductSetAssetKeyAction;
import com.commercetools.api.models.product.ProductSetAssetSourcesAction;
import com.commercetools.api.models.product.ProductSetAssetTagsAction;
import com.commercetools.api.models.product.ProductSetAttributeAction;
import com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction;
import com.commercetools.api.models.product.ProductSetCategoryOrderHintAction;
import com.commercetools.api.models.product.ProductSetDescriptionAction;
import com.commercetools.api.models.product.ProductSetDiscountedPriceAction;
import com.commercetools.api.models.product.ProductSetImageLabelAction;
import com.commercetools.api.models.product.ProductSetKeyAction;
import com.commercetools.api.models.product.ProductSetMetaDescriptionAction;
import com.commercetools.api.models.product.ProductSetMetaKeywordsAction;
import com.commercetools.api.models.product.ProductSetMetaTitleAction;
import com.commercetools.api.models.product.ProductSetPricesAction;
import com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction;
import com.commercetools.api.models.product.ProductSetProductPriceCustomTypeAction;
import com.commercetools.api.models.product.ProductSetProductVariantKeyAction;
import com.commercetools.api.models.product.ProductSetSearchKeywordsAction;
import com.commercetools.api.models.product.ProductSetSkuAction;
import com.commercetools.api.models.product.ProductSetTaxCategoryAction;
import com.commercetools.api.models.product.ProductTransitionStateAction;
import com.commercetools.api.models.product.ProductUnpublishAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProductUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withProductUpdateAction(Function<ProductUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
