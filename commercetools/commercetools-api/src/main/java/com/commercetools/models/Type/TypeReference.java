package com.commercetools.models.Type;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Type.Type;
import com.commercetools.models.Type.TypeReferenceImpl;

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