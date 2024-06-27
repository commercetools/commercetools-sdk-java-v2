
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringAddAssetActionImpl.class, name = ProductTailoringAddAssetAction.ADD_ASSET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringAddExternalImageActionImpl.class, name = ProductTailoringAddExternalImageAction.ADD_EXTERNAL_IMAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringAddVariantActionImpl.class, name = ProductTailoringAddVariantAction.ADD_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetNameActionImpl.class, name = ProductTailoringChangeAssetNameAction.CHANGE_ASSET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetOrderActionImpl.class, name = ProductTailoringChangeAssetOrderAction.CHANGE_ASSET_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringMoveImageToPositionActionImpl.class, name = ProductTailoringMoveImageToPositionAction.MOVE_IMAGE_TO_POSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringPublishActionImpl.class, name = ProductTailoringPublishAction.PUBLISH),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringRemoveAssetActionImpl.class, name = ProductTailoringRemoveAssetAction.REMOVE_ASSET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringRemoveImageActionImpl.class, name = ProductTailoringRemoveImageAction.REMOVE_IMAGE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringRemoveVariantActionImpl.class, name = ProductTailoringRemoveVariantAction.REMOVE_VARIANT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomFieldActionImpl.class, name = ProductTailoringSetAssetCustomFieldAction.SET_ASSET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomTypeActionImpl.class, name = ProductTailoringSetAssetCustomTypeAction.SET_ASSET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetDescriptionActionImpl.class, name = ProductTailoringSetAssetDescriptionAction.SET_ASSET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetKeyActionImpl.class, name = ProductTailoringSetAssetKeyAction.SET_ASSET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetSourcesActionImpl.class, name = ProductTailoringSetAssetSourcesAction.SET_ASSET_SOURCES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetTagsActionImpl.class, name = ProductTailoringSetAssetTagsAction.SET_ASSET_TAGS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionActionImpl.class, name = ProductTailoringSetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetExternalImagesActionImpl.class, name = ProductTailoringSetExternalImagesAction.SET_IMAGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetImageLabelActionImpl.class, name = ProductTailoringSetImageLabelAction.SET_IMAGE_LABEL),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesActionImpl.class, name = ProductTailoringSetMetaAttributesAction.SET_META_ATTRIBUTES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionActionImpl.class, name = ProductTailoringSetMetaDescriptionAction.SET_META_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsActionImpl.class, name = ProductTailoringSetMetaKeywordsAction.SET_META_KEYWORDS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleActionImpl.class, name = ProductTailoringSetMetaTitleAction.SET_META_TITLE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetNameActionImpl.class, name = ProductTailoringSetNameAction.SET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugActionImpl.class, name = ProductTailoringSetSlugAction.SET_SLUG),
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishActionImpl.class, name = ProductTailoringUnpublishAction.UNPUBLISH) })
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
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringAddAssetAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringAddAssetAction
                    .deepCopy((com.commercetools.api.models.product_tailoring.ProductTailoringAddAssetAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringAddExternalImageAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringAddExternalImageAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringAddExternalImageAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringAddVariantAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringAddVariantAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringAddVariantAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetNameAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetNameAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetOrderAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetOrderAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringChangeAssetOrderAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringMoveImageToPositionAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringMoveImageToPositionAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringMoveImageToPositionAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringPublishAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringPublishAction
                    .deepCopy((com.commercetools.api.models.product_tailoring.ProductTailoringPublishAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringRemoveAssetAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringRemoveAssetAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringRemoveAssetAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringRemoveImageAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringRemoveImageAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringRemoveImageAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringRemoveVariantAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringRemoveVariantAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringRemoveVariantAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomFieldAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomFieldAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomTypeAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomTypeAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetDescriptionAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetDescriptionAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetKeyAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetKeyAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetSourcesAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetSourcesAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetSourcesAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetTagsAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetTagsAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetAssetTagsAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetExternalImagesAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetExternalImagesAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetExternalImagesAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetImageLabelAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetImageLabelAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetImageLabelAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaAttributesAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaKeywordsAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringSetMetaTitleAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetNameAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetNameAction
                    .deepCopy((com.commercetools.api.models.product_tailoring.ProductTailoringSetNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugAction
                    .deepCopy((com.commercetools.api.models.product_tailoring.ProductTailoringSetSlugAction) template);
        }
        if (template instanceof com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishAction) {
            return com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishAction.deepCopy(
                (com.commercetools.api.models.product_tailoring.ProductTailoringUnpublishAction) template);
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
