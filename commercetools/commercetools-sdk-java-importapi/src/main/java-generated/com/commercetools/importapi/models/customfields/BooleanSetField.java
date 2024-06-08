
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
 *  <p>A field with a boolean set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BooleanSetField booleanSetField = BooleanSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BooleanSetFieldImpl.class)
public interface BooleanSetField extends CustomField {

    /**
     * discriminator value for BooleanSetField
     */
    String BOOLEAN_SET = "BooleanSet";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public List<Boolean> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final Boolean... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<Boolean> value);

    /**
     * factory method
     * @return instance of BooleanSetField
     */
    public static BooleanSetField of() {
        return new BooleanSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy BooleanSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static BooleanSetField of(final BooleanSetField template) {
        BooleanSetFieldImpl instance = new BooleanSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of BooleanSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BooleanSetField deepCopy(@Nullable final BooleanSetField template) {
        if (template == null) {
            return null;
        }
        BooleanSetFieldImpl instance = new BooleanSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for BooleanSetField
     * @return builder
     */
    public static BooleanSetFieldBuilder builder() {
        return BooleanSetFieldBuilder.of();
    }

    /**
     * create builder for BooleanSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BooleanSetFieldBuilder builder(final BooleanSetField template) {
        return BooleanSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBooleanSetField(Function<BooleanSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BooleanSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BooleanSetField>() {
            @Override
            public String toString() {
                return "TypeReference<BooleanSetField>";
            }
        };
    }
}
