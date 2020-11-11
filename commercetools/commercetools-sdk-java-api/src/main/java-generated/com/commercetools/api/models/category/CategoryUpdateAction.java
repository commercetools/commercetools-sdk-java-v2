package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryAddAssetAction;
import com.commercetools.api.models.category.CategoryChangeAssetNameAction;
import com.commercetools.api.models.category.CategoryChangeAssetOrderAction;
import com.commercetools.api.models.category.CategoryChangeNameAction;
import com.commercetools.api.models.category.CategoryChangeOrderHintAction;
import com.commercetools.api.models.category.CategoryChangeParentAction;
import com.commercetools.api.models.category.CategoryChangeSlugAction;
import com.commercetools.api.models.category.CategoryRemoveAssetAction;
import com.commercetools.api.models.category.CategorySetAssetCustomFieldAction;
import com.commercetools.api.models.category.CategorySetAssetCustomTypeAction;
import com.commercetools.api.models.category.CategorySetAssetDescriptionAction;
import com.commercetools.api.models.category.CategorySetAssetKeyAction;
import com.commercetools.api.models.category.CategorySetAssetSourcesAction;
import com.commercetools.api.models.category.CategorySetAssetTagsAction;
import com.commercetools.api.models.category.CategorySetCustomFieldAction;
import com.commercetools.api.models.category.CategorySetCustomTypeAction;
import com.commercetools.api.models.category.CategorySetDescriptionAction;
import com.commercetools.api.models.category.CategorySetExternalIdAction;
import com.commercetools.api.models.category.CategorySetKeyAction;
import com.commercetools.api.models.category.CategorySetMetaDescriptionAction;
import com.commercetools.api.models.category.CategorySetMetaKeywordsAction;
import com.commercetools.api.models.category.CategorySetMetaTitleAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeOrderHintActionImpl.class, name = "changeOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeParentActionImpl.class, name = "changeParent"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategoryRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.category.CategorySetMetaTitleActionImpl.class, name = "setMetaTitle")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = CategoryUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CategoryUpdateAction  {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();




    default <T> T withCategoryUpdateAction(Function<CategoryUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
