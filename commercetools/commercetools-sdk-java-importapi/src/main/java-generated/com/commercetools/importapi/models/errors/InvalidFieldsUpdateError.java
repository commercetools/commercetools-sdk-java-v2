
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a field cannot be updated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidFieldsUpdateError invalidFieldsUpdateError = InvalidFieldsUpdateError.builder()
 *             .message("{message}")
 *             .plusFields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidFieldUpdate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidFieldsUpdateErrorImpl.class)
public interface InvalidFieldsUpdateError extends ErrorObject {

    /**
     * discriminator value for InvalidFieldsUpdateError
     */
    String INVALID_FIELD_UPDATE = "InvalidFieldUpdate";

    /**
     *  <p><code>"The following fields are currently not supported for changes/updates"</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Fields that cannot be updated.</p>
     * @return fields
     */
    @NotNull
    @JsonProperty("fields")
    public List<String> getFields();

    /**
     *  <p><code>"The following fields are currently not supported for changes/updates"</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Fields that cannot be updated.</p>
     * @param fields values to be set
     */

    @JsonIgnore
    public void setFields(final String... fields);

    /**
     *  <p>Fields that cannot be updated.</p>
     * @param fields values to be set
     */

    public void setFields(final List<String> fields);

    /**
     * factory method
     * @return instance of InvalidFieldsUpdateError
     */
    public static InvalidFieldsUpdateError of() {
        return new InvalidFieldsUpdateErrorImpl();
    }

    /**
     * factory method to create a shallow copy InvalidFieldsUpdateError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidFieldsUpdateError of(final InvalidFieldsUpdateError template) {
        InvalidFieldsUpdateErrorImpl instance = new InvalidFieldsUpdateErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setFields(template.getFields());
        return instance;
    }

    public InvalidFieldsUpdateError copyDeep();

    /**
     * factory method to create a deep copy of InvalidFieldsUpdateError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidFieldsUpdateError deepCopy(@Nullable final InvalidFieldsUpdateError template) {
        if (template == null) {
            return null;
        }
        InvalidFieldsUpdateErrorImpl instance = new InvalidFieldsUpdateErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setFields(Optional.ofNullable(template.getFields()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for InvalidFieldsUpdateError
     * @return builder
     */
    public static InvalidFieldsUpdateErrorBuilder builder() {
        return InvalidFieldsUpdateErrorBuilder.of();
    }

    /**
     * create builder for InvalidFieldsUpdateError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidFieldsUpdateErrorBuilder builder(final InvalidFieldsUpdateError template) {
        return InvalidFieldsUpdateErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidFieldsUpdateError(Function<InvalidFieldsUpdateError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidFieldsUpdateError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidFieldsUpdateError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidFieldsUpdateError>";
            }
        };
    }
}
