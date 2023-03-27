
package com.commercetools.history.models.change_history;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorObject
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorObject errorObject = ErrorObject.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ErrorObjectImpl.class)
public interface ErrorObject {

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     * set code
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     * set message
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ErrorObject
     */
    public static ErrorObject of() {
        return new ErrorObjectImpl();
    }

    /**
     * factory method to copy an instance of ErrorObject
     * @param template instance to be copied
     * @return copy instance
     */
    public static ErrorObject of(final ErrorObject template) {
        ErrorObjectImpl instance = new ErrorObjectImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for ErrorObject
     * @return builder
     */
    public static ErrorObjectBuilder builder() {
        return ErrorObjectBuilder.of();
    }

    /**
     * create builder for ErrorObject instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorObjectBuilder builder(final ErrorObject template) {
        return ErrorObjectBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withErrorObject(Function<ErrorObject, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ErrorObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorObject>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorObject>";
            }
        };
    }
}
