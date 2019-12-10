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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryUpdateActionImpl implements CategoryUpdateAction {

   private String action;

   @JsonCreator
   CategoryUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}