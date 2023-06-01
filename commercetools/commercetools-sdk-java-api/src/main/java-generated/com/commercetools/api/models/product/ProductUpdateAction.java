package com.commercetools.api.models.product;

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
import com.commercetools.api.models.product.ProductSetPriceKeyAction;
import com.commercetools.api.models.product.ProductSetPriceModeAction;
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
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ProductUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUpdateAction productUpdateAction = ProductUpdateAction.addAssetBuilder()
 *             asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
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
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetPriceKeyActionImpl.class, name = ProductSetPriceKeyAction.SET_PRICE_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetPriceModeActionImpl.class, name = ProductSetPriceModeAction.SET_PRICE_MODE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetPricesActionImpl.class, name = ProductSetPricesAction.SET_PRICES),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionImpl.class, name = ProductSetProductPriceCustomFieldAction.SET_PRODUCT_PRICE_CUSTOM_FIELD),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionImpl.class, name = ProductSetProductPriceCustomTypeAction.SET_PRODUCT_PRICE_CUSTOM_TYPE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductVariantKeyActionImpl.class, name = ProductSetProductVariantKeyAction.SET_PRODUCT_VARIANT_KEY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetSearchKeywordsActionImpl.class, name = ProductSetSearchKeywordsAction.SET_SEARCH_KEYWORDS),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetSkuActionImpl.class, name = ProductSetSkuAction.SET_SKU),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetTaxCategoryActionImpl.class, name = ProductSetTaxCategoryAction.SET_TAX_CATEGORY),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductTransitionStateActionImpl.class, name = ProductTransitionStateAction.TRANSITION_STATE),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductUnpublishActionImpl.class, name = ProductUnpublishAction.UNPUBLISH)
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ProductUpdateActionImpl.class,
    visible = true
)
@JsonDeserialize(as = ProductUpdateActionImpl.class)
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface ProductUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProductUpdateAction> {


    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();




    /**
     * factory method to create a deep copy of ProductUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductUpdateAction deepCopy(@Nullable final ProductUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.product.ProductAddAssetAction) {
            return com.commercetools.api.models.product.ProductAddAssetAction.deepCopy((com.commercetools.api.models.product.ProductAddAssetAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductAddExternalImageAction) {
            return com.commercetools.api.models.product.ProductAddExternalImageAction.deepCopy((com.commercetools.api.models.product.ProductAddExternalImageAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductAddPriceAction) {
            return com.commercetools.api.models.product.ProductAddPriceAction.deepCopy((com.commercetools.api.models.product.ProductAddPriceAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductAddToCategoryAction) {
            return com.commercetools.api.models.product.ProductAddToCategoryAction.deepCopy((com.commercetools.api.models.product.ProductAddToCategoryAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductAddVariantAction) {
            return com.commercetools.api.models.product.ProductAddVariantAction.deepCopy((com.commercetools.api.models.product.ProductAddVariantAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductChangeAssetNameAction) {
            return com.commercetools.api.models.product.ProductChangeAssetNameAction.deepCopy((com.commercetools.api.models.product.ProductChangeAssetNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductChangeAssetOrderAction) {
            return com.commercetools.api.models.product.ProductChangeAssetOrderAction.deepCopy((com.commercetools.api.models.product.ProductChangeAssetOrderAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductChangeMasterVariantAction) {
            return com.commercetools.api.models.product.ProductChangeMasterVariantAction.deepCopy((com.commercetools.api.models.product.ProductChangeMasterVariantAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductChangeNameAction) {
            return com.commercetools.api.models.product.ProductChangeNameAction.deepCopy((com.commercetools.api.models.product.ProductChangeNameAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductChangePriceAction) {
            return com.commercetools.api.models.product.ProductChangePriceAction.deepCopy((com.commercetools.api.models.product.ProductChangePriceAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductChangeSlugAction) {
            return com.commercetools.api.models.product.ProductChangeSlugAction.deepCopy((com.commercetools.api.models.product.ProductChangeSlugAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductLegacySetSkuAction) {
            return com.commercetools.api.models.product.ProductLegacySetSkuAction.deepCopy((com.commercetools.api.models.product.ProductLegacySetSkuAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductMoveImageToPositionAction) {
            return com.commercetools.api.models.product.ProductMoveImageToPositionAction.deepCopy((com.commercetools.api.models.product.ProductMoveImageToPositionAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductPublishAction) {
            return com.commercetools.api.models.product.ProductPublishAction.deepCopy((com.commercetools.api.models.product.ProductPublishAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductRemoveAssetAction) {
            return com.commercetools.api.models.product.ProductRemoveAssetAction.deepCopy((com.commercetools.api.models.product.ProductRemoveAssetAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductRemoveFromCategoryAction) {
            return com.commercetools.api.models.product.ProductRemoveFromCategoryAction.deepCopy((com.commercetools.api.models.product.ProductRemoveFromCategoryAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductRemoveImageAction) {
            return com.commercetools.api.models.product.ProductRemoveImageAction.deepCopy((com.commercetools.api.models.product.ProductRemoveImageAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductRemovePriceAction) {
            return com.commercetools.api.models.product.ProductRemovePriceAction.deepCopy((com.commercetools.api.models.product.ProductRemovePriceAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductRemoveVariantAction) {
            return com.commercetools.api.models.product.ProductRemoveVariantAction.deepCopy((com.commercetools.api.models.product.ProductRemoveVariantAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductRevertStagedChangesAction) {
            return com.commercetools.api.models.product.ProductRevertStagedChangesAction.deepCopy((com.commercetools.api.models.product.ProductRevertStagedChangesAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductRevertStagedVariantChangesAction) {
            return com.commercetools.api.models.product.ProductRevertStagedVariantChangesAction.deepCopy((com.commercetools.api.models.product.ProductRevertStagedVariantChangesAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAssetCustomFieldAction) {
            return com.commercetools.api.models.product.ProductSetAssetCustomFieldAction.deepCopy((com.commercetools.api.models.product.ProductSetAssetCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAssetCustomTypeAction) {
            return com.commercetools.api.models.product.ProductSetAssetCustomTypeAction.deepCopy((com.commercetools.api.models.product.ProductSetAssetCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAssetDescriptionAction) {
            return com.commercetools.api.models.product.ProductSetAssetDescriptionAction.deepCopy((com.commercetools.api.models.product.ProductSetAssetDescriptionAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAssetKeyAction) {
            return com.commercetools.api.models.product.ProductSetAssetKeyAction.deepCopy((com.commercetools.api.models.product.ProductSetAssetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAssetSourcesAction) {
            return com.commercetools.api.models.product.ProductSetAssetSourcesAction.deepCopy((com.commercetools.api.models.product.ProductSetAssetSourcesAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAssetTagsAction) {
            return com.commercetools.api.models.product.ProductSetAssetTagsAction.deepCopy((com.commercetools.api.models.product.ProductSetAssetTagsAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAttributeAction) {
            return com.commercetools.api.models.product.ProductSetAttributeAction.deepCopy((com.commercetools.api.models.product.ProductSetAttributeAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction) {
            return com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction.deepCopy((com.commercetools.api.models.product.ProductSetAttributeInAllVariantsAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetCategoryOrderHintAction) {
            return com.commercetools.api.models.product.ProductSetCategoryOrderHintAction.deepCopy((com.commercetools.api.models.product.ProductSetCategoryOrderHintAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetDescriptionAction) {
            return com.commercetools.api.models.product.ProductSetDescriptionAction.deepCopy((com.commercetools.api.models.product.ProductSetDescriptionAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetDiscountedPriceAction) {
            return com.commercetools.api.models.product.ProductSetDiscountedPriceAction.deepCopy((com.commercetools.api.models.product.ProductSetDiscountedPriceAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetImageLabelAction) {
            return com.commercetools.api.models.product.ProductSetImageLabelAction.deepCopy((com.commercetools.api.models.product.ProductSetImageLabelAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetKeyAction) {
            return com.commercetools.api.models.product.ProductSetKeyAction.deepCopy((com.commercetools.api.models.product.ProductSetKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetMetaDescriptionAction) {
            return com.commercetools.api.models.product.ProductSetMetaDescriptionAction.deepCopy((com.commercetools.api.models.product.ProductSetMetaDescriptionAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetMetaKeywordsAction) {
            return com.commercetools.api.models.product.ProductSetMetaKeywordsAction.deepCopy((com.commercetools.api.models.product.ProductSetMetaKeywordsAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetMetaTitleAction) {
            return com.commercetools.api.models.product.ProductSetMetaTitleAction.deepCopy((com.commercetools.api.models.product.ProductSetMetaTitleAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetPriceKeyAction) {
            return com.commercetools.api.models.product.ProductSetPriceKeyAction.deepCopy((com.commercetools.api.models.product.ProductSetPriceKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetPriceModeAction) {
            return com.commercetools.api.models.product.ProductSetPriceModeAction.deepCopy((com.commercetools.api.models.product.ProductSetPriceModeAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetPricesAction) {
            return com.commercetools.api.models.product.ProductSetPricesAction.deepCopy((com.commercetools.api.models.product.ProductSetPricesAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction) {
            return com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction.deepCopy((com.commercetools.api.models.product.ProductSetProductPriceCustomFieldAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetProductPriceCustomTypeAction) {
            return com.commercetools.api.models.product.ProductSetProductPriceCustomTypeAction.deepCopy((com.commercetools.api.models.product.ProductSetProductPriceCustomTypeAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetProductVariantKeyAction) {
            return com.commercetools.api.models.product.ProductSetProductVariantKeyAction.deepCopy((com.commercetools.api.models.product.ProductSetProductVariantKeyAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetSearchKeywordsAction) {
            return com.commercetools.api.models.product.ProductSetSearchKeywordsAction.deepCopy((com.commercetools.api.models.product.ProductSetSearchKeywordsAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetSkuAction) {
            return com.commercetools.api.models.product.ProductSetSkuAction.deepCopy((com.commercetools.api.models.product.ProductSetSkuAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductSetTaxCategoryAction) {
            return com.commercetools.api.models.product.ProductSetTaxCategoryAction.deepCopy((com.commercetools.api.models.product.ProductSetTaxCategoryAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductTransitionStateAction) {
            return com.commercetools.api.models.product.ProductTransitionStateAction.deepCopy((com.commercetools.api.models.product.ProductTransitionStateAction)template);
        }
        if (template instanceof com.commercetools.api.models.product.ProductUnpublishAction) {
            return com.commercetools.api.models.product.ProductUnpublishAction.deepCopy((com.commercetools.api.models.product.ProductUnpublishAction)template);
        }
        ProductUpdateActionImpl instance = new ProductUpdateActionImpl();
        return instance;
    }


    /**
     * builder for addAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductAddAssetActionBuilder addAssetBuilder() {
       return com.commercetools.api.models.product.ProductAddAssetActionBuilder.of();
    }
    /**
     * builder for addExternalImage subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductAddExternalImageActionBuilder addExternalImageBuilder() {
       return com.commercetools.api.models.product.ProductAddExternalImageActionBuilder.of();
    }
    /**
     * builder for addPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductAddPriceActionBuilder addPriceBuilder() {
       return com.commercetools.api.models.product.ProductAddPriceActionBuilder.of();
    }
    /**
     * builder for addToCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductAddToCategoryActionBuilder addToCategoryBuilder() {
       return com.commercetools.api.models.product.ProductAddToCategoryActionBuilder.of();
    }
    /**
     * builder for addVariant subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductAddVariantActionBuilder addVariantBuilder() {
       return com.commercetools.api.models.product.ProductAddVariantActionBuilder.of();
    }
    /**
     * builder for changeAssetName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductChangeAssetNameActionBuilder changeAssetNameBuilder() {
       return com.commercetools.api.models.product.ProductChangeAssetNameActionBuilder.of();
    }
    /**
     * builder for changeAssetOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductChangeAssetOrderActionBuilder changeAssetOrderBuilder() {
       return com.commercetools.api.models.product.ProductChangeAssetOrderActionBuilder.of();
    }
    /**
     * builder for changeMasterVariant subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductChangeMasterVariantActionBuilder changeMasterVariantBuilder() {
       return com.commercetools.api.models.product.ProductChangeMasterVariantActionBuilder.of();
    }
    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.product.ProductChangeNameActionBuilder.of();
    }
    /**
     * builder for changePrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductChangePriceActionBuilder changePriceBuilder() {
       return com.commercetools.api.models.product.ProductChangePriceActionBuilder.of();
    }
    /**
     * builder for changeSlug subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductChangeSlugActionBuilder changeSlugBuilder() {
       return com.commercetools.api.models.product.ProductChangeSlugActionBuilder.of();
    }
    /**
     * builder for legacySetSku subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductLegacySetSkuActionBuilder legacySetSkuBuilder() {
       return com.commercetools.api.models.product.ProductLegacySetSkuActionBuilder.of();
    }
    /**
     * builder for moveImageToPosition subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductMoveImageToPositionActionBuilder moveImageToPositionBuilder() {
       return com.commercetools.api.models.product.ProductMoveImageToPositionActionBuilder.of();
    }
    /**
     * builder for publish subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductPublishActionBuilder publishBuilder() {
       return com.commercetools.api.models.product.ProductPublishActionBuilder.of();
    }
    /**
     * builder for removeAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductRemoveAssetActionBuilder removeAssetBuilder() {
       return com.commercetools.api.models.product.ProductRemoveAssetActionBuilder.of();
    }
    /**
     * builder for removeFromCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductRemoveFromCategoryActionBuilder removeFromCategoryBuilder() {
       return com.commercetools.api.models.product.ProductRemoveFromCategoryActionBuilder.of();
    }
    /**
     * builder for removeImage subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductRemoveImageActionBuilder removeImageBuilder() {
       return com.commercetools.api.models.product.ProductRemoveImageActionBuilder.of();
    }
    /**
     * builder for removePrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductRemovePriceActionBuilder removePriceBuilder() {
       return com.commercetools.api.models.product.ProductRemovePriceActionBuilder.of();
    }
    /**
     * builder for removeVariant subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductRemoveVariantActionBuilder removeVariantBuilder() {
       return com.commercetools.api.models.product.ProductRemoveVariantActionBuilder.of();
    }
    /**
     * builder for revertStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductRevertStagedChangesActionBuilder revertStagedChangesBuilder() {
       return com.commercetools.api.models.product.ProductRevertStagedChangesActionBuilder.of();
    }
    /**
     * builder for revertStagedVariantChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionBuilder revertStagedVariantChangesBuilder() {
       return com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionBuilder.of();
    }
    /**
     * builder for setAssetCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAssetCustomFieldActionBuilder setAssetCustomFieldBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetCustomFieldActionBuilder.of();
    }
    /**
     * builder for setAssetCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAssetCustomTypeActionBuilder setAssetCustomTypeBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetCustomTypeActionBuilder.of();
    }
    /**
     * builder for setAssetDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAssetDescriptionActionBuilder setAssetDescriptionBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetDescriptionActionBuilder.of();
    }
    /**
     * builder for setAssetKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAssetKeyActionBuilder setAssetKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetKeyActionBuilder.of();
    }
    /**
     * builder for setAssetSources subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAssetSourcesActionBuilder setAssetSourcesBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetSourcesActionBuilder.of();
    }
    /**
     * builder for setAssetTags subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAssetTagsActionBuilder setAssetTagsBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetTagsActionBuilder.of();
    }
    /**
     * builder for setAttribute subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAttributeActionBuilder setAttributeBuilder() {
       return com.commercetools.api.models.product.ProductSetAttributeActionBuilder.of();
    }
    /**
     * builder for setAttributeInAllVariants subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionBuilder setAttributeInAllVariantsBuilder() {
       return com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionBuilder.of();
    }
    /**
     * builder for setCategoryOrderHint subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetCategoryOrderHintActionBuilder setCategoryOrderHintBuilder() {
       return com.commercetools.api.models.product.ProductSetCategoryOrderHintActionBuilder.of();
    }
    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.product.ProductSetDescriptionActionBuilder.of();
    }
    /**
     * builder for setDiscountedPrice subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetDiscountedPriceActionBuilder setDiscountedPriceBuilder() {
       return com.commercetools.api.models.product.ProductSetDiscountedPriceActionBuilder.of();
    }
    /**
     * builder for setImageLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetImageLabelActionBuilder setImageLabelBuilder() {
       return com.commercetools.api.models.product.ProductSetImageLabelActionBuilder.of();
    }
    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetKeyActionBuilder.of();
    }
    /**
     * builder for setMetaDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetMetaDescriptionActionBuilder setMetaDescriptionBuilder() {
       return com.commercetools.api.models.product.ProductSetMetaDescriptionActionBuilder.of();
    }
    /**
     * builder for setMetaKeywords subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetMetaKeywordsActionBuilder setMetaKeywordsBuilder() {
       return com.commercetools.api.models.product.ProductSetMetaKeywordsActionBuilder.of();
    }
    /**
     * builder for setMetaTitle subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetMetaTitleActionBuilder setMetaTitleBuilder() {
       return com.commercetools.api.models.product.ProductSetMetaTitleActionBuilder.of();
    }
    /**
     * builder for setPriceKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetPriceKeyActionBuilder setPriceKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetPriceKeyActionBuilder.of();
    }
    /**
     * builder for setPriceMode subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetPriceModeActionBuilder setPriceModeBuilder() {
       return com.commercetools.api.models.product.ProductSetPriceModeActionBuilder.of();
    }
    /**
     * builder for setPrices subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetPricesActionBuilder setPricesBuilder() {
       return com.commercetools.api.models.product.ProductSetPricesActionBuilder.of();
    }
    /**
     * builder for setProductPriceCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionBuilder setProductPriceCustomFieldBuilder() {
       return com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionBuilder.of();
    }
    /**
     * builder for setProductPriceCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionBuilder setProductPriceCustomTypeBuilder() {
       return com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionBuilder.of();
    }
    /**
     * builder for setProductVariantKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetProductVariantKeyActionBuilder setProductVariantKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetProductVariantKeyActionBuilder.of();
    }
    /**
     * builder for setSearchKeywords subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetSearchKeywordsActionBuilder setSearchKeywordsBuilder() {
       return com.commercetools.api.models.product.ProductSetSearchKeywordsActionBuilder.of();
    }
    /**
     * builder for setSku subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetSkuActionBuilder setSkuBuilder() {
       return com.commercetools.api.models.product.ProductSetSkuActionBuilder.of();
    }
    /**
     * builder for setTaxCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductSetTaxCategoryActionBuilder setTaxCategoryBuilder() {
       return com.commercetools.api.models.product.ProductSetTaxCategoryActionBuilder.of();
    }
    /**
     * builder for transitionState subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.product.ProductTransitionStateActionBuilder.of();
    }
    /**
     * builder for unpublish subtype
     * @return builder
     */
    public static com.commercetools.api.models.product.ProductUnpublishActionBuilder unpublishBuilder() {
       return com.commercetools.api.models.product.ProductUnpublishActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductUpdateAction(Function<ProductUpdateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUpdateAction>";
            }
        };
    }
}
