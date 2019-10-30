package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.customer_group.CustomerGroupSetCustomTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerGroupSetCustomTypeActionImpl.class)
public interface CustomerGroupSetCustomTypeAction extends CustomerGroupUpdateAction {

   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static CustomerGroupSetCustomTypeActionImpl of(){
      return new CustomerGroupSetCustomTypeActionImpl();
   }
   

   public static CustomerGroupSetCustomTypeActionImpl of(final CustomerGroupSetCustomTypeAction template) {
      CustomerGroupSetCustomTypeActionImpl instance = new CustomerGroupSetCustomTypeActionImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}