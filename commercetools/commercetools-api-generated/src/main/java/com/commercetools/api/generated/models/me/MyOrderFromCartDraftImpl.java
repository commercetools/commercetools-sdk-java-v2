package com.commercetools.api.generated.models.me;


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
public final class MyOrderFromCartDraftImpl implements MyOrderFromCartDraft {

   private String id;
   
   private Long version;

   @JsonCreator
   MyOrderFromCartDraftImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version) {
      this.id = id;
      this.version = version;
   }
   public MyOrderFromCartDraftImpl() {
      
   }
   
   /**
   *  <p>The unique ID of the cart from which an order is created.</p>
   */
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}