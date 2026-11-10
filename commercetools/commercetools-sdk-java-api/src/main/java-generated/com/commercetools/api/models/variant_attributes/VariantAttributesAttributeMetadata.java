
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Metadata about a requested <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">Attribute</a>, derived from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAttributesAttributeMetadata variantAttributesAttributeMetadata = VariantAttributesAttributeMetadata.builder()
 *             .name("{name}")
 *             .label(labelBuilder -> labelBuilder)
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantAttributesAttributeMetadataImpl.class)
public interface VariantAttributesAttributeMetadata {

    /**
     *  <p>Name of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Localized label of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Subject to <span>locale projection</span> if <code>localeProjection</code> is specified.</p>
     * @return label
     */
    @NotNull
    @Valid
    @JsonProperty("label")
    public LocalizedString getLabel();

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>, for example <code>boolean</code>, <code>text</code>, <code>ltext</code>, <code>enum</code>, <code>lenum</code>, <code>number</code>, <code>money</code>, <code>date</code>, <code>time</code>, <code>datetime</code>, <code>reference</code>, <code>set</code>, or <code>nested</code>.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Name of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Localized label of the Attribute as defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>. Subject to <span>locale projection</span> if <code>localeProjection</code> is specified.</p>
     * @param label value to be set
     */

    public void setLabel(final LocalizedString label);

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeType" rel="nofollow">AttributeType</a>, for example <code>boolean</code>, <code>text</code>, <code>ltext</code>, <code>enum</code>, <code>lenum</code>, <code>number</code>, <code>money</code>, <code>date</code>, <code>time</code>, <code>datetime</code>, <code>reference</code>, <code>set</code>, or <code>nested</code>.</p>
     * @param type value to be set
     */

    public void setType(final String type);

    /**
     * factory method
     * @return instance of VariantAttributesAttributeMetadata
     */
    public static VariantAttributesAttributeMetadata of() {
        return new VariantAttributesAttributeMetadataImpl();
    }

    /**
     * factory method to create a shallow copy VariantAttributesAttributeMetadata
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantAttributesAttributeMetadata of(final VariantAttributesAttributeMetadata template) {
        VariantAttributesAttributeMetadataImpl instance = new VariantAttributesAttributeMetadataImpl();
        instance.setName(template.getName());
        instance.setLabel(template.getLabel());
        instance.setType(template.getType());
        return instance;
    }

    public VariantAttributesAttributeMetadata copyDeep();

    /**
     * factory method to create a deep copy of VariantAttributesAttributeMetadata
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantAttributesAttributeMetadata deepCopy(
            @Nullable final VariantAttributesAttributeMetadata template) {
        if (template == null) {
            return null;
        }
        VariantAttributesAttributeMetadataImpl instance = new VariantAttributesAttributeMetadataImpl();
        instance.setName(template.getName());
        instance.setLabel(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getLabel()));
        instance.setType(template.getType());
        return instance;
    }

    /**
     * builder factory method for VariantAttributesAttributeMetadata
     * @return builder
     */
    public static VariantAttributesAttributeMetadataBuilder builder() {
        return VariantAttributesAttributeMetadataBuilder.of();
    }

    /**
     * create builder for VariantAttributesAttributeMetadata instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAttributesAttributeMetadataBuilder builder(final VariantAttributesAttributeMetadata template) {
        return VariantAttributesAttributeMetadataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantAttributesAttributeMetadata(Function<VariantAttributesAttributeMetadata, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantAttributesAttributeMetadata> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantAttributesAttributeMetadata>() {
            @Override
            public String toString() {
                return "TypeReference<VariantAttributesAttributeMetadata>";
            }
        };
    }
}
