package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.common.TaxCategoryKeyReferenceImpl;

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
*  <p>References a tax category by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryKeyReferenceImpl.class)
public interface TaxCategoryKeyReference extends KeyReference {


   
   public static TaxCategoryKeyReferenceImpl of(){
      return new TaxCategoryKeyReferenceImpl();
   }
   

   public static TaxCategoryKeyReferenceImpl of(final TaxCategoryKeyReference template) {
      TaxCategoryKeyReferenceImpl instance = new TaxCategoryKeyReferenceImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}