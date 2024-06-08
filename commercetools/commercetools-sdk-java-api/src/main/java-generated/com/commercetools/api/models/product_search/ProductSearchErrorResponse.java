
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.ErrorResponse;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductSearchErrorResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchErrorResponse productSearchErrorResponse = ProductSearchErrorResponse.builder()
 *             .statusCode(1)
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchErrorResponseImpl.class)
public interface ProductSearchErrorResponse extends ErrorResponse {

    /**
     *  <p>The HTTP status code of the response.</p>
     * @return statusCode
     */
    @NotNull
    @JsonProperty("statusCode")
    public Integer getStatusCode();

    /**
     *  <p>Describes the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>The errors that caused this error response.</p>
     * @return errors
     */
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p>The HTTP status code of the response.</p>
     * @param statusCode value to be set
     */

    public void setStatusCode(final Integer statusCode);

    /**
     *  <p>Describes the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     * factory method
     * @return instance of ProductSearchErrorResponse
     */
    public static ProductSearchErrorResponse of() {
        return new ProductSearchErrorResponseImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchErrorResponse of(final ProductSearchErrorResponse template) {
        ProductSearchErrorResponseImpl instance = new ProductSearchErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(template.getErrors());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSearchErrorResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchErrorResponse deepCopy(@Nullable final ProductSearchErrorResponse template) {
        if (template == null) {
            return null;
        }
        ProductSearchErrorResponseImpl instance = new ProductSearchErrorResponseImpl();
        instance.setStatusCode(template.getStatusCode());
        instance.setMessage(template.getMessage());
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSearchErrorResponse
     * @return builder
     */
    public static ProductSearchErrorResponseBuilder builder() {
        return ProductSearchErrorResponseBuilder.of();
    }

    /**
     * create builder for ProductSearchErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchErrorResponseBuilder builder(final ProductSearchErrorResponse template) {
        return ProductSearchErrorResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchErrorResponse(Function<ProductSearchErrorResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchErrorResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchErrorResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchErrorResponse>";
            }
        };
    }
}
