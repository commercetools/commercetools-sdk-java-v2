
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

    public CategoryUpdateAction copyDeep();

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

        if (!(template instanceof CategoryUpdateActionImpl)) {
            return template.copyDeep();
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
