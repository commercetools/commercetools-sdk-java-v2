
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The resources in the request are not in the valid state for the operation. The client application should validate the constraints described in the error message before sending the request again.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidOperation invalidOperation = InvalidOperation.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidOperationImpl.class)
public interface InvalidOperation extends ErrorObject {

    /**
     * discriminator value for InvalidOperation
     */
    String INVALID_OPERATION = "InvalidOperation";

    /**
     * factory method
     * @return instance of InvalidOperation
     */
    public static InvalidOperation of() {
        return new InvalidOperationImpl();
    }

    /**
     * factory method to copy an instance of InvalidOperation
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidOperation of(final InvalidOperation template) {
        InvalidOperationImpl instance = new InvalidOperationImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for InvalidOperation
     * @return builder
     */
    public static InvalidOperationBuilder builder() {
        return InvalidOperationBuilder.of();
    }

    /**
     * create builder for InvalidOperation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidOperationBuilder builder(final InvalidOperation template) {
        return InvalidOperationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidOperation(Function<InvalidOperation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidOperation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidOperation>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidOperation>";
            }
        };
    }
}
