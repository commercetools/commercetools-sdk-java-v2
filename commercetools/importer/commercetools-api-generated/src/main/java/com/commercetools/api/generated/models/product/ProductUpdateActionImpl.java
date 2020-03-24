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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductUpdateActionImpl implements ProductUpdateAction {

   private String action;

   @JsonCreator
   ProductUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}