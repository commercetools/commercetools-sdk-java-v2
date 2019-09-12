package com.commercetools.models.Review;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Review.ReviewImpl;

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
@JsonDeserialize(as = ReviewImpl.class)
public interface Review extends LoggedResource {

   
   
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
   
   
   @JsonProperty("target")
   public Object getTarget();
   
   @NotNull
   @JsonProperty("includedInStatistics")
   public Boolean getIncludedInStatistics();
   
   
   @JsonProperty("rating")
   public Integer getRating();
   
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setKey(final String key);
   
   public void setUniquenessValue(final String uniquenessValue);
   
   public void setLocale(final String locale);
   
   public void setAuthorName(final String authorName);
   
   public void setTitle(final String title);
   
   public void setText(final String text);
   
   public void setTarget(final Object target);
   
   public void setIncludedInStatistics(final Boolean includedInStatistics);
   
   public void setRating(final Integer rating);
   
   public void setState(final StateReference state);
   
   public void setCustomer(final CustomerReference customer);
   
   public void setCustom(final CustomFields custom);
   
   public static ReviewImpl of(){
      return new ReviewImpl();
   }
   

   public static ReviewImpl of(final Review template) {
      ReviewImpl instance = new ReviewImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setIncludedInStatistics(template.getIncludedInStatistics());
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