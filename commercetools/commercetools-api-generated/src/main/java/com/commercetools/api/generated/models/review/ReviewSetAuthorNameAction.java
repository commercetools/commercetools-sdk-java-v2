package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.ReviewUpdateAction;
import com.commercetools.api.generated.models.review.ReviewSetAuthorNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = ReviewSetAuthorNameActionImpl.class)
public interface ReviewSetAuthorNameAction extends ReviewUpdateAction {

   /**
   *  <p>If <code>authorName</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   
   @JsonProperty("authorName")
   public String getAuthorName();

   public void setAuthorName(final String authorName);
   
   public static ReviewSetAuthorNameActionImpl of(){
      return new ReviewSetAuthorNameActionImpl();
   }
   

   public static ReviewSetAuthorNameActionImpl of(final ReviewSetAuthorNameAction template) {
      ReviewSetAuthorNameActionImpl instance = new ReviewSetAuthorNameActionImpl();
      instance.setAuthorName(template.getAuthorName());
      return instance;
   }

}