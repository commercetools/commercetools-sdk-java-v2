package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeAddAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeAddLocalizedEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeAddPlainEnumValueAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeConstraintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderAction;
import com.commercetools.api.models.product_type.ProductTypeChangeAttributeOrderByNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangeDescriptionAction;
import com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction;
import com.commercetools.api.models.product_type.ProductTypeChangeInputHintAction;
import com.commercetools.api.models.product_type.ProductTypeChangeIsSearchableAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangeLocalizedEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeChangeNameAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueLabelAction;
import com.commercetools.api.models.product_type.ProductTypeChangePlainEnumValueOrderAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveAttributeDefinitionAction;
import com.commercetools.api.models.product_type.ProductTypeRemoveEnumValuesAction;
import com.commercetools.api.models.product_type.ProductTypeSetInputTipAction;
import com.commercetools.api.models.product_type.ProductTypeSetKeyAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeUpdateActionImpl implements ProductTypeUpdateAction {

   private String action;

   @JsonCreator
   ProductTypeUpdateActionImpl() {
      this.action = "null";
   }
   
   
   
   public String getAction(){
      return this.action;
   }


}
