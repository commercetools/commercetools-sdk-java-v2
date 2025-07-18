
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a localized text.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LocalizableTextAttribute localizableTextAttribute = LocalizableTextAttribute.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ltext")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizableTextAttributeImpl.class)
public interface LocalizableTextAttribute extends Attribute {

    /**
     * discriminator value for LocalizableTextAttribute
     */
    String LTEXT = "ltext";

    /**
     *  <p>A localized string.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public LocalizedString getValue();

    /**
     *  <p>A localized string.</p>
     * @param value value to be set
     */

    public void setValue(final LocalizedString value);

    /**
     * factory method
     * @return instance of LocalizableTextAttribute
     */
    public static LocalizableTextAttribute of() {
        return new LocalizableTextAttributeImpl();
    }

    /**
     * factory method to create a shallow copy LocalizableTextAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizableTextAttribute of(final LocalizableTextAttribute template) {
        LocalizableTextAttributeImpl instance = new LocalizableTextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public LocalizableTextAttribute copyDeep();

    /**
     * factory method to create a deep copy of LocalizableTextAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizableTextAttribute deepCopy(@Nullable final LocalizableTextAttribute template) {
        if (template == null) {
            return null;
        }
        LocalizableTextAttributeImpl instance = new LocalizableTextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for LocalizableTextAttribute
     * @return builder
     */
    public static LocalizableTextAttributeBuilder builder() {
        return LocalizableTextAttributeBuilder.of();
    }

    /**
     * create builder for LocalizableTextAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableTextAttributeBuilder builder(final LocalizableTextAttribute template) {
        return LocalizableTextAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizableTextAttribute(Function<LocalizableTextAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizableTextAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizableTextAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizableTextAttribute>";
            }
        };
    }
}
