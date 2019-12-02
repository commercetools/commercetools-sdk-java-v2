package com.commercetools.api.generated.models.store;

import com.commercetools.api.generated.models.common.LocalizedString;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreDraftImpl implements StoreDraft {

   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private String key;

   @JsonCreator
   StoreDraftImpl(@JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("key") final String key) {
      this.name = name;
      this.key = key;
   }
   public StoreDraftImpl() {
      
   }
   
   /**
   *  <p>The name of the store</p>
   */
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>User-specific unique identifier for the store.
   *  The <code>key</code> is mandatory and immutable.
   *  It is used to reference the store.</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}