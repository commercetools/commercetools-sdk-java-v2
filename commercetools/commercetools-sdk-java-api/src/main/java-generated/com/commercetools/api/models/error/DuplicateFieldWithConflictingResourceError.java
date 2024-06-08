
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a field value conflicts with an existing value stored in a particular resource causing a duplicate.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicateFieldWithConflictingResourceError duplicateFieldWithConflictingResourceError = DuplicateFieldWithConflictingResourceError.builder()
 *             .message("{message}")
 *             .field("{field}")
 *             .conflictingResource(conflictingResourceBuilder -> conflictingResourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicateFieldWithConflictingResourceErrorImpl.class)
public interface DuplicateFieldWithConflictingResourceError extends ErrorObject {

    /**
     * discriminator value for DuplicateFieldWithConflictingResourceError
     */
    String DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE = "DuplicateFieldWithConflictingResource";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"A duplicate value $duplicateValue exists for field $field on $conflictingResource."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Name of the conflicting field.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Conflicting duplicate value.</p>
     * @return duplicateValue
     */
    @NotNull
    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    /**
     *  <p>Reference to the resource that has the conflicting value.</p>
     * @return conflictingResource
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingResource")
    public Reference getConflictingResource();

    /**
     *  <p><code>"A duplicate value $duplicateValue exists for field $field on $conflictingResource."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Name of the conflicting field.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>Conflicting duplicate value.</p>
     * @param duplicateValue value to be set
     */

    public void setDuplicateValue(final Object duplicateValue);

    /**
     *  <p>Reference to the resource that has the conflicting value.</p>
     * @param conflictingResource value to be set
     */

    public void setConflictingResource(final Reference conflictingResource);

    /**
     * factory method
     * @return instance of DuplicateFieldWithConflictingResourceError
     */
    public static DuplicateFieldWithConflictingResourceError of() {
        return new DuplicateFieldWithConflictingResourceErrorImpl();
    }

    /**
     * factory method to create a shallow copy DuplicateFieldWithConflictingResourceError
     * @param template instance to be copied
     * @return copy instance
     */
    public static DuplicateFieldWithConflictingResourceError of(
            final DuplicateFieldWithConflictingResourceError template) {
        DuplicateFieldWithConflictingResourceErrorImpl instance = new DuplicateFieldWithConflictingResourceErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        instance.setConflictingResource(template.getConflictingResource());
        return instance;
    }

    /**
     * factory method to create a deep copy of DuplicateFieldWithConflictingResourceError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DuplicateFieldWithConflictingResourceError deepCopy(
            @Nullable final DuplicateFieldWithConflictingResourceError template) {
        if (template == null) {
            return null;
        }
        DuplicateFieldWithConflictingResourceErrorImpl instance = new DuplicateFieldWithConflictingResourceErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        instance.setConflictingResource(
            com.commercetools.api.models.common.Reference.deepCopy(template.getConflictingResource()));
        return instance;
    }

    /**
     * builder factory method for DuplicateFieldWithConflictingResourceError
     * @return builder
     */
    public static DuplicateFieldWithConflictingResourceErrorBuilder builder() {
        return DuplicateFieldWithConflictingResourceErrorBuilder.of();
    }

    /**
     * create builder for DuplicateFieldWithConflictingResourceError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DuplicateFieldWithConflictingResourceErrorBuilder builder(
            final DuplicateFieldWithConflictingResourceError template) {
        return DuplicateFieldWithConflictingResourceErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDuplicateFieldWithConflictingResourceError(
            Function<DuplicateFieldWithConflictingResourceError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldWithConflictingResourceError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicateFieldWithConflictingResourceError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicateFieldWithConflictingResourceError>";
            }
        };
    }
}
