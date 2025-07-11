
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>This type represents an attribute whose value is an enum. The attribute value refers to the key of the enum value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumAttribute enumAttribute = EnumAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("enum")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumAttributeImpl.class)
public interface EnumAttribute extends Attribute {

    /**
     * discriminator value for EnumAttribute
     */
    String ENUM = "enum";

    /**
     *  <p>The key of the enum value. Must match the key of an AttributePlainEnumValue in the Product Type.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>The key of the enum value. Must match the key of an AttributePlainEnumValue in the Product Type.</p>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     * factory method
     * @return instance of EnumAttribute
     */
    public static EnumAttribute of() {
        return new EnumAttributeImpl();
    }

    /**
     * factory method to create a shallow copy EnumAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumAttribute of(final EnumAttribute template) {
        EnumAttributeImpl instance = new EnumAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public EnumAttribute copyDeep();

    /**
     * factory method to create a deep copy of EnumAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumAttribute deepCopy(@Nullable final EnumAttribute template) {
        if (template == null) {
            return null;
        }
        EnumAttributeImpl instance = new EnumAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for EnumAttribute
     * @return builder
     */
    public static EnumAttributeBuilder builder() {
        return EnumAttributeBuilder.of();
    }

    /**
     * create builder for EnumAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumAttributeBuilder builder(final EnumAttribute template) {
        return EnumAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumAttribute(Function<EnumAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<EnumAttribute>";
            }
        };
    }
}
