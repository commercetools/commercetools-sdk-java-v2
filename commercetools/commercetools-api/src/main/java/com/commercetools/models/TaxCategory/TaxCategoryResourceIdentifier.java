package com.commercetools.models.TaxCategory;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifierImpl;

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
@JsonDeserialize(as = TaxCategoryResourceIdentifierImpl.class)
public interface TaxCategoryResourceIdentifier extends ResourceIdentifier {


   
   public static TaxCategoryResourceIdentifierImpl of(){
      return new TaxCategoryResourceIdentifierImpl();
   }
   

   public static TaxCategoryResourceIdentifierImpl of(final TaxCategoryResourceIdentifier template) {
      TaxCategoryResourceIdentifierImpl instance = new TaxCategoryResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}