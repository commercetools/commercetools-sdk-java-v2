package com.commercetools.api.generated.models.me;


import com.commercetools.api.generated.models.me.MyOrderFromCartDraftImpl;

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
@JsonDeserialize(as = MyOrderFromCartDraftImpl.class)
public interface MyOrderFromCartDraft  {

   /**
   	<p>The unique ID of the cart from which an order is created.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public static MyOrderFromCartDraftImpl of(){
      return new MyOrderFromCartDraftImpl();
   }
   

   public static MyOrderFromCartDraftImpl of(final MyOrderFromCartDraft template) {
      MyOrderFromCartDraftImpl instance = new MyOrderFromCartDraftImpl();
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      return instance;
   }

}