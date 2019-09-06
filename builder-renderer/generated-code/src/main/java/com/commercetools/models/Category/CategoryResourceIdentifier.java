package com.commercetools.models.Category;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Category.CategoryResourceIdentifierImpl;

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
@JsonDeserialize(as = CategoryResourceIdentifierImpl.class)
public interface CategoryResourceIdentifier extends ResourceIdentifier {


   
   public static CategoryResourceIdentifierImpl of(){
      return new CategoryResourceIdentifierImpl();
   }
   

   public static CategoryResourceIdentifierImpl of(final CategoryResourceIdentifier template) {
      CategoryResourceIdentifierImpl instance = new CategoryResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}