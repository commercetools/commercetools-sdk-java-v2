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
import com.commercetools.api.models.product.ProductUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductUpdateActionBuilder {

    public com.commercetools.api.models.product.ProductAddAssetActionBuilder addAssetBuilder() {
       return com.commercetools.api.models.product.ProductAddAssetActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductAddExternalImageActionBuilder addExternalImageBuilder() {
       return com.commercetools.api.models.product.ProductAddExternalImageActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductAddPriceActionBuilder addPriceBuilder() {
       return com.commercetools.api.models.product.ProductAddPriceActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductAddToCategoryActionBuilder addToCategoryBuilder() {
       return com.commercetools.api.models.product.ProductAddToCategoryActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductAddVariantActionBuilder addVariantBuilder() {
       return com.commercetools.api.models.product.ProductAddVariantActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductChangeAssetNameActionBuilder changeAssetNameBuilder() {
       return com.commercetools.api.models.product.ProductChangeAssetNameActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductChangeAssetOrderActionBuilder changeAssetOrderBuilder() {
       return com.commercetools.api.models.product.ProductChangeAssetOrderActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductChangeMasterVariantActionBuilder changeMasterVariantBuilder() {
       return com.commercetools.api.models.product.ProductChangeMasterVariantActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.product.ProductChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductChangePriceActionBuilder changePriceBuilder() {
       return com.commercetools.api.models.product.ProductChangePriceActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductChangeSlugActionBuilder changeSlugBuilder() {
       return com.commercetools.api.models.product.ProductChangeSlugActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductLegacySetSkuActionBuilder legacySetSkuBuilder() {
       return com.commercetools.api.models.product.ProductLegacySetSkuActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductMoveImageToPositionActionBuilder moveImageToPositionBuilder() {
       return com.commercetools.api.models.product.ProductMoveImageToPositionActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductPublishActionBuilder publishBuilder() {
       return com.commercetools.api.models.product.ProductPublishActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductRemoveAssetActionBuilder removeAssetBuilder() {
       return com.commercetools.api.models.product.ProductRemoveAssetActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductRemoveFromCategoryActionBuilder removeFromCategoryBuilder() {
       return com.commercetools.api.models.product.ProductRemoveFromCategoryActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductRemoveImageActionBuilder removeImageBuilder() {
       return com.commercetools.api.models.product.ProductRemoveImageActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductRemovePriceActionBuilder removePriceBuilder() {
       return com.commercetools.api.models.product.ProductRemovePriceActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductRemoveVariantActionBuilder removeVariantBuilder() {
       return com.commercetools.api.models.product.ProductRemoveVariantActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductRevertStagedChangesActionBuilder revertStagedChangesBuilder() {
       return com.commercetools.api.models.product.ProductRevertStagedChangesActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionBuilder revertStagedVariantChangesBuilder() {
       return com.commercetools.api.models.product.ProductRevertStagedVariantChangesActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAssetCustomFieldActionBuilder setAssetCustomFieldBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAssetCustomTypeActionBuilder setAssetCustomTypeBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAssetDescriptionActionBuilder setAssetDescriptionBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAssetKeyActionBuilder setAssetKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAssetSourcesActionBuilder setAssetSourcesBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetSourcesActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAssetTagsActionBuilder setAssetTagsBuilder() {
       return com.commercetools.api.models.product.ProductSetAssetTagsActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAttributeActionBuilder setAttributeBuilder() {
       return com.commercetools.api.models.product.ProductSetAttributeActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionBuilder setAttributeInAllVariantsBuilder() {
       return com.commercetools.api.models.product.ProductSetAttributeInAllVariantsActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetCategoryOrderHintActionBuilder setCategoryOrderHintBuilder() {
       return com.commercetools.api.models.product.ProductSetCategoryOrderHintActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetDescriptionActionBuilder setDescriptionBuilder() {
       return com.commercetools.api.models.product.ProductSetDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetDiscountedPriceActionBuilder setDiscountedPriceBuilder() {
       return com.commercetools.api.models.product.ProductSetDiscountedPriceActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetImageLabelActionBuilder setImageLabelBuilder() {
       return com.commercetools.api.models.product.ProductSetImageLabelActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetKeyActionBuilder setKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetKeyActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetMetaDescriptionActionBuilder setMetaDescriptionBuilder() {
       return com.commercetools.api.models.product.ProductSetMetaDescriptionActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetMetaKeywordsActionBuilder setMetaKeywordsBuilder() {
       return com.commercetools.api.models.product.ProductSetMetaKeywordsActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetMetaTitleActionBuilder setMetaTitleBuilder() {
       return com.commercetools.api.models.product.ProductSetMetaTitleActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetPriceKeyActionBuilder setPriceKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetPriceKeyActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetPriceModeActionBuilder setPriceModeBuilder() {
       return com.commercetools.api.models.product.ProductSetPriceModeActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetPricesActionBuilder setPricesBuilder() {
       return com.commercetools.api.models.product.ProductSetPricesActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionBuilder setProductPriceCustomFieldBuilder() {
       return com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionBuilder setProductPriceCustomTypeBuilder() {
       return com.commercetools.api.models.product.ProductSetProductPriceCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetProductVariantKeyActionBuilder setProductVariantKeyBuilder() {
       return com.commercetools.api.models.product.ProductSetProductVariantKeyActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetSearchKeywordsActionBuilder setSearchKeywordsBuilder() {
       return com.commercetools.api.models.product.ProductSetSearchKeywordsActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetSkuActionBuilder setSkuBuilder() {
       return com.commercetools.api.models.product.ProductSetSkuActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductSetTaxCategoryActionBuilder setTaxCategoryBuilder() {
       return com.commercetools.api.models.product.ProductSetTaxCategoryActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductTransitionStateActionBuilder transitionStateBuilder() {
       return com.commercetools.api.models.product.ProductTransitionStateActionBuilder.of();
    }
    public com.commercetools.api.models.product.ProductUnpublishActionBuilder unpublishBuilder() {
       return com.commercetools.api.models.product.ProductUnpublishActionBuilder.of();
    }

    /**
     * factory method for an instance of ProductUpdateActionBuilder
     * @return builder 
     */
    public static ProductUpdateActionBuilder of() {
        return new ProductUpdateActionBuilder();
    }

}
