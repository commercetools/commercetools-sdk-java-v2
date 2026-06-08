
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
 *  <p>This type represents an attribute whose value is set of boolean values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanSetAttribute booleanSetAttribute = BooleanSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("boolean-set")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BooleanSetAttributeImpl.class)
public interface BooleanSetAttribute extends Attribute {

    /**
     * discriminator value for BooleanSetAttribute
     */
    String BOOLEAN_SET = "boolean-set";

    /**
     *  <p>A set of boolean values.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<Boolean> getValue();

    /**
     *  <p>A set of boolean values.</p>
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final Boolean... value);

    /**
     *  <p>A set of boolean values.</p>
     * @param value values to be set
     */

    public void setValue(final List<Boolean> value);

    /**
     * factory method
     * @return instance of BooleanSetAttribute
     */
    public static BooleanSetAttribute of() {
        return new BooleanSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy BooleanSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static BooleanSetAttribute of(final BooleanSetAttribute template) {
        BooleanSetAttributeImpl instance = new BooleanSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public BooleanSetAttribute copyDeep();

    /**
     * factory method to create a deep copy of BooleanSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BooleanSetAttribute deepCopy(@Nullable final BooleanSetAttribute template) {
        if (template == null) {
            return null;
        }
        BooleanSetAttributeImpl instance = new BooleanSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for BooleanSetAttribute
     * @return builder
     */
    public static BooleanSetAttributeBuilder builder() {
        return BooleanSetAttributeBuilder.of();
    }

    /**
     * create builder for BooleanSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BooleanSetAttributeBuilder builder(final BooleanSetAttribute template) {
        return BooleanSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBooleanSetAttribute(Function<BooleanSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BooleanSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BooleanSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<BooleanSetAttribute>";
            }
        };
    }
}
