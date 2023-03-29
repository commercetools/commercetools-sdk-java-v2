
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type represents an attribute whose value is a set of strings.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextSetAttribute textSetAttribute = TextSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TextSetAttributeImpl.class)
public interface TextSetAttribute extends Attribute {

    /**
     * discriminator value for TextSetAttribute
     */
    String TEXT_SET = "text-set";

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
     * @return instance of TextSetAttribute
     */
    public static TextSetAttribute of() {
        return new TextSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy TextSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static TextSetAttribute of(final TextSetAttribute template) {
        TextSetAttributeImpl instance = new TextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of TextSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TextSetAttribute deepCopy(@Nullable final TextSetAttribute template) {
        if (template == null) {
            return null;
        }
        TextSetAttributeImpl instance = new TextSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for TextSetAttribute
     * @return builder
     */
    public static TextSetAttributeBuilder builder() {
        return TextSetAttributeBuilder.of();
    }

    /**
     * create builder for TextSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextSetAttributeBuilder builder(final TextSetAttribute template) {
        return TextSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTextSetAttribute(Function<TextSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TextSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TextSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<TextSetAttribute>";
            }
        };
    }
}
