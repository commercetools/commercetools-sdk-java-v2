
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Discount predicate, API Extension predicate, or search query does not have the correct syntax.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SyntaxErrorError syntaxErrorError = SyntaxErrorError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SyntaxErrorErrorImpl.class)
public interface SyntaxErrorError extends ErrorObject {

    /**
     * discriminator value for SyntaxErrorError
     */
    String SYNTAX_ERROR = "SyntaxError";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Syntax error while parsing $fieldDefinition."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Syntax error while parsing $fieldDefinition."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of SyntaxErrorError
     */
    public static SyntaxErrorError of() {
        return new SyntaxErrorErrorImpl();
    }

    /**
     * factory method to copy an instance of SyntaxErrorError
     * @param template instance to be copied
     * @return copy instance
     */
    public static SyntaxErrorError of(final SyntaxErrorError template) {
        SyntaxErrorErrorImpl instance = new SyntaxErrorErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    /**
     * builder factory method for SyntaxErrorError
     * @return builder
     */
    public static SyntaxErrorErrorBuilder builder() {
        return SyntaxErrorErrorBuilder.of();
    }

    /**
     * create builder for SyntaxErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SyntaxErrorErrorBuilder builder(final SyntaxErrorError template) {
        return SyntaxErrorErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSyntaxErrorError(Function<SyntaxErrorError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SyntaxErrorError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SyntaxErrorError>() {
            @Override
            public String toString() {
                return "TypeReference<SyntaxErrorError>";
            }
        };
    }
}
