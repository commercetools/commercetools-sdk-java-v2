package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryAddAssetAction;
import com.commercetools.models.Category.CategoryChangeAssetNameAction;
import com.commercetools.models.Category.CategoryChangeAssetOrderAction;
import com.commercetools.models.Category.CategoryChangeNameAction;
import com.commercetools.models.Category.CategoryChangeOrderHintAction;
import com.commercetools.models.Category.CategoryChangeParentAction;
import com.commercetools.models.Category.CategoryChangeSlugAction;
import com.commercetools.models.Category.CategoryRemoveAssetAction;
import com.commercetools.models.Category.CategorySetAssetCustomFieldAction;
import com.commercetools.models.Category.CategorySetAssetCustomTypeAction;
import com.commercetools.models.Category.CategorySetAssetDescriptionAction;
import com.commercetools.models.Category.CategorySetAssetKeyAction;
import com.commercetools.models.Category.CategorySetAssetSourcesAction;
import com.commercetools.models.Category.CategorySetAssetTagsAction;
import com.commercetools.models.Category.CategorySetCustomFieldAction;
import com.commercetools.models.Category.CategorySetCustomTypeAction;
import com.commercetools.models.Category.CategorySetDescriptionAction;
import com.commercetools.models.Category.CategorySetExternalIdAction;
import com.commercetools.models.Category.CategorySetKeyAction;
import com.commercetools.models.Category.CategorySetMetaDescriptionAction;
import com.commercetools.models.Category.CategorySetMetaKeywordsAction;
import com.commercetools.models.Category.CategorySetMetaTitleAction;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryChangeOrderHintActionImpl.class, name = "changeOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryChangeParentActionImpl.class, name = "changeParent"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategoryRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.models.Category.CategorySetMetaTitleActionImpl.class, name = "setMetaTitle")
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