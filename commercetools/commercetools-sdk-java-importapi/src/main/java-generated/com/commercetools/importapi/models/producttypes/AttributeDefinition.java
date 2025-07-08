
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AttributeDefinition
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinition attributeDefinition = AttributeDefinition.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .isRequired(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionImpl.class)
public interface AttributeDefinition {

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public AttributeType getType();

    /**
     *  <p>User-defined name of the Attribute that is unique within the Project.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>If <code>true</code>, the Attribute must have a value on a ProductVariant.</p>
     * @return isRequired
     */
    @NotNull
    @JsonProperty("isRequired")
    public Boolean getIsRequired();

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     * @return attributeConstraint
     */

    @JsonProperty("attributeConstraint")
    public AttributeConstraintEnum getAttributeConstraint();

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @return inputTip
     */
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     * @return inputHint
     */

    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the Product Search or the Product Projection Search API for use in full-text search queries, filters, and facets.</p>
     * @return isSearchable
     */

    @JsonProperty("isSearchable")
    public Boolean getIsSearchable();

    /**
     *
     * @return level
     */

    @JsonProperty("level")
    public AttributeLevel getLevel();

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @param type value to be set
     */

    public void setType(final AttributeType type);

    /**
     *  <p>User-defined name of the Attribute that is unique within the Project.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     *  <p>If <code>true</code>, the Attribute must have a value on a ProductVariant.</p>
     * @param isRequired value to be set
     */

    public void setIsRequired(final Boolean isRequired);

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     * @param attributeConstraint value to be set
     */

    public void setAttributeConstraint(final AttributeConstraintEnum attributeConstraint);

    /**
     *  <p>Provides additional Attribute information to aid content managers configure Product details.</p>
     * @param inputTip value to be set
     */

    public void setInputTip(final LocalizedString inputTip);

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     * @param inputHint value to be set
     */

    public void setInputHint(final TextInputHint inputHint);

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the Product Search or the Product Projection Search API for use in full-text search queries, filters, and facets.</p>
     * @param isSearchable value to be set
     */

    public void setIsSearchable(final Boolean isSearchable);

    /**
     * set level
     * @param level value to be set
     */

    public void setLevel(final AttributeLevel level);

    /**
     * factory method
     * @return instance of AttributeDefinition
     */
    public static AttributeDefinition of() {
        return new AttributeDefinitionImpl();
    }

    /**
     * factory method to create a shallow copy AttributeDefinition
     * @param template instance to be copied
     * @return copy instance
     */
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
        instance.setLevel(template.getLevel());
        return instance;
    }

    public AttributeDefinition copyDeep();

    /**
     * factory method to create a deep copy of AttributeDefinition
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeDefinition deepCopy(@Nullable final AttributeDefinition template) {
        if (template == null) {
            return null;
        }
        AttributeDefinitionImpl instance = new AttributeDefinitionImpl();
        instance.setType(com.commercetools.importapi.models.producttypes.AttributeType.deepCopy(template.getType()));
        instance.setName(template.getName());
        instance.setLabel(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getLabel()));
        instance.setIsRequired(template.getIsRequired());
        instance.setAttributeConstraint(template.getAttributeConstraint());
        instance.setInputTip(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getInputTip()));
        instance.setInputHint(template.getInputHint());
        instance.setIsSearchable(template.getIsSearchable());
        instance.setLevel(template.getLevel());
        return instance;
    }

    /**
     * builder factory method for AttributeDefinition
     * @return builder
     */
    public static AttributeDefinitionBuilder builder() {
        return AttributeDefinitionBuilder.of();
    }

    /**
     * create builder for AttributeDefinition instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDefinitionBuilder builder(final AttributeDefinition template) {
        return AttributeDefinitionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeDefinition(Function<AttributeDefinition, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinition> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinition>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinition>";
            }
        };
    }
}
