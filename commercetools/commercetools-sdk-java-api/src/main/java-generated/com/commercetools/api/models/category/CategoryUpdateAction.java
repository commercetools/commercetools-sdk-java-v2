
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CategoryUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<CategoryUpdateAction> {

    @NotNull
    @JsonProperty("action")
    public String getAction();

    default <T> T withCategoryUpdateAction(Function<CategoryUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
