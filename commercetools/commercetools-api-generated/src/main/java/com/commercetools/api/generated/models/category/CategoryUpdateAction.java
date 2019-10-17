package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryAddAssetAction;
import com.commercetools.api.generated.models.category.CategoryChangeAssetNameAction;
import com.commercetools.api.generated.models.category.CategoryChangeAssetOrderAction;
import com.commercetools.api.generated.models.category.CategoryChangeNameAction;
import com.commercetools.api.generated.models.category.CategoryChangeOrderHintAction;
import com.commercetools.api.generated.models.category.CategoryChangeParentAction;
import com.commercetools.api.generated.models.category.CategoryChangeSlugAction;
import com.commercetools.api.generated.models.category.CategoryRemoveAssetAction;
import com.commercetools.api.generated.models.category.CategorySetAssetCustomFieldAction;
import com.commercetools.api.generated.models.category.CategorySetAssetCustomTypeAction;
import com.commercetools.api.generated.models.category.CategorySetAssetDescriptionAction;
import com.commercetools.api.generated.models.category.CategorySetAssetKeyAction;
import com.commercetools.api.generated.models.category.CategorySetAssetSourcesAction;
import com.commercetools.api.generated.models.category.CategorySetAssetTagsAction;
import com.commercetools.api.generated.models.category.CategorySetCustomFieldAction;
import com.commercetools.api.generated.models.category.CategorySetCustomTypeAction;
import com.commercetools.api.generated.models.category.CategorySetDescriptionAction;
import com.commercetools.api.generated.models.category.CategorySetExternalIdAction;
import com.commercetools.api.generated.models.category.CategorySetKeyAction;
import com.commercetools.api.generated.models.category.CategorySetMetaDescriptionAction;
import com.commercetools.api.generated.models.category.CategorySetMetaKeywordsAction;
import com.commercetools.api.generated.models.category.CategorySetMetaTitleAction;


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
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryAddAssetActionImpl.class, name = "addAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryChangeAssetNameActionImpl.class, name = "changeAssetName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryChangeAssetOrderActionImpl.class, name = "changeAssetOrder"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryChangeOrderHintActionImpl.class, name = "changeOrderHint"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryChangeParentActionImpl.class, name = "changeParent"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryChangeSlugActionImpl.class, name = "changeSlug"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategoryRemoveAssetActionImpl.class, name = "removeAsset"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetAssetCustomFieldActionImpl.class, name = "setAssetCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetAssetCustomTypeActionImpl.class, name = "setAssetCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetAssetDescriptionActionImpl.class, name = "setAssetDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetAssetKeyActionImpl.class, name = "setAssetKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetAssetSourcesActionImpl.class, name = "setAssetSources"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetAssetTagsActionImpl.class, name = "setAssetTags"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetDescriptionActionImpl.class, name = "setDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetExternalIdActionImpl.class, name = "setExternalId"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetKeyActionImpl.class, name = "setKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetMetaDescriptionActionImpl.class, name = "setMetaDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetMetaKeywordsActionImpl.class, name = "setMetaKeywords"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.category.CategorySetMetaTitleActionImpl.class, name = "setMetaTitle")
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