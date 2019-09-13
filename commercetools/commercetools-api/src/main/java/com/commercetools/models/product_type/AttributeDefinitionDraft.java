package com.commercetools.models.product_type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_type.AttributeConstraintEnum;
import com.commercetools.models.product_type.AttributeType;
import com.commercetools.models.product_type.TextInputHint;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product_type.AttributeDefinitionDraftImpl;

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
@JsonDeserialize(as = AttributeDefinitionDraftImpl.class)
public interface AttributeDefinitionDraft  {

   
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
   
   public static AttributeDefinitionDraftImpl of(){
      return new AttributeDefinitionDraftImpl();
   }
   

   public static AttributeDefinitionDraftImpl of(final AttributeDefinitionDraft template) {
      AttributeDefinitionDraftImpl instance = new AttributeDefinitionDraftImpl();
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