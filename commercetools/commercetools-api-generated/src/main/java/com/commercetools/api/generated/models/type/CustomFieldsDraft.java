package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraftImpl;

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
@JsonDeserialize(as = CustomFieldsDraftImpl.class)
public interface CustomFieldsDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static CustomFieldsDraftImpl of(){
      return new CustomFieldsDraftImpl();
   }
   

   public static CustomFieldsDraftImpl of(final CustomFieldsDraft template) {
      CustomFieldsDraftImpl instance = new CustomFieldsDraftImpl();
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      return instance;
   }

}