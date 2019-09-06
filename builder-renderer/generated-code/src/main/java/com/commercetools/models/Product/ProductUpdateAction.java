package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductAddAssetAction;
import com.commercetools.models.Product.ProductAddExternalImageAction;
import com.commercetools.models.Product.ProductAddPriceAction;
import com.commercetools.models.Product.ProductAddToCategoryAction;
import com.commercetools.models.Product.ProductAddVariantAction;
import com.commercetools.models.Product.ProductChangeAssetNameAction;
import com.commercetools.models.Product.ProductChangeAssetOrderAction;
import com.commercetools.models.Product.ProductChangeMasterVariantAction;
import com.commercetools.models.Product.ProductChangeNameAction;
import com.commercetools.models.Product.ProductChangePriceAction;
import com.commercetools.models.Product.ProductChangeSlugAction;
import com.commercetools.models.Product.ProductLegacySetSkuAction;
import com.commercetools.models.Product.ProductMoveImageToPositionAction;
import com.commercetools.models.Product.ProductPublishAction;
import com.commercetools.models.Product.ProductRemoveAssetAction;
import com.commercetools.models.Product.ProductRemoveFromCategoryAction;
import com.commercetools.models.Product.ProductRemoveImageAction;
import com.commercetools.models.Product.ProductRemovePriceAction;
import com.commercetools.models.Product.ProductRemoveVariantAction;
import com.commercetools.models.Product.ProductRevertStagedChangesAction;
import com.commercetools.models.Product.ProductRevertStagedVariantChangesAction;
import com.commercetools.models.Product.ProductSetAssetCustomFieldAction;
import com.commercetools.models.Product.ProductSetAssetCustomTypeAction;
import com.commercetools.models.Product.ProductSetAssetDescriptionAction;
import com.commercetools.models.Product.ProductSetAssetKeyAction;
import com.commercetools.models.Product.ProductSetAssetSourcesAction;
import com.commercetools.models.Product.ProductSetAssetTagsAction;
import com.commercetools.models.Product.ProductSetAttributeAction;
import com.commercetools.models.Product.ProductSetAttributeInAllVariantsAction;
import com.commercetools.models.Product.ProductSetCategoryOrderHintAction;
import com.commercetools.models.Product.ProductSetDescriptionAction;
import com.commercetools.models.Product.ProductSetDiscountedPriceAction;
import com.commercetools.models.Product.ProductSetImageLabelAction;
import com.commercetools.models.Product.ProductSetKeyAction;
import com.commercetools.models.Product.ProductSetMetaDescriptionAction;
import com.commercetools.models.Product.ProductSetMetaKeywordsAction;
import com.commercetools.models.Product.ProductSetMetaTitleAction;
import com.commercetools.models.Product.ProductSetPricesAction;
import com.commercetools.models.Product.ProductSetProductPriceCustomFieldAction;
import com.commercetools.models.Product.ProductSetProductPriceCustomTypeAction;
import com.commercetools.models.Product.ProductSetProductVariantKeyAction;
import com.commercetools.models.Product.ProductSetSearchKeywordsAction;
import com.commercetools.models.Product.ProductSetSkuAction;
import com.commercetools.models.Product.ProductSetTaxCategoryAction;
import com.commercetools.models.Product.ProductTransitionStateAction;
import com.commercetools.models.Product.ProductUnpublishAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductAddExternalImageActionImpl.class, name = "addExternalImage"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductAddPriceActionImpl.class, name = "addPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductAddToCategoryActionImpl.class, name = "addToCategory"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductAddVariantActionImpl.class, name = "addVariant"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductChangeMasterVariantActionImpl.class, name = "changeMasterVariant"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductChangePriceActionImpl.class, name = "changePrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductLegacySetSkuActionImpl.class, name = "legacySetSku"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductMoveImageToPositionActionImpl.class, name = "moveImageToPosition"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductPublishActionImpl.class, name = "publish"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductRemoveFromCategoryActionImpl.class, name = "removeFromCategory"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductRemoveImageActionImpl.class, name = "removeImage"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductRemovePriceActionImpl.class, name = "removePrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductRemoveVariantActionImpl.class, name = "removeVariant"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductRevertStagedChangesActionImpl.class, name = "revertStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductRevertStagedVariantChangesActionImpl.class, name = "revertStagedVariantChanges"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAttributeActionImpl.class, name = "setAttribute"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetAttributeInAllVariantsActionImpl.class, name = "setAttributeInAllVariants"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetCategoryOrderHintActionImpl.class, name = "setCategoryOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetDiscountedPriceActionImpl.class, name = "setDiscountedPrice"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetImageLabelActionImpl.class, name = "setImageLabel"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetMetaTitleActionImpl.class, name = "setMetaTitle"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetPricesActionImpl.class, name = "setPrices"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetProductPriceCustomFieldActionImpl.class, name = "setProductPriceCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetProductPriceCustomTypeActionImpl.class, name = "setProductPriceCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetProductVariantKeyActionImpl.class, name = "setProductVariantKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetSearchKeywordsActionImpl.class, name = "setSearchKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetSkuActionImpl.class, name = "setSku"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductSetTaxCategoryActionImpl.class, name = "setTaxCategory"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.models.Product.ProductUnpublishActionImpl.class, name = "unpublish")
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