package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.review.ReviewDraftImpl;

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
@JsonDeserialize(as = ReviewDraftImpl.class)
public interface ReviewDraft  {

   
   
   @JsonProperty("key")
   public String getKey();
   
   
   @JsonProperty("uniquenessValue")
   public String getUniquenessValue();
   
   
   @JsonProperty("locale")
   public String getLocale();
   
   
   @JsonProperty("authorName")
   public String getAuthorName();
   
   
   @JsonProperty("title")
   public String getTitle();
   
   
   @JsonProperty("text")
   public String getText();
   
   @Valid
   @JsonProperty("target")
   public ResourceIdentifier getTarget();
   
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();
   
   
   @JsonProperty("rating")
   public Integer getRating();
   
   @Valid
   @JsonProperty("customer")
   public CustomerResourceIdentifier getCustomer();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();

   public void setKey(final String key);
   
   public void setUniquenessValue(final String uniquenessValue);
   
   public void setLocale(final String locale);
   
   public void setAuthorName(final String authorName);
   
   public void setTitle(final String title);
   
   public void setText(final String text);
   
   public void setTarget(final ResourceIdentifier target);
   
   public void setState(final StateResourceIdentifier state);
   
   public void setRating(final Integer rating);
   
   public void setCustomer(final CustomerResourceIdentifier customer);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public static ReviewDraftImpl of(){
      return new ReviewDraftImpl();
   }
   

   public static ReviewDraftImpl of(final ReviewDraft template) {
      ReviewDraftImpl instance = new ReviewDraftImpl();
      instance.setUniquenessValue(template.getUniquenessValue());
      instance.setAuthorName(template.getAuthorName());
      instance.setCustom(template.getCustom());
      instance.setRating(template.getRating());
      instance.setState(template.getState());
      instance.setText(template.getText());
      instance.setTitle(template.getTitle());
      instance.setLocale(template.getLocale());
      instance.setKey(template.getKey());
      instance.setCustomer(template.getCustomer());
      instance.setTarget(template.getTarget());
      return instance;
   }

}