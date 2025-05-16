
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ProductUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ProductUpdateAction copyDeep();

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

        if (!(template instanceof ProductUpdateActionImpl)) {
            return template.copyDeep();
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
