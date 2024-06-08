
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
 *     LocalizableEnumSetAttribute localizableEnumSetAttribute = LocalizableEnumSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LocalizableEnumSetAttributeImpl.class)
public interface LocalizableEnumSetAttribute extends Attribute {

    /**
     * discriminator value for LocalizableEnumSetAttribute
     */
    String LENUM_SET = "lenum-set";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final String... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<String> value);

    /**
     * factory method
     * @return instance of LocalizableEnumSetAttribute
     */
    public static LocalizableEnumSetAttribute of() {
        return new LocalizableEnumSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy LocalizableEnumSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static LocalizableEnumSetAttribute of(final LocalizableEnumSetAttribute template) {
        LocalizableEnumSetAttributeImpl instance = new LocalizableEnumSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of LocalizableEnumSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LocalizableEnumSetAttribute deepCopy(@Nullable final LocalizableEnumSetAttribute template) {
        if (template == null) {
            return null;
        }
        LocalizableEnumSetAttributeImpl instance = new LocalizableEnumSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for LocalizableEnumSetAttribute
     * @return builder
     */
    public static LocalizableEnumSetAttributeBuilder builder() {
        return LocalizableEnumSetAttributeBuilder.of();
    }

    /**
     * create builder for LocalizableEnumSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LocalizableEnumSetAttributeBuilder builder(final LocalizableEnumSetAttribute template) {
        return LocalizableEnumSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLocalizableEnumSetAttribute(Function<LocalizableEnumSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LocalizableEnumSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizableEnumSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizableEnumSetAttribute>";
            }
        };
    }
}
