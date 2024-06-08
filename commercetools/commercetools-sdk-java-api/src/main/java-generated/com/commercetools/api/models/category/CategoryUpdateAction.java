
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
     * factory method to create a deep copy of CategoryUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryUpdateAction deepCopy(@Nullable final CategoryUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.category.CategoryAddAssetAction) {
            return com.commercetools.api.models.category.CategoryAddAssetAction
                    .deepCopy((com.commercetools.api.models.category.CategoryAddAssetAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryChangeAssetNameAction) {
            return com.commercetools.api.models.category.CategoryChangeAssetNameAction
                    .deepCopy((com.commercetools.api.models.category.CategoryChangeAssetNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryChangeAssetOrderAction) {
            return com.commercetools.api.models.category.CategoryChangeAssetOrderAction
                    .deepCopy((com.commercetools.api.models.category.CategoryChangeAssetOrderAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryChangeNameAction) {
            return com.commercetools.api.models.category.CategoryChangeNameAction
                    .deepCopy((com.commercetools.api.models.category.CategoryChangeNameAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryChangeOrderHintAction) {
            return com.commercetools.api.models.category.CategoryChangeOrderHintAction
                    .deepCopy((com.commercetools.api.models.category.CategoryChangeOrderHintAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryChangeParentAction) {
            return com.commercetools.api.models.category.CategoryChangeParentAction
                    .deepCopy((com.commercetools.api.models.category.CategoryChangeParentAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryChangeSlugAction) {
            return com.commercetools.api.models.category.CategoryChangeSlugAction
                    .deepCopy((com.commercetools.api.models.category.CategoryChangeSlugAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategoryRemoveAssetAction) {
            return com.commercetools.api.models.category.CategoryRemoveAssetAction
                    .deepCopy((com.commercetools.api.models.category.CategoryRemoveAssetAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetAssetCustomFieldAction) {
            return com.commercetools.api.models.category.CategorySetAssetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetAssetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetAssetCustomTypeAction) {
            return com.commercetools.api.models.category.CategorySetAssetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetAssetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetAssetDescriptionAction) {
            return com.commercetools.api.models.category.CategorySetAssetDescriptionAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetAssetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetAssetKeyAction) {
            return com.commercetools.api.models.category.CategorySetAssetKeyAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetAssetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetAssetSourcesAction) {
            return com.commercetools.api.models.category.CategorySetAssetSourcesAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetAssetSourcesAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetAssetTagsAction) {
            return com.commercetools.api.models.category.CategorySetAssetTagsAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetAssetTagsAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetCustomFieldAction) {
            return com.commercetools.api.models.category.CategorySetCustomFieldAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetCustomFieldAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetCustomTypeAction) {
            return com.commercetools.api.models.category.CategorySetCustomTypeAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetCustomTypeAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetDescriptionAction) {
            return com.commercetools.api.models.category.CategorySetDescriptionAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetExternalIdAction) {
            return com.commercetools.api.models.category.CategorySetExternalIdAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetExternalIdAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetKeyAction) {
            return com.commercetools.api.models.category.CategorySetKeyAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetKeyAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetMetaDescriptionAction) {
            return com.commercetools.api.models.category.CategorySetMetaDescriptionAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetMetaDescriptionAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetMetaKeywordsAction) {
            return com.commercetools.api.models.category.CategorySetMetaKeywordsAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetMetaKeywordsAction) template);
        }
        if (template instanceof com.commercetools.api.models.category.CategorySetMetaTitleAction) {
            return com.commercetools.api.models.category.CategorySetMetaTitleAction
                    .deepCopy((com.commercetools.api.models.category.CategorySetMetaTitleAction) template);
        }
        CategoryUpdateActionImpl instance = new CategoryUpdateActionImpl();
        return instance;
    }

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
