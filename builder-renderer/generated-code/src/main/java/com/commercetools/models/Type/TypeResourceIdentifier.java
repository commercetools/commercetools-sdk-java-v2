package com.commercetools.models.Type;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Type.TypeResourceIdentifierImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TypeResourceIdentifierImpl.class)
public interface TypeResourceIdentifier extends ResourceIdentifier {


   
   public static TypeResourceIdentifierImpl of(){
      return new TypeResourceIdentifierImpl();
   }
   

   public static TypeResourceIdentifierImpl of(final TypeResourceIdentifier template) {
      TypeResourceIdentifierImpl instance = new TypeResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}