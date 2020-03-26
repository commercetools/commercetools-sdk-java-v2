package com.commercetools.api.ml.generated.models.common;

import com.commercetools.api.ml.generated.models.common.Reference;
import com.commercetools.api.ml.generated.models.common.ReferenceTypeId;
import com.commercetools.api.ml.generated.models.common.CategoryReferenceImpl;

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
@JsonDeserialize(as = CategoryReferenceImpl.class)
public interface CategoryReference extends Reference {


   
   public static CategoryReferenceImpl of(){
      return new CategoryReferenceImpl();
   }
   

   public static CategoryReferenceImpl of(final CategoryReference template) {
      CategoryReferenceImpl instance = new CategoryReferenceImpl();
      instance.setId(template.getId());
      return instance;
   }

}
