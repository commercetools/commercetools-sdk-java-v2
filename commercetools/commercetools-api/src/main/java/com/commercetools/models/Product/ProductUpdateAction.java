package com.commercetools.models.product;

import com.commercetools.models.product.ProductAddAssetAction;
import com.commercetools.models.product.ProductAddExternalImageAction;
import com.commercetools.models.product.ProductAddPriceAction;
import com.commercetools.models.product.ProductAddToCategoryAction;
import com.commercetools.models.product.ProductAddVariantAction;
import com.commercetools.models.product.ProductChangeAssetNameAction;
import com.commercetools.models.product.ProductChangeAssetOrderAction;
import com.commercetools.models.product.ProductChangeMasterVariantAction;
import com.commercetools.models.product.ProductChangeNameAction;
import com.commercetools.models.product.ProductChangePriceAction;
import com.commercetools.models.product.ProductChangeSlugAction;
import com.commercetools.models.product.ProductLegacySetSkuAction;
import com.commercetools.models.product.ProductMoveImageToPositionAction;
import com.commercetools.models.product.ProductPublishAction;
import com.commercetools.models.product.ProductRemoveAssetAction;
import com.commercetools.models.product.ProductRemoveFromCategoryAction;
import com.commercetools.models.product.ProductRemoveImageAction;
import com.commercetools.models.product.ProductRemovePriceAction;
import com.commercetools.models.product.ProductRemoveVariantAction;
import com.commercetools.models.product.ProductRevertStagedChangesAction;
import com.commercetools.models.product.ProductRevertStagedVariantChangesAction;
import com.commercetools.models.product.ProductSetAssetCustomFieldAction;
import com.commercetools.models.product.ProductSetAssetCustomTypeAction;
import com.commercetools.models.product.ProductSetAssetDescriptionAction;
import com.commercetools.models.product.ProductSetAssetKeyAction;
import com.commercetools.models.product.ProductSetAssetSourcesAction;
import com.commercetools.models.product.ProductSetAssetTagsAction;
import com.commercetools.models.product.ProductSetAttributeAction;
import com.commercetools.models.product.ProductSetAttributeInAllVariantsAction;
import com.commercetools.models.product.ProductSetCategoryOrderHintAction;
import com.commercetools.models.product.ProductSetDescriptionAction;
import com.commercetools.models.product.ProductSetDiscountedPriceAction;
import com.commercetools.models.product.ProductSetImageLabelAction;
import com.commercetools.models.product.ProductSetKeyAction;
import com.commercetools.models.product.ProductSetMetaDescriptionAction;
import com.commercetools.models.product.ProductSetMetaKeywordsAction;
import com.commercetools.models.product.ProductSetMetaTitleAction;
import com.commercetools.models.product.ProductSetPricesAction;
import com.commercetools.models.product.ProductSetProductPriceCustomFieldAction;
import com.commercetools.models.product.ProductSetProductPriceCustomTypeAction;
import com.commercetools.models.product.ProductSetProductVariantKeyAction;
import com.commercetools.models.product.ProductSetSearchKeywordsAction;
import com.commercetools.models.product.ProductSetSkuAction;
import com.commercetools.models.product.ProductSetTaxCategoryAction;
import com.commercetools.models.product.ProductTransitionStateAction;
import com.commercetools.models.product.ProductUnpublishAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductAddExternalImageActionImpl.class, name = "addExternalImage"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductAddPriceActionImpl.class, name = "addPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductAddToCategoryActionImpl.class, name = "addToCategory"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductAddVariantActionImpl.class, name = "addVariant"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductChangeMasterVariantActionImpl.class, name = "changeMasterVariant"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductChangePriceActionImpl.class, name = "changePrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductLegacySetSkuActionImpl.class, name = "legacySetSku"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductMoveImageToPositionActionImpl.class, name = "moveImageToPosition"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductPublishActionImpl.class, name = "publish"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductRemoveFromCategoryActionImpl.class, name = "removeFromCategory"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductRemoveImageActionImpl.class, name = "removeImage"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductRemovePriceActionImpl.class, name = "removePrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductRemoveVariantActionImpl.class, name = "removeVariant"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductRevertStagedChangesActionImpl.class, name = "revertStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductRevertStagedVariantChangesActionImpl.class, name = "revertStagedVariantChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAttributeActionImpl.class, name = "setAttribute"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetAttributeInAllVariantsActionImpl.class, name = "setAttributeInAllVariants"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetCategoryOrderHintActionImpl.class, name = "setCategoryOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetDiscountedPriceActionImpl.class, name = "setDiscountedPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetImageLabelActionImpl.class, name = "setImageLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetMetaTitleActionImpl.class, name = "setMetaTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetPricesActionImpl.class, name = "setPrices"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetProductPriceCustomFieldActionImpl.class, name = "setProductPriceCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetProductPriceCustomTypeActionImpl.class, name = "setProductPriceCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetProductVariantKeyActionImpl.class, name = "setProductVariantKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetSearchKeywordsActionImpl.class, name = "setSearchKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetSkuActionImpl.class, name = "setSku"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductSetTaxCategoryActionImpl.class, name = "setTaxCategory"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.models.product.ProductUnpublishActionImpl.class, name = "unpublish")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProductUpdateAction  {


   


}