package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.customer.CustomerReference;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.review.ReviewImpl;

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
@JsonDeserialize(as = ReviewImpl.class)
public interface Review extends LoggedResource {

   /**
   *  <p>The unique ID of the review.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   *  <p>The current version of the review.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   *  <p>User-specific unique identifier for the review.</p>
   */
   
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
   /**
   *  <p>Identifies the target of the review.
   *  Can be a Product or a Channel</p>
   */
   
   @JsonProperty("target")
   public Object getTarget();
   /**
   *  <p>Indicates if this review is taken into account in the ratings statistics of the target.
   *  A review is per default used in the statistics, unless the review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>.
   *  If the role of a State is modified after the calculation of this field, the calculation is not updated.</p>
   */
   @NotNull
   @JsonProperty("includedInStatistics")
   public Boolean getIncludedInStatistics();
   /**
   *  <p>Number between -100 and 100 included.</p>
   */
   
   @JsonProperty("rating")
   public Integer getRating();
   
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   /**
   *  <p>The customer who created the review.</p>
   */
   @Valid
   @JsonProperty("customer")
   public CustomerReference getCustomer();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
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
      instance.setUniquenessValue(template.getUniquenessValue());
      instance.setCustom(template.getCustom());
      instance.setRating(template.getRating());
      instance.setTitle(template.getTitle());
      instance.setLocale(template.getLocale());
      instance.setTarget(template.getTarget());
      instance.setIncludedInStatistics(template.getIncludedInStatistics());
      instance.setAuthorName(template.getAuthorName());
      instance.setState(template.getState());
      instance.setText(template.getText());
      instance.setKey(template.getKey());
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}