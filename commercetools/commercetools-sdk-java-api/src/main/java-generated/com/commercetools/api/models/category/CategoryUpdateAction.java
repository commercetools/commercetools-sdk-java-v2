
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryUpdateAction categoryUpdateAction = CategoryUpdateAction.addAssetBuilder()
 *             asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryAddAssetActionImpl.class, name = CategoryAddAssetAction.ADD_ASSET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeAssetNameActionImpl.class, name = CategoryChangeAssetNameAction.CHANGE_ASSET_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeAssetOrderActionImpl.class, name = CategoryChangeAssetOrderAction.CHANGE_ASSET_ORDER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeNameActionImpl.class, name = CategoryChangeNameAction.CHANGE_NAME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeOrderHintActionImpl.class, name = CategoryChangeOrderHintAction.CHANGE_ORDER_HINT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeParentActionImpl.class, name = CategoryChangeParentAction.CHANGE_PARENT),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeSlugActionImpl.class, name = CategoryChangeSlugAction.CHANGE_SLUG),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryRemoveAssetActionImpl.class, name = CategoryRemoveAssetAction.REMOVE_ASSET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetCustomFieldActionImpl.class, name = CategorySetAssetCustomFieldAction.SET_ASSET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetCustomTypeActionImpl.class, name = CategorySetAssetCustomTypeAction.SET_ASSET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetDescriptionActionImpl.class, name = CategorySetAssetDescriptionAction.SET_ASSET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetKeyActionImpl.class, name = CategorySetAssetKeyAction.SET_ASSET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetSourcesActionImpl.class, name = CategorySetAssetSourcesAction.SET_ASSET_SOURCES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetTagsActionImpl.class, name = CategorySetAssetTagsAction.SET_ASSET_TAGS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetCustomFieldActionImpl.class, name = CategorySetCustomFieldAction.SET_CUSTOM_FIELD),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetCustomTypeActionImpl.class, name = CategorySetCustomTypeAction.SET_CUSTOM_TYPE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetDescriptionActionImpl.class, name = CategorySetDescriptionAction.SET_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetExternalIdActionImpl.class, name = CategorySetExternalIdAction.SET_EXTERNAL_ID),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetKeyActionImpl.class, name = CategorySetKeyAction.SET_KEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetMetaDescriptionActionImpl.class, name = CategorySetMetaDescriptionAction.SET_META_DESCRIPTION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetMetaKeywordsActionImpl.class, name = CategorySetMetaKeywordsAction.SET_META_KEYWORDS),
        @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetMetaTitleActionImpl.class, name = CategorySetMetaTitleAction.SET_META_TITLE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CategoryUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CategoryUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CategoryUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<CategoryUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * builder for addAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryAddAssetActionBuilder addAssetBuilder() {
        return com.commercetools.api.models.category.CategoryAddAssetActionBuilder.of();
    }

    /**
     * builder for changeAssetName subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryChangeAssetNameActionBuilder changeAssetNameBuilder() {
        return com.commercetools.api.models.category.CategoryChangeAssetNameActionBuilder.of();
    }

    /**
     * builder for changeAssetOrder subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryChangeAssetOrderActionBuilder changeAssetOrderBuilder() {
        return com.commercetools.api.models.category.CategoryChangeAssetOrderActionBuilder.of();
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.category.CategoryChangeNameActionBuilder.of();
    }

    /**
     * builder for changeOrderHint subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryChangeOrderHintActionBuilder changeOrderHintBuilder() {
        return com.commercetools.api.models.category.CategoryChangeOrderHintActionBuilder.of();
    }

    /**
     * builder for changeParent subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryChangeParentActionBuilder changeParentBuilder() {
        return com.commercetools.api.models.category.CategoryChangeParentActionBuilder.of();
    }

    /**
     * builder for changeSlug subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryChangeSlugActionBuilder changeSlugBuilder() {
        return com.commercetools.api.models.category.CategoryChangeSlugActionBuilder.of();
    }

    /**
     * builder for removeAsset subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategoryRemoveAssetActionBuilder removeAssetBuilder() {
        return com.commercetools.api.models.category.CategoryRemoveAssetActionBuilder.of();
    }

    /**
     * builder for setAssetCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetAssetCustomFieldActionBuilder setAssetCustomFieldBuilder() {
        return com.commercetools.api.models.category.CategorySetAssetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setAssetCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetAssetCustomTypeActionBuilder setAssetCustomTypeBuilder() {
        return com.commercetools.api.models.category.CategorySetAssetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setAssetDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetAssetDescriptionActionBuilder setAssetDescriptionBuilder() {
        return com.commercetools.api.models.category.CategorySetAssetDescriptionActionBuilder.of();
    }

    /**
     * builder for setAssetKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetAssetKeyActionBuilder setAssetKeyBuilder() {
        return com.commercetools.api.models.category.CategorySetAssetKeyActionBuilder.of();
    }

    /**
     * builder for setAssetSources subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetAssetSourcesActionBuilder setAssetSourcesBuilder() {
        return com.commercetools.api.models.category.CategorySetAssetSourcesActionBuilder.of();
    }

    /**
     * builder for setAssetTags subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetAssetTagsActionBuilder setAssetTagsBuilder() {
        return com.commercetools.api.models.category.CategorySetAssetTagsActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.category.CategorySetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.category.CategorySetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.category.CategorySetDescriptionActionBuilder.of();
    }

    /**
     * builder for setExternalId subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetExternalIdActionBuilder setExternalIdBuilder() {
        return com.commercetools.api.models.category.CategorySetExternalIdActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.category.CategorySetKeyActionBuilder.of();
    }

    /**
     * builder for setMetaDescription subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetMetaDescriptionActionBuilder setMetaDescriptionBuilder() {
        return com.commercetools.api.models.category.CategorySetMetaDescriptionActionBuilder.of();
    }

    /**
     * builder for setMetaKeywords subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetMetaKeywordsActionBuilder setMetaKeywordsBuilder() {
        return com.commercetools.api.models.category.CategorySetMetaKeywordsActionBuilder.of();
    }

    /**
     * builder for setMetaTitle subtype
     * @return builder
     */
    public static com.commercetools.api.models.category.CategorySetMetaTitleActionBuilder setMetaTitleBuilder() {
        return com.commercetools.api.models.category.CategorySetMetaTitleActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryUpdateAction(Function<CategoryUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryUpdateAction>";
            }
        };
    }
}
