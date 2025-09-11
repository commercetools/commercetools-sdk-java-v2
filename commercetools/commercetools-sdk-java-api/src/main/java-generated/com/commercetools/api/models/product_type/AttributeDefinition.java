
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
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
 *             .level(AttributeLevelEnum.PRODUCT)
 *             .attributeConstraint(AttributeConstraintEnum.NONE)
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
     *  <p>Describes the Type of the Attribute.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public AttributeType getType();

    /**
     *  <p>User-defined name of the Attribute that is unique within the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
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
     *  <p>If <code>true</code>, the Attribute must have a value on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return isRequired
     */
    @NotNull
    @JsonProperty("isRequired")
    public Boolean getIsRequired();

    /**
     *  <p>Specifies whether the Attribute is defined at the Product or Variant level.</p>
     * @return level
     */
    @NotNull
    @JsonProperty("level")
    public AttributeLevelEnum getLevel();

    /**
     *  <p>Specifies how Attributes are validated across all variants of a Product.</p>
     * @return attributeConstraint
     */
    @NotNull
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
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeTextType" rel="nofollow">AttributeTextType</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">AttributeLocalizableTextType</a>).</p>
     * @return inputHint
     */
    @NotNull
    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the <span>Product Search</span> or the <span>Product Projection Search</span> API for use in full-text search queries, filters, and facets. However, if an Attribute's <code>level</code> is set as <code>Product</code>, then Product Projection Search does <strong>not support</strong> the Attribute.</p>
     *  <p>The exact features that are available with this flag depend on the specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>. The maximum size of a searchable field is <strong>restricted</strong> by the <span>Field content size limit</span>. This constraint is enforced at both <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/products:POST" rel="nofollow">Product creation</a> and <span>Product update</span>. If the length of the input exceeds the maximum size, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @return isSearchable
     */
    @NotNull
    @JsonProperty("isSearchable")
    public Boolean getIsSearchable();

    /**
     *  <p>Describes the Type of the Attribute.</p>
     * @param type value to be set
     */

    public void setType(final AttributeType type);

    /**
     *  <p>User-defined name of the Attribute that is unique within the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     *  <p>If <code>true</code>, the Attribute must have a value on a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param isRequired value to be set
     */

    public void setIsRequired(final Boolean isRequired);

    /**
     *  <p>Specifies whether the Attribute is defined at the Product or Variant level.</p>
     * @param level value to be set
     */

    public void setLevel(final AttributeLevelEnum level);

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
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeTextType" rel="nofollow">AttributeTextType</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">AttributeLocalizableTextType</a>).</p>
     * @param inputHint value to be set
     */

    public void setInputHint(final TextInputHint inputHint);

    /**
     *  <p>If <code>true</code>, the Attribute's values are available in the <span>Product Search</span> or the <span>Product Projection Search</span> API for use in full-text search queries, filters, and facets. However, if an Attribute's <code>level</code> is set as <code>Product</code>, then Product Projection Search does <strong>not support</strong> the Attribute.</p>
     *  <p>The exact features that are available with this flag depend on the specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>. The maximum size of a searchable field is <strong>restricted</strong> by the <span>Field content size limit</span>. This constraint is enforced at both <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/products:POST" rel="nofollow">Product creation</a> and <span>Product update</span>. If the length of the input exceeds the maximum size, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
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
        instance.setLevel(template.getLevel());
        instance.setAttributeConstraint(template.getAttributeConstraint());
        instance.setInputTip(template.getInputTip());
        instance.setInputHint(template.getInputHint());
        instance.setIsSearchable(template.getIsSearchable());
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
        instance.setType(com.commercetools.api.models.product_type.AttributeType.deepCopy(template.getType()));
        instance.setName(template.getName());
        instance.setLabel(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLabel()));
        instance.setIsRequired(template.getIsRequired());
        instance.setLevel(template.getLevel());
        instance.setAttributeConstraint(template.getAttributeConstraint());
        instance.setInputTip(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getInputTip()));
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
