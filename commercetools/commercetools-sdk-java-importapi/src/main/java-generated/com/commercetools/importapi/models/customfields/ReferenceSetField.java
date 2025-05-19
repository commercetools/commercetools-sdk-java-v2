
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A field with a reference set value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceSetField referenceSetField = ReferenceSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ReferenceSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferenceSetFieldImpl.class)
public interface ReferenceSetField extends CustomField {

    /**
     * discriminator value for ReferenceSetField
     */
    String REFERENCE_SET = "ReferenceSet";

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<KeyReference> getValue();

    /**
     * set value
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final KeyReference... value);

    /**
     * set value
     * @param value values to be set
     */

    public void setValue(final List<KeyReference> value);

    /**
     * factory method
     * @return instance of ReferenceSetField
     */
    public static ReferenceSetField of() {
        return new ReferenceSetFieldImpl();
    }

    /**
     * factory method to create a shallow copy ReferenceSetField
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReferenceSetField of(final ReferenceSetField template) {
        ReferenceSetFieldImpl instance = new ReferenceSetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public ReferenceSetField copyDeep();

    /**
     * factory method to create a deep copy of ReferenceSetField
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReferenceSetField deepCopy(@Nullable final ReferenceSetField template) {
        if (template == null) {
            return null;
        }
        ReferenceSetFieldImpl instance = new ReferenceSetFieldImpl();
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.KeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReferenceSetField
     * @return builder
     */
    public static ReferenceSetFieldBuilder builder() {
        return ReferenceSetFieldBuilder.of();
    }

    /**
     * create builder for ReferenceSetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceSetFieldBuilder builder(final ReferenceSetField template) {
        return ReferenceSetFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReferenceSetField(Function<ReferenceSetField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReferenceSetField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferenceSetField>() {
            @Override
            public String toString() {
                return "TypeReference<ReferenceSetField>";
            }
        };
    }
}
