
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductTailoringUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUpdateAction productTailoringUpdateAction = ProductTailoringUpdateAction.addAssetBuilder()
 *             asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ProductTailoringUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ProductTailoringUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductTailoringUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public ProductTailoringUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringUpdateAction deepCopy(@Nullable final ProductTailoringUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof ProductTailoringUpdateActionImpl)) {
            return template.copyDeep();
        }
        ProductTailoringUpdateActionImpl instance = new ProductTailoringUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringAddAssetActionBuilder addAssetBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringAddAssetActionBuilder.of();
    }

    /**
     * builder for addExternalImage subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringAddExternalImageActionBuilder addExternalImageBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringAddExternalImageActionBuilder.of();
    }

    /**
     * builder for addVariant subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringAddVariantActionBuilder addVariantBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringAddVariantActionBuilder.of();
    }

    /**
     * builder for changeAssetName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetNameActionBuilder changeAssetNameBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetNameActionBuilder.of();
    }

    /**
     * builder for changeAssetOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetOrderActionBuilder changeAssetOrderBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetOrderActionBuilder.of();
    }

    /**
     * builder for moveImageToPosition subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringMoveImageToPositionActionBuilder moveImageToPositionBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringMoveImageToPositionActionBuilder.of();
    }

    /**
     * builder for publish subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringPublishActionBuilder publishBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringPublishActionBuilder.of();
    }

    /**
     * builder for removeAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringRemoveAssetActionBuilder removeAssetBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringRemoveAssetActionBuilder.of();
    }

    /**
     * builder for removeImage subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringRemoveImageActionBuilder removeImageBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringRemoveImageActionBuilder.of();
    }

    /**
     * builder for removeVariant subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringRemoveVariantActionBuilder removeVariantBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringRemoveVariantActionBuilder.of();
    }

    /**
     * builder for setAssetCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomFieldActionBuilder setAssetCustomFieldBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setAssetCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomTypeActionBuilder setAssetCustomTypeBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setAssetDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetDescriptionActionBuilder setAssetDescriptionBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetDescriptionActionBuilder.of();
    }

    /**
     * builder for setAssetKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetKeyActionBuilder setAssetKeyBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetKeyActionBuilder.of();
    }

    /**
     * builder for setAssetSources subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetSourcesActionBuilder setAssetSourcesBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetSourcesActionBuilder.of();
    }

    /**
     * builder for setAssetTags subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetTagsActionBuilder setAssetTagsBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetTagsActionBuilder.of();
    }

    /**
     * builder for setAttribute subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAttributeActionBuilder setAttributeBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAttributeActionBuilder.of();
    }

    /**
     * builder for setAttributeInAllVariants subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetAttributeInAllVariantsActionBuilder setAttributeInAllVariantsBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetAttributeInAllVariantsActionBuilder
                .of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionActionBuilder.of();
    }

    /**
     * builder for setImages subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetExternalImagesActionBuilder setImagesBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetExternalImagesActionBuilder.of();
    }

    /**
     * builder for setImageLabel subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetImageLabelActionBuilder setImageLabelBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetImageLabelActionBuilder.of();
    }

    /**
     * builder for setMetaAttributes subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesActionBuilder setMetaAttributesBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesActionBuilder.of();
    }

    /**
     * builder for setMetaDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionActionBuilder setMetaDescriptionBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionActionBuilder.of();
    }

    /**
     * builder for setMetaKeywords subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsActionBuilder setMetaKeywordsBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsActionBuilder.of();
    }

    /**
     * builder for setMetaTitle subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleActionBuilder setMetaTitleBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetNameActionBuilder.of();
    }

    /**
     * builder for setSlug subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugActionBuilder setSlugBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugActionBuilder.of();
    }

    /**
     * builder for unpublish subtype
     * @return builder
     */
    public static com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishActionBuilder unpublishBuilder() {
        return com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringUpdateAction(Function<ProductTailoringUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringUpdateAction>";
            }
        };
    }
}
