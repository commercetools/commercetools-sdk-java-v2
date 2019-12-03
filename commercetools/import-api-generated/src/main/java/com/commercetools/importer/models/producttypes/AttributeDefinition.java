package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.producttypes.AttributeConstraintEnum;
import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.TextInputHint;
import com.commercetools.importer.models.producttypes.AttributeDefinitionImpl;

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
@JsonDeserialize(as = AttributeDefinitionImpl.class)
public interface AttributeDefinition  {

   
   @NotNull
   @Valid
   @JsonProperty("type")
   public AttributeType getType();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();
   
   @NotNull
   @JsonProperty("isRequired")
   public Boolean getIsRequired();
   
   
   @JsonProperty("attributeConstraint")
   public AttributeConstraintEnum getAttributeConstraint();
   
   @Valid
   @JsonProperty("inputTip")
   public LocalizedString getInputTip();
   
   
   @JsonProperty("inputHint")
   public TextInputHint getInputHint();
   
   
   @JsonProperty("isSearchable")
   public Boolean getIsSearchable();

   public void setType(final AttributeType type);
   
   public void setName(final String name);
   
   public void setLabel(final LocalizedString label);
   
   public void setIsRequired(final Boolean isRequired);
   
   public void setAttributeConstraint(final AttributeConstraintEnum attributeConstraint);
   
   public void setInputTip(final LocalizedString inputTip);
   
   public void setInputHint(final TextInputHint inputHint);
   
   public void setIsSearchable(final Boolean isSearchable);
   
   public static AttributeDefinitionImpl of(){
      return new AttributeDefinitionImpl();
   }
   

   public static AttributeDefinitionImpl of(final AttributeDefinition template) {
      AttributeDefinitionImpl instance = new AttributeDefinitionImpl();
      instance.setIsRequired(template.getIsRequired());
      instance.setAttributeConstraint(template.getAttributeConstraint());
      instance.setName(template.getName());
      instance.setInputHint(template.getInputHint());
      instance.setIsSearchable(template.getIsSearchable());
      instance.setLabel(template.getLabel());
      instance.setType(template.getType());
      instance.setInputTip(template.getInputTip());
      return instance;
   }

}