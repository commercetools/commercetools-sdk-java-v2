
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a server-side problem occurs. In some cases, the requested action may successfully complete after the error is returned. Therefore, it is recommended to verify the status of the requested resource after receiving a 500 error.</p>
 *  <p>If you encounter this error, report it to the <span>Checkout support team</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralError generalError = GeneralError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("General")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GeneralErrorImpl.class)
public interface GeneralError extends ErrorObject {

    /**
     * discriminator value for GeneralError
     */
    String GENERAL = "General";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Description about any known details of the problem, for example, <code>"Write operations are temporarily unavailable"</code>.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of GeneralError
     */
    public static GeneralError of() {
        return new GeneralErrorImpl();
    }

    /**
     * factory method to create a shallow copy GeneralError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GeneralError of(final GeneralError template) {
        GeneralErrorImpl instance = new GeneralErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public GeneralError copyDeep();

    /**
     * factory method to create a deep copy of GeneralError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GeneralError deepCopy(@Nullable final GeneralError template) {
        if (template == null) {
            return null;
        }
        GeneralErrorImpl instance = new GeneralErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for GeneralError
     * @return builder
     */
    public static GeneralErrorBuilder builder() {
        return GeneralErrorBuilder.of();
    }

    /**
     * create builder for GeneralError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeneralErrorBuilder builder(final GeneralError template) {
        return GeneralErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGeneralError(Function<GeneralError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GeneralError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GeneralError>() {
            @Override
            public String toString() {
                return "TypeReference<GeneralError>";
            }
        };
    }
}
