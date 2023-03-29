
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A field with an enum set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EnumSetField enumSetField = EnumSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EnumSetFieldImpl.class)
public interface EnumSetField extends CustomField {

    /**
     * discriminator value for EnumSetField
     */
    String ENUM_SET = "EnumSet";

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
     * @return instance of EnumSetField
     */
    public static EnumSetField of() {
        return new EnumSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy EnumSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static EnumSetField of(final EnumSetField template) {
        EnumSetFieldImpl instance = new EnumSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of EnumSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EnumSetField deepCopy(@Nullable final EnumSetField template) {
        if (template == null) {
            return null;
        }
        EnumSetFieldImpl instance = new EnumSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for EnumSetField
     * @return builder
     */
    public static EnumSetFieldBuilder builder() {
        return EnumSetFieldBuilder.of();
    }

    /**
     * create builder for EnumSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EnumSetFieldBuilder builder(final EnumSetField template) {
        return EnumSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEnumSetField(Function<EnumSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EnumSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EnumSetField>() {
            @Override
            public String toString() {
                return "TypeReference<EnumSetField>";
            }
        };
    }
}
