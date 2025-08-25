
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The <code>CombinationUnique</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeConstraintEnum" rel="nofollow">AttributeConstraintEnum</a> was violated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateAttributeValuesError duplicateAttributeValuesError = DuplicateAttributeValuesError.builder()
 *             .message("{message}")
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateAttributeValues")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateAttributeValuesErrorImpl.class)
public interface DuplicateAttributeValuesError extends ErrorObject {

    /**
     * discriminator value for DuplicateAttributeValuesError
     */
    String DUPLICATE_ATTRIBUTE_VALUES = "DuplicateAttributeValues";

    /**
     *
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     * set attributes
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     * set attributes
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     * factory method
     * @return instance of DuplicateAttributeValuesError
     */
    public static DuplicateAttributeValuesError of() {
        return new DuplicateAttributeValuesErrorImpl();
    }

    /**
     * factory method to create a shallow copy DuplicateAttributeValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicateAttributeValuesError of(final DuplicateAttributeValuesError template) {
        DuplicateAttributeValuesErrorImpl instance = new DuplicateAttributeValuesErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public DuplicateAttributeValuesError copyDeep();

    /**
     * factory method to create a deep copy of DuplicateAttributeValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicateAttributeValuesError deepCopy(@Nullable final DuplicateAttributeValuesError template) {
        if (template == null) {
            return null;
        }
        DuplicateAttributeValuesErrorImpl instance = new DuplicateAttributeValuesErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.productvariants.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DuplicateAttributeValuesError
     * @return builder
     */
    public static DuplicateAttributeValuesErrorBuilder builder() {
        return DuplicateAttributeValuesErrorBuilder.of();
    }

    /**
     * create builder for DuplicateAttributeValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateAttributeValuesErrorBuilder builder(final DuplicateAttributeValuesError template) {
        return DuplicateAttributeValuesErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicateAttributeValuesError(Function<DuplicateAttributeValuesError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateAttributeValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateAttributeValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateAttributeValuesError>";
            }
        };
    }
}
