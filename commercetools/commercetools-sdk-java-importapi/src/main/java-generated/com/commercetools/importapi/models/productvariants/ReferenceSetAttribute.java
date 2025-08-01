
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a set of references.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferenceSetAttribute referenceSetAttribute = ReferenceSetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("reference-set")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReferenceSetAttributeImpl.class)
public interface ReferenceSetAttribute extends Attribute {

    /**
     * discriminator value for ReferenceSetAttribute
     */
    String REFERENCE_SET = "reference-set";

    /**
     *  <p>A set of references, each referencing a resource by key. Each reference must match the key of an existing resource in the project.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public List<KeyReference> getValue();

    /**
     *  <p>A set of references, each referencing a resource by key. Each reference must match the key of an existing resource in the project.</p>
     * @param value values to be set
     */

    @JsonIgnore
    public void setValue(final KeyReference... value);

    /**
     *  <p>A set of references, each referencing a resource by key. Each reference must match the key of an existing resource in the project.</p>
     * @param value values to be set
     */

    public void setValue(final List<KeyReference> value);

    /**
     * factory method
     * @return instance of ReferenceSetAttribute
     */
    public static ReferenceSetAttribute of() {
        return new ReferenceSetAttributeImpl();
    }

    /**
     * factory method to create a shallow copy ReferenceSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReferenceSetAttribute of(final ReferenceSetAttribute template) {
        ReferenceSetAttributeImpl instance = new ReferenceSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public ReferenceSetAttribute copyDeep();

    /**
     * factory method to create a deep copy of ReferenceSetAttribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReferenceSetAttribute deepCopy(@Nullable final ReferenceSetAttribute template) {
        if (template == null) {
            return null;
        }
        ReferenceSetAttributeImpl instance = new ReferenceSetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(Optional.ofNullable(template.getValue())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.KeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ReferenceSetAttribute
     * @return builder
     */
    public static ReferenceSetAttributeBuilder builder() {
        return ReferenceSetAttributeBuilder.of();
    }

    /**
     * create builder for ReferenceSetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferenceSetAttributeBuilder builder(final ReferenceSetAttribute template) {
        return ReferenceSetAttributeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReferenceSetAttribute(Function<ReferenceSetAttribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReferenceSetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReferenceSetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<ReferenceSetAttribute>";
            }
        };
    }
}
