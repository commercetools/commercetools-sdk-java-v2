
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
 *     EnumSetAttribute enumSetAttribute = EnumSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("enum-set")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumSetAttributeImpl.class)
public interface EnumSetAttribute extends Attribute {

    /**
     * discriminator value for EnumSetAttribute
     */
    String ENUM_SET = "enum-set";

    /**
     *  <p>A set of enum values, each represented by its key. Each key must match the key of an AttributePlainEnumValue in the Product Type.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<String> getValue();

    /**
     *  <p>A set of enum values, each represented by its key. Each key must match the key of an AttributePlainEnumValue in the Product Type.</p>
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final String... value);

    /**
     *  <p>A set of enum values, each represented by its key. Each key must match the key of an AttributePlainEnumValue in the Product Type.</p>
     * @param value values to be set
     */

    public void setValue(final List<String> value);

    /**
     * factory method
     * @return instance of EnumSetAttribute
     */
    public static EnumSetAttribute of() {
        return new EnumSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy EnumSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumSetAttribute of(final EnumSetAttribute template) {
        EnumSetAttributeImpl instance = new EnumSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public EnumSetAttribute copyDeep();

    /**
     * factory method to create a deep copy of EnumSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumSetAttribute deepCopy(@Nullable final EnumSetAttribute template) {
        if (template == null) {
            return null;
        }
        EnumSetAttributeImpl instance = new EnumSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for EnumSetAttribute
     * @return builder
     */
    public static EnumSetAttributeBuilder builder() {
        return EnumSetAttributeBuilder.of();
    }

    /**
     * create builder for EnumSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumSetAttributeBuilder builder(final EnumSetAttribute template) {
        return EnumSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumSetAttribute(Function<EnumSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<EnumSetAttribute>";
            }
        };
    }
}
