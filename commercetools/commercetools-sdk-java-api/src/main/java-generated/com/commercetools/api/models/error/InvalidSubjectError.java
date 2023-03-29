
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidSubjectError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidSubjectError invalidSubjectError = InvalidSubjectError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidSubjectErrorImpl.class)
public interface InvalidSubjectError extends ErrorObject {

    /**
     * discriminator value for InvalidSubjectError
     */
    String INVALID_SUBJECT = "InvalidSubject";

    /**
     * factory method
     * @return instance of InvalidSubjectError
     */
    public static InvalidSubjectError of() {
        return new InvalidSubjectErrorImpl();
    }

    /**
     * factory method to copy an instance of InvalidSubjectError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidSubjectError of(final InvalidSubjectError template) {
        InvalidSubjectErrorImpl instance = new InvalidSubjectErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template).ifPresent(t -> t.values().forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for InvalidSubjectError
     * @return builder
     */
    public static InvalidSubjectErrorBuilder builder() {
        return InvalidSubjectErrorBuilder.of();
    }

    /**
     * create builder for InvalidSubjectError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidSubjectErrorBuilder builder(final InvalidSubjectError template) {
        return InvalidSubjectErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidSubjectError(Function<InvalidSubjectError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidSubjectError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidSubjectError>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidSubjectError>";
            }
        };
    }
}
