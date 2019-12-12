package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product_type.AttributeConstraintEnum;
import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.TextInputHint;
import com.commercetools.api.generated.models.product_type.AttributeDefinitionImpl;

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

   /**
   *  <p>Describes the type of the attribute.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("type")
   public AttributeType getType();
   /**
   *  <p>The unique name of the attribute used in the API.
   *  The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>).
   *  When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned.
   *  An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
   */
   @NotNull
   @JsonProperty("name")
   public String getName();
   /**
   *  <p>A human-readable label for the attribute.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();
   /**
   *  <p>Whether the attribute is required to have a value.</p>
   */
   @NotNull
   @JsonProperty("isRequired")
   public Boolean getIsRequired();
   /**
   *  <p>Describes how an attribute or a set of attributes should be validated across all variants of a product.</p>
   */
   @NotNull
   @JsonProperty("attributeConstraint")
   public AttributeConstraintEnum getAttributeConstraint();
   /**
   *  <p>Additional information about the attribute that aids content managers when setting product details.</p>
   */
   @Valid
   @JsonProperty("inputTip")
   public LocalizedString getInputTip();
   /**
   *  <p>Provides a visual representation type for this attribute.
   *  only relevant for text-based attribute types
   *  like TextType and LocalizableTextType.</p>
   */
   @NotNull
   @JsonProperty("inputHint")
   public TextInputHint getInputHint();
   /**
   *  <p>Whether the attribute's values should generally be enabled in product search.
   *  This determines whether the value is stored in products for matching terms in the context of full-text search queries  and can be used in facets &amp; filters as part of product search queries.
   *  The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there.
   *  The max size of a searchable field is <strong>restricted to 10922 characters</strong>.
   *  This constraint is enforced at both product creation and product update.
   *  If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
   */
   @NotNull
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