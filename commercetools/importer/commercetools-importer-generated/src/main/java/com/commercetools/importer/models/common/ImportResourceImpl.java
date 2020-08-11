package com.commercetools.importer.models.common;

import com.commercetools.importer.models.categories.CategoryImport;
import com.commercetools.importer.models.prices.PriceImport;
import com.commercetools.importer.models.productdrafts.ProductDraftImport;
import com.commercetools.importer.models.products.ProductImport;
import com.commercetools.importer.models.producttypes.ProductTypeImport;
import com.commercetools.importer.models.productvariants.ProductVariantImport;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>A representation of the resource to import.
*  Import resources are similar to commercetools draft types, but they only support key references.
*  In general, import resources are more granular then the normal commercetools resource.
*  They are optimized for incremental updates and therefore have a slightly different structure.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportResourceImpl implements ImportResource {

   private String key;

   @JsonCreator
   ImportResourceImpl(@JsonProperty("key") final String key) {
      this.key = key;
   }
   public ImportResourceImpl() {
      
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setKey(final String key){
      this.key = key;
   }

}