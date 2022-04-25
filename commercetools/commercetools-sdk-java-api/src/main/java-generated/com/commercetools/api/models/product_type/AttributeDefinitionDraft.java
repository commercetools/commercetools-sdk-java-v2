
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionDraftImpl.class)
public interface AttributeDefinitionDraft {

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
    *  When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types.</p>
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
    *  only relevant for text-based attribute types like TextType and LocalizableTextType.</p>
    */

    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
    *  <p>Whether the attribute's values should generally be enabled in product search.
    *  This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries.
    *  The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there.</p>
    */

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

    public static AttributeDefinitionDraft of() {
        return new AttributeDefinitionDraftImpl();
    }

    public static AttributeDefinitionDraft of(final AttributeDefinitionDraft template) {
        AttributeDefinitionDraftImpl instance = new AttributeDefinitionDraftImpl();
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

    public static AttributeDefinitionDraftBuilder builder() {
        return AttributeDefinitionDraftBuilder.of();
    }

    public static AttributeDefinitionDraftBuilder builder(final AttributeDefinitionDraft template) {
        return AttributeDefinitionDraftBuilder.of(template);
    }

    default <T> T withAttributeDefinitionDraft(Function<AttributeDefinitionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinitionDraft>";
            }
        };
    }
}
