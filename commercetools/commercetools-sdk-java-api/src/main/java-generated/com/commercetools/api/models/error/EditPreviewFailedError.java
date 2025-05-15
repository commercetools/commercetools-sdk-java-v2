
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a preview to find an appropriate Shipping Method for an OrderEdit could not be generated.</p>
 *  <p>The error is returned as a failed response to the Get Shipping Methods for an OrderEdit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EditPreviewFailedError editPreviewFailedError = EditPreviewFailedError.builder()
 *             .message("{message}")
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("EditPreviewFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = EditPreviewFailedErrorImpl.class)
public interface EditPreviewFailedError extends ErrorObject {

    /**
     * discriminator value for EditPreviewFailedError
     */
    String EDIT_PREVIEW_FAILED = "EditPreviewFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Error while applying staged actions. ShippingMethods could not be determined."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @return result
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditPreviewFailure getResult();

    /**
     *  <p><code>"Error while applying staged actions. ShippingMethods could not be determined."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @param result value to be set
     */

    public void setResult(final OrderEditPreviewFailure result);

    /**
     * factory method
     * @return instance of EditPreviewFailedError
     */
    public static EditPreviewFailedError of() {
        return new EditPreviewFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy EditPreviewFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static EditPreviewFailedError of(final EditPreviewFailedError template) {
        EditPreviewFailedErrorImpl instance = new EditPreviewFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setResult(template.getResult());
        return instance;
    }

    public EditPreviewFailedError copyDeep();

    /**
     * factory method to create a deep copy of EditPreviewFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EditPreviewFailedError deepCopy(@Nullable final EditPreviewFailedError template) {
        if (template == null) {
            return null;
        }
        EditPreviewFailedErrorImpl instance = new EditPreviewFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setResult(
            com.commercetools.api.models.order_edit.OrderEditPreviewFailure.deepCopy(template.getResult()));
        return instance;
    }

    /**
     * builder factory method for EditPreviewFailedError
     * @return builder
     */
    public static EditPreviewFailedErrorBuilder builder() {
        return EditPreviewFailedErrorBuilder.of();
    }

    /**
     * create builder for EditPreviewFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EditPreviewFailedErrorBuilder builder(final EditPreviewFailedError template) {
        return EditPreviewFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEditPreviewFailedError(Function<EditPreviewFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<EditPreviewFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<EditPreviewFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<EditPreviewFailedError>";
            }
        };
    }
}
