
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
 *  <p>This type represents an attribute whose value is a localized enum. The attribute value refers to the key of the enum value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableEnumAttribute localizableEnumAttribute = LocalizableEnumAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizableEnumAttributeImpl.class)
public interface LocalizableEnumAttribute extends Attribute {

    /**
     * discriminator value for LocalizableEnumAttribute
     */
    String LENUM = "lenum";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     * factory method
     * @return instance of LocalizableEnumAttribute
     */
    public static LocalizableEnumAttribute of() {
        return new LocalizableEnumAttributeImpl();
    }

    /**
     * factory method to create a shallow copy LocalizableEnumAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizableEnumAttribute of(final LocalizableEnumAttribute template) {
        LocalizableEnumAttributeImpl instance = new LocalizableEnumAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of LocalizableEnumAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizableEnumAttribute deepCopy(@Nullable final LocalizableEnumAttribute template) {
        if (template == null) {
            return null;
        }
        LocalizableEnumAttributeImpl instance = new LocalizableEnumAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for LocalizableEnumAttribute
     * @return builder
     */
    public static LocalizableEnumAttributeBuilder builder() {
        return LocalizableEnumAttributeBuilder.of();
    }

    /**
     * create builder for LocalizableEnumAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableEnumAttributeBuilder builder(final LocalizableEnumAttribute template) {
        return LocalizableEnumAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizableEnumAttribute(Function<LocalizableEnumAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizableEnumAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizableEnumAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizableEnumAttribute>";
            }
        };
    }
}
