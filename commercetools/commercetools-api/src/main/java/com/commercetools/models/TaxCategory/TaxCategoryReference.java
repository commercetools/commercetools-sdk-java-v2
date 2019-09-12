package com.commercetools.models.TaxCategory;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.TaxCategory.TaxCategory;
import com.commercetools.models.TaxCategory.TaxCategoryReferenceImpl;

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
@JsonDeserialize(as = TaxCategoryReferenceImpl.class)
public interface TaxCategoryReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public TaxCategory getObj();

   public void setObj(final TaxCategory obj);
   
   public static TaxCategoryReferenceImpl of(){
      return new TaxCategoryReferenceImpl();
   }
   

   public static TaxCategoryReferenceImpl of(final TaxCategoryReference template) {
      TaxCategoryReferenceImpl instance = new TaxCategoryReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}