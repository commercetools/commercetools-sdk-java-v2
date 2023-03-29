
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Specify the Attribute to be created with the ProductTypeDraft.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDefinitionDraft attributeDefinitionDraft = AttributeDefinitionDraft.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .isRequired(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeDefinitionDraftImpl.class)
public interface AttributeDefinitionDraft extends io.vrap.rmf.base.client.Draft<AttributeDefinitionDraft> {

    /**
     *  <p>Describes the Type of the Attribute.</p>
     *  <p>When the <code>type</code> is different for an AttributeDefinition using the same name in multiple ProductTypes, an AttributeDefinitionTypeConflict error is returned.</p>
     * @return type
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public AttributeType getType();

    /**
     *  <p>User-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in multiple ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes, else an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> Type and sets thereof.</p>
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
     *  <p>Set to <code>true</code> if the Attribute is required to have a value on a ProductVariant.</p>
     * @return isRequired
     */
    @NotNull
    @JsonProperty("isRequired")
    public Boolean getIsRequired();

    /**
     *  <p>Specifies how an Attribute or a combination of Attributes should be validated across all variants of a Product.</p>
     * @return attributeConstraint
     */

    @JsonProperty("attributeConstraint")
    public AttributeConstraintEnum getAttributeConstraint();

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
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
     *  <p>Set to <code>true</code> if the Attribute's values should be available in the Product Projections Search API and can be used in full-text search queries, filters, and facets. Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
     * @return isSearchable
     */

    @JsonProperty("isSearchable")
    public Boolean getIsSearchable();

    /**
     *  <p>Describes the Type of the Attribute.</p>
     *  <p>When the <code>type</code> is different for an AttributeDefinition using the same name in multiple ProductTypes, an AttributeDefinitionTypeConflict error is returned.</p>
     * @param type value to be set
     */

    public void setType(final AttributeType type);

    /**
     *  <p>User-defined name of the Attribute that is unique with the Project.</p>
     *  <p>When using the same <code>name</code> for an Attribute in multiple ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes, else an AttributeDefinitionAlreadyExists error is returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> Type and sets thereof.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Human-readable label for the Attribute.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     *  <p>Set to <code>true</code> if the Attribute is required to have a value on a ProductVariant.</p>
     * @param isRequired value to be set
     */

    public void setIsRequired(final Boolean isRequired);

    /**
     *  <p>Specifies how an Attribute or a combination of Attributes should be validated across all variants of a Product.</p>
     * @param attributeConstraint value to be set
     */

    public void setAttributeConstraint(final AttributeConstraintEnum attributeConstraint);

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     * @param inputTip value to be set
     */

    public void setInputTip(final LocalizedString inputTip);

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     * @param inputHint value to be set
     */

    public void setInputHint(final TextInputHint inputHint);

    /**
     *  <p>Set to <code>true</code> if the Attribute's values should be available in the Product Projections Search API and can be used in full-text search queries, filters, and facets. Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
     * @param isSearchable value to be set
     */

    public void setIsSearchable(final Boolean isSearchable);

    /**
     * factory method
     * @return instance of AttributeDefinitionDraft
     */
    public static AttributeDefinitionDraft of() {
        return new AttributeDefinitionDraftImpl();
    }

    /**
     * factory method to create a shallow copy AttributeDefinitionDraft
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of AttributeDefinitionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeDefinitionDraft deepCopy(@Nullable final AttributeDefinitionDraft template) {
        if (template == null) {
            return null;
        }
        AttributeDefinitionDraftImpl instance = new AttributeDefinitionDraftImpl();
        instance.setType(com.commercetools.api.models.product_type.AttributeType.deepCopy(template.getType()));
        instance.setName(template.getName());
        instance.setLabel(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLabel()));
        instance.setIsRequired(template.getIsRequired());
        instance.setAttributeConstraint(template.getAttributeConstraint());
        instance.setInputTip(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getInputTip()));
        instance.setInputHint(template.getInputHint());
        instance.setIsSearchable(template.getIsSearchable());
        return instance;
    }

    /**
     * builder factory method for AttributeDefinitionDraft
     * @return builder
     */
    public static AttributeDefinitionDraftBuilder builder() {
        return AttributeDefinitionDraftBuilder.of();
    }

    /**
     * create builder for AttributeDefinitionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDefinitionDraftBuilder builder(final AttributeDefinitionDraft template) {
        return AttributeDefinitionDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeDefinitionDraft(Function<AttributeDefinitionDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinitionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinitionDraft>";
            }
        };
    }
}
