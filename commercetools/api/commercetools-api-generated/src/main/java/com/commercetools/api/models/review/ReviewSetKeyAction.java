package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetKeyActionImpl;

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
@JsonDeserialize(as = ReviewSetKeyActionImpl.class)
public interface ReviewSetKeyAction extends ReviewUpdateAction {

   /**
   *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ReviewSetKeyActionImpl of(){
      return new ReviewSetKeyActionImpl();
   }
   

   public static ReviewSetKeyActionImpl of(final ReviewSetKeyAction template) {
      ReviewSetKeyActionImpl instance = new ReviewSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}
