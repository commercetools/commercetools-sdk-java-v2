
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the <code>CombinationUnique</code> AttributeConstraint criteria are not met during an Update Product request.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateAttributeValuesErrorImpl.class)
public interface DuplicateAttributeValuesError extends ErrorObject {

    /**
     * discriminator value for DuplicateAttributeValuesError
     */
    String DUPLICATE_ATTRIBUTE_VALUES = "DuplicateAttributeValues";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The set of attributes must be unique across all variants."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Conflicting Attributes.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p><code>"The set of attributes must be unique across all variants."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Conflicting Attributes.</p>
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
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttributes(template.getAttributes());
        return instance;
    }

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
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
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
