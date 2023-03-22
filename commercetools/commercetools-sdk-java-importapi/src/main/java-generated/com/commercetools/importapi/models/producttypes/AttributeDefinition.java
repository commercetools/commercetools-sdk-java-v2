
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.LocalizedString;
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
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *
     * @return isRequired
     */
    @NotNull
    @JsonProperty("isRequired")
    public Boolean getIsRequired();

    /**
     *
     * @return attributeConstraint
     */

    @JsonProperty("attributeConstraint")
    public AttributeConstraintEnum getAttributeConstraint();

    /**
     *  <p>A localized string is a JSON object where the keys are of IETF language tag, and the values the corresponding strings used for that language.</p>
     *  <pre><code>{
     *    "de": "Hundefutter",
     *    "en": "dog food"
     *  }
     *  </code></pre>
     * @return inputTip
     */
    @Valid
    @JsonProperty("inputTip")
    public LocalizedString getInputTip();

    /**
     *
     * @return inputHint
     */

    @JsonProperty("inputHint")
    public TextInputHint getInputHint();

    /**
     *
     * @return isSearchable
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

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeDefinition> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeDefinition>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeDefinition>";
            }
        };
    }
}
