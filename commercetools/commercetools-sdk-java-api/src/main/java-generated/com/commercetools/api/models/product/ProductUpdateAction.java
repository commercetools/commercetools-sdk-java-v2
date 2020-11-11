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
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddExternalImageActionImpl.class, name = "addExternalImage"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddPriceActionImpl.class, name = "addPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddToCategoryActionImpl.class, name = "addToCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductAddVariantActionImpl.class, name = "addVariant"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeMasterVariantActionImpl.class, name = "changeMasterVariant"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangePriceActionImpl.class, name = "changePrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductLegacySetSkuActionImpl.class, name = "legacySetSku"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductMoveImageToPositionActionImpl.class, name = "moveImageToPosition"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductPublishActionImpl.class, name = "publish"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveFromCategoryActionImpl.class, name = "removeFromCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveImageActionImpl.class, name = "removeImage"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemovePriceActionImpl.class, name = "removePrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRemoveVariantActionImpl.class, name = "removeVariant"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRevertStagedChangesActionImpl.class, name = "revertStagedChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionImpl.class, name = "revertStagedVariantChanges"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAttributeActionImpl.class, name = "setAttribute"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionImpl.class, name = "setAttributeInAllVariants"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetCategoryOrderHintActionImpl.class, name = "setCategoryOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetDiscountedPriceActionImpl.class, name = "setDiscountedPrice"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetImageLabelActionImpl.class, name = "setImageLabel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetMetaTitleActionImpl.class, name = "setMetaTitle"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetPricesActionImpl.class, name = "setPrices"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionImpl.class, name = "setProductPriceCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionImpl.class, name = "setProductPriceCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetProductVariantKeyActionImpl.class, name = "setProductVariantKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetSearchKeywordsActionImpl.class, name = "setSearchKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetSkuActionImpl.class, name = "setSku"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductSetTaxCategoryActionImpl.class, name = "setTaxCategory"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductTransitionStateActionImpl.class, name = "transitionState"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.product.ProductUnpublishActionImpl.class, name = "unpublish")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ProductUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ProductUpdateAction  {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();




    default <T> T withProductUpdateAction(Function<ProductUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
