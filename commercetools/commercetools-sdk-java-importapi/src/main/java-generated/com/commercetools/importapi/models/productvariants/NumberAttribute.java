
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
 *  <p>This type represents an attribute whose value is a number.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberAttribute numberAttribute = NumberAttribute.builder()
 *             .value(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("number")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NumberAttributeImpl.class)
public interface NumberAttribute extends Attribute {

    /**
     * discriminator value for NumberAttribute
     */
    String NUMBER = "number";

    /**
     *  <p>A number value. Can be an integer or a floating-point number.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Double getValue();

    /**
     *  <p>A number value. Can be an integer or a floating-point number.</p>
     * @param value value to be set
     */

    public void setValue(final Double value);

    /**
     * factory method
     * @return instance of NumberAttribute
     */
    public static NumberAttribute of() {
        return new NumberAttributeImpl();
    }

    /**
     * factory method to create a shallow copy NumberAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static NumberAttribute of(final NumberAttribute template) {
        NumberAttributeImpl instance = new NumberAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public NumberAttribute copyDeep();

    /**
     * factory method to create a deep copy of NumberAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NumberAttribute deepCopy(@Nullable final NumberAttribute template) {
        if (template == null) {
            return null;
        }
        NumberAttributeImpl instance = new NumberAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for NumberAttribute
     * @return builder
     */
    public static NumberAttributeBuilder builder() {
        return NumberAttributeBuilder.of();
    }

    /**
     * create builder for NumberAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NumberAttributeBuilder builder(final NumberAttribute template) {
        return NumberAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNumberAttribute(Function<NumberAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NumberAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NumberAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<NumberAttribute>";
            }
        };
    }
}
