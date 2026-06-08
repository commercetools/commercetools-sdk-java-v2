
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
 *  <p>This type represents an attribute whose value is either "true" or "false".</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanAttribute booleanAttribute = BooleanAttribute.builder()
 *             .value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("boolean")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BooleanAttributeImpl.class)
public interface BooleanAttribute extends Attribute {

    /**
     * discriminator value for BooleanAttribute
     */
    String BOOLEAN = "boolean";

    /**
     *  <p><code>true</code> or <code>false</code></p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Boolean getValue();

    /**
     *  <p><code>true</code> or <code>false</code></p>
     * @param value value to be set
     */

    public void setValue(final Boolean value);

    /**
     * factory method
     * @return instance of BooleanAttribute
     */
    public static BooleanAttribute of() {
        return new BooleanAttributeImpl();
    }

    /**
     * factory method to create a shallow copy BooleanAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static BooleanAttribute of(final BooleanAttribute template) {
        BooleanAttributeImpl instance = new BooleanAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public BooleanAttribute copyDeep();

    /**
     * factory method to create a deep copy of BooleanAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BooleanAttribute deepCopy(@Nullable final BooleanAttribute template) {
        if (template == null) {
            return null;
        }
        BooleanAttributeImpl instance = new BooleanAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for BooleanAttribute
     * @return builder
     */
    public static BooleanAttributeBuilder builder() {
        return BooleanAttributeBuilder.of();
    }

    /**
     * create builder for BooleanAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BooleanAttributeBuilder builder(final BooleanAttribute template) {
        return BooleanAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBooleanAttribute(Function<BooleanAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BooleanAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BooleanAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<BooleanAttribute>";
            }
        };
    }
}
