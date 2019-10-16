package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.type.Type;
import com.commercetools.api.generated.models.type.TypeReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = TypeReferenceImpl.class)
public interface TypeReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Type getObj();

   public void setObj(final Type obj);
   
   public static TypeReferenceImpl of(){
      return new TypeReferenceImpl();
   }
   

   public static TypeReferenceImpl of(final TypeReference template) {
      TypeReferenceImpl instance = new TypeReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}