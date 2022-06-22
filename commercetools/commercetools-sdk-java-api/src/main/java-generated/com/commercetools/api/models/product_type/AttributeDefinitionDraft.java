
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
public interface AttributeDefinitionDraft {

    /**
     *  <p>Describes the Type of the Attribute.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("type")
    public AttributeType getType();

    /**
     *  <p>User-defined name of the Attribute that is unique with the Project. When using the same <code>name</code> for an Attribute in multiple ProductTypes, all fields of the AttributeDefinition of this Attribute must be the same across the ProductTypes. Otherwise an AttributeDefinitionAlreadyExistsError will be returned. An exception to this are the values of an <code>enum</code> or <code>lenum</code> Type and sets thereof.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Human-readable label for the Attribute.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Set to <code>true</code> if the Attribute is required to have a value on a ProductVariant.</p>
     */
    @NotNull
    @JsonProperty("isRequired")
    public Boolean getIsRequired();

    /**
     *  <p>Specifies how an Attribute or a combination of Attributes should be validated across all variants of a Product.</p>
     */

    @JsonProperty("attributeConstraint")
    public AttributeConstraintEnum getAttributeConstraint();

    /**
     *  <p>Provides additional information about the Attribute that aids content managers when setting Product details.</p>
     */
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    /**
     *  <p>Provides a visual representation directive for values of this Attribute (only relevant for AttributeTextType and AttributeLocalizableTextType).</p>
     */

    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
     *  <p>Set to <code>true</code> if the Attribute's values should be available in the Product Projections Search API and can be used in full-text search queries, filters, and facets. Which exact features are available with this flag depends on the specific AttributeType. The maximum size of a searchable field is <strong>restricted</strong> by the Field content size limit. This constraint is enforced at both Product creation and Product update. If the length of the input exceeds the maximum size, an InvalidField error is returned.</p>
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
