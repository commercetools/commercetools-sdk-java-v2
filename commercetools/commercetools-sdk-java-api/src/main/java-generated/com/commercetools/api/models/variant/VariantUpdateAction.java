
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 * VariantUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUpdateAction variantUpdateAction = VariantUpdateAction.addAssetBuilder()
 *             asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = VariantUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = VariantUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface VariantUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public VariantUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of VariantUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantUpdateAction deepCopy(@Nullable final VariantUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof VariantUpdateActionImpl)) {
            return template.copyDeep();
        }
        VariantUpdateActionImpl instance = new VariantUpdateActionImpl();
        return instance;
    }

    /**
     * builder for addAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantAddAssetActionBuilder addAssetBuilder() {
        return com.commercetools.api.models.variant.VariantAddAssetActionBuilder.of();
    }

    /**
     * builder for addExternalImage subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantAddExternalImageActionBuilder addExternalImageBuilder() {
        return com.commercetools.api.models.variant.VariantAddExternalImageActionBuilder.of();
    }

    /**
     * builder for changeAssetName subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantChangeAssetNameActionBuilder changeAssetNameBuilder() {
        return com.commercetools.api.models.variant.VariantChangeAssetNameActionBuilder.of();
    }

    /**
     * builder for changeAssetOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantChangeAssetOrderActionBuilder changeAssetOrderBuilder() {
        return com.commercetools.api.models.variant.VariantChangeAssetOrderActionBuilder.of();
    }

    /**
     * builder for publish subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantPublishActionBuilder publishBuilder() {
        return com.commercetools.api.models.variant.VariantPublishActionBuilder.of();
    }

    /**
     * builder for removeAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantRemoveAssetActionBuilder removeAssetBuilder() {
        return com.commercetools.api.models.variant.VariantRemoveAssetActionBuilder.of();
    }

    /**
     * builder for removeImage subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantRemoveImageActionBuilder removeImageBuilder() {
        return com.commercetools.api.models.variant.VariantRemoveImageActionBuilder.of();
    }

    /**
     * builder for removeStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantRemoveStagedChangesActionBuilder removeStagedChangesBuilder() {
        return com.commercetools.api.models.variant.VariantRemoveStagedChangesActionBuilder.of();
    }

    /**
     * builder for setAssetCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAssetCustomFieldActionBuilder setAssetCustomFieldBuilder() {
        return com.commercetools.api.models.variant.VariantSetAssetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setAssetCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAssetCustomTypeActionBuilder setAssetCustomTypeBuilder() {
        return com.commercetools.api.models.variant.VariantSetAssetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setAssetDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAssetDescriptionActionBuilder setAssetDescriptionBuilder() {
        return com.commercetools.api.models.variant.VariantSetAssetDescriptionActionBuilder.of();
    }

    /**
     * builder for setAssetKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAssetKeyActionBuilder setAssetKeyBuilder() {
        return com.commercetools.api.models.variant.VariantSetAssetKeyActionBuilder.of();
    }

    /**
     * builder for setAssetSources subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAssetSourcesActionBuilder setAssetSourcesBuilder() {
        return com.commercetools.api.models.variant.VariantSetAssetSourcesActionBuilder.of();
    }

    /**
     * builder for setAssetTags subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAssetTagsActionBuilder setAssetTagsBuilder() {
        return com.commercetools.api.models.variant.VariantSetAssetTagsActionBuilder.of();
    }

    /**
     * builder for setAssets subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAssetsActionBuilder setAssetsBuilder() {
        return com.commercetools.api.models.variant.VariantSetAssetsActionBuilder.of();
    }

    /**
     * builder for setAttribute subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAttributeActionBuilder setAttributeBuilder() {
        return com.commercetools.api.models.variant.VariantSetAttributeActionBuilder.of();
    }

    /**
     * builder for setAttributes subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetAttributesActionBuilder setAttributesBuilder() {
        return com.commercetools.api.models.variant.VariantSetAttributesActionBuilder.of();
    }

    /**
     * builder for setImages subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetImagesActionBuilder setImagesBuilder() {
        return com.commercetools.api.models.variant.VariantSetImagesActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.variant.VariantSetKeyActionBuilder.of();
    }

    /**
     * builder for setSku subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantSetSkuActionBuilder setSkuBuilder() {
        return com.commercetools.api.models.variant.VariantSetSkuActionBuilder.of();
    }

    /**
     * builder for unpublish subtype
     * @return builder
     */
    public static com.commercetools.api.models.variant.VariantUnpublishActionBuilder unpublishBuilder() {
        return com.commercetools.api.models.variant.VariantUnpublishActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantUpdateAction(Function<VariantUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantUpdateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantUpdateAction>";
            }
        };
    }
}
