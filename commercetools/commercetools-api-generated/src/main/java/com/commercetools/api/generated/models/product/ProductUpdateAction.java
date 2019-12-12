package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductAddAssetAction;
import com.commercetools.api.generated.models.product.ProductAddExternalImageAction;
import com.commercetools.api.generated.models.product.ProductAddPriceAction;
import com.commercetools.api.generated.models.product.ProductAddToCategoryAction;
import com.commercetools.api.generated.models.product.ProductAddVariantAction;
import com.commercetools.api.generated.models.product.ProductChangeAssetNameAction;
import com.commercetools.api.generated.models.product.ProductChangeAssetOrderAction;
import com.commercetools.api.generated.models.product.ProductChangeMasterVariantAction;
import com.commercetools.api.generated.models.product.ProductChangeNameAction;
import com.commercetools.api.generated.models.product.ProductChangePriceAction;
import com.commercetools.api.generated.models.product.ProductChangeSlugAction;
import com.commercetools.api.generated.models.product.ProductLegacySetSkuAction;
import com.commercetools.api.generated.models.product.ProductMoveImageToPositionAction;
import com.commercetools.api.generated.models.product.ProductPublishAction;
import com.commercetools.api.generated.models.product.ProductRemoveAssetAction;
import com.commercetools.api.generated.models.product.ProductRemoveFromCategoryAction;
import com.commercetools.api.generated.models.product.ProductRemoveImageAction;
import com.commercetools.api.generated.models.product.ProductRemovePriceAction;
import com.commercetools.api.generated.models.product.ProductRemoveVariantAction;
import com.commercetools.api.generated.models.product.ProductRevertStagedChangesAction;
import com.commercetools.api.generated.models.product.ProductRevertStagedVariantChangesAction;
import com.commercetools.api.generated.models.product.ProductSetAssetCustomFieldAction;
import com.commercetools.api.generated.models.product.ProductSetAssetCustomTypeAction;
import com.commercetools.api.generated.models.product.ProductSetAssetDescriptionAction;
import com.commercetools.api.generated.models.product.ProductSetAssetKeyAction;
import com.commercetools.api.generated.models.product.ProductSetAssetSourcesAction;
import com.commercetools.api.generated.models.product.ProductSetAssetTagsAction;
import com.commercetools.api.generated.models.product.ProductSetAttributeAction;
import com.commercetools.api.generated.models.product.ProductSetAttributeInAllVariantsAction;
import com.commercetools.api.generated.models.product.ProductSetCategoryOrderHintAction;
import com.commercetools.api.generated.models.product.ProductSetDescriptionAction;
import com.commercetools.api.generated.models.product.ProductSetDiscountedPriceAction;
import com.commercetools.api.generated.models.product.ProductSetImageLabelAction;
import com.commercetools.api.generated.models.product.ProductSetKeyAction;
import com.commercetools.api.generated.models.product.ProductSetMetaDescriptionAction;
import com.commercetools.api.generated.models.product.ProductSetMetaKeywordsAction;
import com.commercetools.api.generated.models.product.ProductSetMetaTitleAction;
import com.commercetools.api.generated.models.product.ProductSetPricesAction;
import com.commercetools.api.generated.models.product.ProductSetProductPriceCustomFieldAction;
import com.commercetools.api.generated.models.product.ProductSetProductPriceCustomTypeAction;
import com.commercetools.api.generated.models.product.ProductSetProductVariantKeyAction;
import com.commercetools.api.generated.models.product.ProductSetSearchKeywordsAction;
import com.commercetools.api.generated.models.product.ProductSetSkuAction;
import com.commercetools.api.generated.models.product.ProductSetTaxCategoryAction;
import com.commercetools.api.generated.models.product.ProductTransitionStateAction;
import com.commercetools.api.generated.models.product.ProductUnpublishAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductAddExternalImageActionImpl.class, name = "addExternalImage"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductAddPriceActionImpl.class, name = "addPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductAddToCategoryActionImpl.class, name = "addToCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductAddVariantActionImpl.class, name = "addVariant"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductChangeMasterVariantActionImpl.class, name = "changeMasterVariant"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductChangePriceActionImpl.class, name = "changePrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductLegacySetSkuActionImpl.class, name = "legacySetSku"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductMoveImageToPositionActionImpl.class, name = "moveImageToPosition"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductPublishActionImpl.class, name = "publish"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductRemoveFromCategoryActionImpl.class, name = "removeFromCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductRemoveImageActionImpl.class, name = "removeImage"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductRemovePriceActionImpl.class, name = "removePrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductRemoveVariantActionImpl.class, name = "removeVariant"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductRevertStagedChangesActionImpl.class, name = "revertStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductRevertStagedVariantChangesActionImpl.class, name = "revertStagedVariantChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAttributeActionImpl.class, name = "setAttribute"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetAttributeInAllVariantsActionImpl.class, name = "setAttributeInAllVariants"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetCategoryOrderHintActionImpl.class, name = "setCategoryOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetDiscountedPriceActionImpl.class, name = "setDiscountedPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetImageLabelActionImpl.class, name = "setImageLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetMetaTitleActionImpl.class, name = "setMetaTitle"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetPricesActionImpl.class, name = "setPrices"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetProductPriceCustomFieldActionImpl.class, name = "setProductPriceCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetProductPriceCustomTypeActionImpl.class, name = "setProductPriceCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetProductVariantKeyActionImpl.class, name = "setProductVariantKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetSearchKeywordsActionImpl.class, name = "setSearchKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetSkuActionImpl.class, name = "setSku"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductSetTaxCategoryActionImpl.class, name = "setTaxCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.product.ProductUnpublishActionImpl.class, name = "unpublish")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action",
   defaultImpl = ProductUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProductUpdateAction  {


   


}