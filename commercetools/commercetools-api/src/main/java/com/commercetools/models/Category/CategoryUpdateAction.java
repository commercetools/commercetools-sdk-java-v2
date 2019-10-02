package com.commercetools.models.category;

import com.commercetools.models.category.CategoryAddAssetAction;
import com.commercetools.models.category.CategoryChangeAssetNameAction;
import com.commercetools.models.category.CategoryChangeAssetOrderAction;
import com.commercetools.models.category.CategoryChangeNameAction;
import com.commercetools.models.category.CategoryChangeOrderHintAction;
import com.commercetools.models.category.CategoryChangeParentAction;
import com.commercetools.models.category.CategoryChangeSlugAction;
import com.commercetools.models.category.CategoryRemoveAssetAction;
import com.commercetools.models.category.CategorySetAssetCustomFieldAction;
import com.commercetools.models.category.CategorySetAssetCustomTypeAction;
import com.commercetools.models.category.CategorySetAssetDescriptionAction;
import com.commercetools.models.category.CategorySetAssetKeyAction;
import com.commercetools.models.category.CategorySetAssetSourcesAction;
import com.commercetools.models.category.CategorySetAssetTagsAction;
import com.commercetools.models.category.CategorySetCustomFieldAction;
import com.commercetools.models.category.CategorySetCustomTypeAction;
import com.commercetools.models.category.CategorySetDescriptionAction;
import com.commercetools.models.category.CategorySetExternalIdAction;
import com.commercetools.models.category.CategorySetKeyAction;
import com.commercetools.models.category.CategorySetMetaDescriptionAction;
import com.commercetools.models.category.CategorySetMetaKeywordsAction;
import com.commercetools.models.category.CategorySetMetaTitleAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryChangeOrderHintActionImpl.class, name = "changeOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryChangeParentActionImpl.class, name = "changeParent"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategoryRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.models.category.CategorySetMetaTitleActionImpl.class, name = "setMetaTitle")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "action"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CategoryUpdateAction  {


   


}