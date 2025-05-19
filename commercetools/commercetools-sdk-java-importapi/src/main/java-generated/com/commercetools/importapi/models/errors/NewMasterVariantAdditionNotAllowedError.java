
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
 *  <p>Returned when attempting to create a ProductVariant and set it as the Master Variant in the same ProductVariantImport.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NewMasterVariantAdditionNotAllowedError newMasterVariantAdditionNotAllowedError = NewMasterVariantAdditionNotAllowedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("NewMasterVariantAdditionNotAllowed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NewMasterVariantAdditionNotAllowedErrorImpl.class)
public interface NewMasterVariantAdditionNotAllowedError extends ErrorObject {

    /**
     * discriminator value for NewMasterVariantAdditionNotAllowedError
     */
    String NEW_MASTER_VARIANT_ADDITION_NOT_ALLOWED = "NewMasterVariantAdditionNotAllowed";

    /**
     *  <p><code>"Adding a new variant as master variant is not allowed."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Adding a new variant as master variant is not allowed."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of NewMasterVariantAdditionNotAllowedError
     */
    public static NewMasterVariantAdditionNotAllowedError of() {
        return new NewMasterVariantAdditionNotAllowedErrorImpl();
    }

    /**
     * factory method to create a shallow copy NewMasterVariantAdditionNotAllowedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static NewMasterVariantAdditionNotAllowedError of(final NewMasterVariantAdditionNotAllowedError template) {
        NewMasterVariantAdditionNotAllowedErrorImpl instance = new NewMasterVariantAdditionNotAllowedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public NewMasterVariantAdditionNotAllowedError copyDeep();

    /**
     * factory method to create a deep copy of NewMasterVariantAdditionNotAllowedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NewMasterVariantAdditionNotAllowedError deepCopy(
            @Nullable final NewMasterVariantAdditionNotAllowedError template) {
        if (template == null) {
            return null;
        }
        NewMasterVariantAdditionNotAllowedErrorImpl instance = new NewMasterVariantAdditionNotAllowedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for NewMasterVariantAdditionNotAllowedError
     * @return builder
     */
    public static NewMasterVariantAdditionNotAllowedErrorBuilder builder() {
        return NewMasterVariantAdditionNotAllowedErrorBuilder.of();
    }

    /**
     * create builder for NewMasterVariantAdditionNotAllowedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NewMasterVariantAdditionNotAllowedErrorBuilder builder(
            final NewMasterVariantAdditionNotAllowedError template) {
        return NewMasterVariantAdditionNotAllowedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNewMasterVariantAdditionNotAllowedError(
            Function<NewMasterVariantAdditionNotAllowedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NewMasterVariantAdditionNotAllowedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NewMasterVariantAdditionNotAllowedError>() {
            @Override
            public String toString() {
                return "TypeReference<NewMasterVariantAdditionNotAllowedError>";
            }
        };
    }
}
