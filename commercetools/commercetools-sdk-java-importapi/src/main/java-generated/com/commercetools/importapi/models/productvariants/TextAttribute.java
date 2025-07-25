
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
 *  <p>This type represents an attribute whose value is a string.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextAttribute textAttribute = TextAttribute.builder()
 *             .value("{value}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("text")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TextAttributeImpl.class)
public interface TextAttribute extends Attribute {

    /**
     * discriminator value for TextAttribute
     */
    String TEXT = "text";

    /**
     *  <p>A text value.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *  <p>A text value.</p>
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     * factory method
     * @return instance of TextAttribute
     */
    public static TextAttribute of() {
        return new TextAttributeImpl();
    }

    /**
     * factory method to create a shallow copy TextAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static TextAttribute of(final TextAttribute template) {
        TextAttributeImpl instance = new TextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public TextAttribute copyDeep();

    /**
     * factory method to create a deep copy of TextAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TextAttribute deepCopy(@Nullable final TextAttribute template) {
        if (template == null) {
            return null;
        }
        TextAttributeImpl instance = new TextAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for TextAttribute
     * @return builder
     */
    public static TextAttributeBuilder builder() {
        return TextAttributeBuilder.of();
    }

    /**
     * create builder for TextAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextAttributeBuilder builder(final TextAttribute template) {
        return TextAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTextAttribute(Function<TextAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TextAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TextAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<TextAttribute>";
            }
        };
    }
}
