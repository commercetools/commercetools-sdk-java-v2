
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This type represents an attribute whose value is a key reference.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceAttribute referenceAttribute = ReferenceAttribute.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferenceAttributeImpl.class)
public interface ReferenceAttribute extends Attribute {

    /**
     * discriminator value for ReferenceAttribute
     */
    String REFERENCE = "reference";

    /**
     *  <p>References a resource by key.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public KeyReference getValue();

    /**
     *  <p>References a resource by key.</p>
     * @param value value to be set
     */

    public void setValue(final KeyReference value);

    /**
     * factory method
     * @return instance of ReferenceAttribute
     */
    public static ReferenceAttribute of() {
        return new ReferenceAttributeImpl();
    }

    /**
     * factory method to create a shallow copy ReferenceAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReferenceAttribute of(final ReferenceAttribute template) {
        ReferenceAttributeImpl instance = new ReferenceAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ReferenceAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReferenceAttribute deepCopy(@Nullable final ReferenceAttribute template) {
        if (template == null) {
            return null;
        }
        ReferenceAttributeImpl instance = new ReferenceAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(com.commercetools.importapi.models.common.KeyReference.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for ReferenceAttribute
     * @return builder
     */
    public static ReferenceAttributeBuilder builder() {
        return ReferenceAttributeBuilder.of();
    }

    /**
     * create builder for ReferenceAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceAttributeBuilder builder(final ReferenceAttribute template) {
        return ReferenceAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReferenceAttribute(Function<ReferenceAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReferenceAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferenceAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<ReferenceAttribute>";
            }
        };
    }
}
