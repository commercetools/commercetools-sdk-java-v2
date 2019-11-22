package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.product_type.AttributeDefinition;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.product_type.ProductTypeImpl;

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
@JsonDeserialize(as = ProductTypeImpl.class)
public interface ProductType extends LoggedResource {

   /**
   	<p>The unique ID of the product type.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   	<p>The current version of the product type.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   /**
   	
   */
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   /**
   	
   */
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   	<p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   	<p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   	<p>User-specific unique identifier for the product type (max.
   	256 characters).</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   /**
   	
   */
   @NotNull
   @JsonProperty("name")
   public String getName();
   /**
   	
   */
   @NotNull
   @JsonProperty("description")
   public String getDescription();
   /**
   	
   */
   @Valid
   @JsonProperty("attributes")
   public List<AttributeDefinition> getAttributes();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public void setKey(final String key);
   
   public void setName(final String name);
   
   public void setDescription(final String description);
   
   public void setAttributes(final List<AttributeDefinition> attributes);
   
   public static ProductTypeImpl of(){
      return new ProductTypeImpl();
   }
   

   public static ProductTypeImpl of(final ProductType template) {
      ProductTypeImpl instance = new ProductTypeImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setAttributes(template.getAttributes());
      instance.setKey(template.getKey());
      return instance;
   }

}