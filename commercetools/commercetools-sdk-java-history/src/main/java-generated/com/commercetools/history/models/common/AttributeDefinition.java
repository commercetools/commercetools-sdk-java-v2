
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionImpl.class)
public interface AttributeDefinition {

    @NotNull
    @Valid
    @JsonProperty("type")
    public Object getType();

    /**
    *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

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

    @NotNull
    @JsonProperty("attributeConstraint")
    public AttributeConstraintEnum getAttributeConstraint();

    @NotNull
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    @NotNull
    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
    *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries  and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there. The max size of a searchable field is <strong>restricted to 10922 characters</strong>. This constraint is enforced at both product creation and product update. If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
    */
    @NotNull
    @JsonProperty("isSearchable")
    public Boolean getIsSearchable();

    public void setType(final Object type);

    public void setName(final String name);

    public void setLabel(final LocalizedString label);

    public void setIsRequired(final Boolean isRequired);

    public void setAttributeConstraint(final AttributeConstraintEnum attributeConstraint);

    public void setInputTip(final LocalizedString inputTip);

    public void setInputHint(final TextInputHint inputHint);

    public void setIsSearchable(final Boolean isSearchable);

    public static AttributeDefinition of() {
        return new AttributeDefinitionImpl();
    }

    public static AttributeDefinition of(final AttributeDefinition template) {
        AttributeDefinitionImpl instance = new AttributeDefinitionImpl();
        instance.setType(template.getType());
        instance.setName(template.getName());
        instance.setLabel(template.getLabel());
        instance.setIsRequired(template.getIsRequired());
        instance.setAttributeConstraint(template.getAttributeConstraint());
        instance.setInputTip(template.getInputTip());
        instance.setInputHint(template.getInputHint());
        instance.setIsSearchable(template.getIsSearchable());
        return instance;
    }

    public static AttributeDefinitionBuilder builder() {
        return AttributeDefinitionBuilder.of();
    }

    public static AttributeDefinitionBuilder builder(final AttributeDefinition template) {
        return AttributeDefinitionBuilder.of(template);
    }

    default <T> T withAttributeDefinition(Function<AttributeDefinition, T> helper) {
        return helper.apply(this);
    }
}
