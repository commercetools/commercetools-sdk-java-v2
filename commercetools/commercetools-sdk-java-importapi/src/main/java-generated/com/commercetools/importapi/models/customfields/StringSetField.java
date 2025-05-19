
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a string set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StringSetField stringSetField = StringSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StringSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StringSetFieldImpl.class)
public interface StringSetField extends CustomField {

    /**
     * discriminator value for StringSetField
     */
    String STRING_SET = "StringSet";

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
     * @return instance of StringSetField
     */
    public static StringSetField of() {
        return new StringSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy StringSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static StringSetField of(final StringSetField template) {
        StringSetFieldImpl instance = new StringSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public StringSetField copyDeep();

    /**
     * factory method to create a deep copy of StringSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StringSetField deepCopy(@Nullable final StringSetField template) {
        if (template == null) {
            return null;
        }
        StringSetFieldImpl instance = new StringSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for StringSetField
     * @return builder
     */
    public static StringSetFieldBuilder builder() {
        return StringSetFieldBuilder.of();
    }

    /**
     * create builder for StringSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StringSetFieldBuilder builder(final StringSetField template) {
        return StringSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStringSetField(Function<StringSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StringSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StringSetField>() {
            @Override
            public String toString() {
                return "TypeReference<StringSetField>";
            }
        };
    }
}
