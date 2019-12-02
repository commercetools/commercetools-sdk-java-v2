package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.KeyReference;
import com.commercetools.importer.models.common.ReferenceType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>References a cart discount by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountKeyReferenceImpl implements CartDiscountKeyReference {

   private com.commercetools.importer.models.common.ReferenceType typeId;
   
   private String key;

   @JsonCreator
   CartDiscountKeyReferenceImpl(@JsonProperty("key") final String key) {
      this.key = key;
      this.typeId = ReferenceType.findEnumViaJsonName("cart-discount").get();
   }
   public CartDiscountKeyReferenceImpl() {
      
   }
   
   /**
   *  <p>The type of the referenced resource.</p>
   */
   public com.commercetools.importer.models.common.ReferenceType getTypeId(){
      return this.typeId;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setKey(final String key){
      this.key = key;
   }

}