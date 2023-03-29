
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
 *             .attributeConstraint(AttributeConstraintEnum.NONE)
 *             .inputTip(inputTipBuilder -> inputTipBuilder)
 *             .inputHint(TextInputHint.SINGLE_LINE)
 *             .isSearchable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionImpl.class)
public interface AttributeDefinition {

    /**
     *
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public AttributeType getType();

    /**
     *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Whether the attribute is required to have a value.</p>
     * @return isRequired
     */
    @NotNull
    @JsonProperty("isRequired")
    public Boolean getIsRequired();

    /**
     *
     * @return attributeConstraint
     */
    @NotNull
    @JsonProperty("attributeConstraint")
    public AttributeConstraintEnum getAttributeConstraint();

    /**
     *
     * @return inputTip
     */
    @NotNull
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    /**
     *
     * @return inputHint
     */
    @NotNull
    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
     *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there. The max size of a searchable field is <strong>restricted to 10922 characters</strong>. This constraint is enforced at both product creation and product update. If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
     * @return isSearchable
     */
    @NotNull
    @JsonProperty("isSearchable")
    public Boolean getIsSearchable();

    /**
     * set type
     * @param type value to be set
     */

    public void setType(final AttributeType type);

    /**
     *  <p>The unique name of the attribute used in the API. The name must be between two and 256 characters long and can contain the ASCII letters A to Z in lowercase or uppercase, digits, underscores (<code>_</code>) and the hyphen-minus (<code>-</code>). When using the same <code>name</code> for an attribute in two or more product types all fields of the AttributeDefinition of this attribute need to be the same across the product types, otherwise an AttributeDefinitionAlreadyExists error code will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> type and sets thereof.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set label
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     *  <p>Whether the attribute is required to have a value.</p>
     * @param isRequired value to be set
     */

    public void setIsRequired(final Boolean isRequired);

    /**
     * set attributeConstraint
     * @param attributeConstraint value to be set
     */

    public void setAttributeConstraint(final AttributeConstraintEnum attributeConstraint);

    /**
     * set inputTip
     * @param inputTip value to be set
     */

    public void setInputTip(final LocalizedString inputTip);

    /**
     * set inputHint
     * @param inputHint value to be set
     */

    public void setInputHint(final TextInputHint inputHint);

    /**
     *  <p>Whether the attribute's values should generally be enabled in product search. This determines whether the value is stored in products for matching terms in the context of full-text search queries and can be used in facets &amp; filters as part of product search queries. The exact features that are enabled/disabled with this flag depend on the concrete attribute type and are described there. The max size of a searchable field is <strong>restricted to 10922 characters</strong>. This constraint is enforced at both product creation and product update. If the length of the input exceeds the maximum size an InvalidField error is returned.</p>
     * @param isSearchable value to be set
     */

    public void setIsSearchable(final Boolean isSearchable);

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
        return instance;
    }

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
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.history.models.common.AttributeType::deepCopy)
                .orElse(null));
        instance.setName(template.getName());
        instance.setLabel(Optional.ofNullable(template.getLabel())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setIsRequired(template.getIsRequired());
        instance.setAttributeConstraint(template.getAttributeConstraint());
        instance.setInputTip(Optional.ofNullable(template.getInputTip())
                .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                .orElse(null));
        instance.setInputHint(template.getInputHint());
        instance.setIsSearchable(template.getIsSearchable());
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
