package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.common.CategoryKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>References a category by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategoryKeyReferenceImpl.class)
public interface CategoryKeyReference extends KeyReference {


   
   public static CategoryKeyReferenceImpl of(){
      return new CategoryKeyReferenceImpl();
   }
   

   public static CategoryKeyReferenceImpl of(final CategoryKeyReference template) {
      CategoryKeyReferenceImpl instance = new CategoryKeyReferenceImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}