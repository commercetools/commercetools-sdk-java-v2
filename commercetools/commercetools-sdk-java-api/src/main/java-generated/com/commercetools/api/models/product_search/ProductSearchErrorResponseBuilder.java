
package com.commercetools.api.models.product_search;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchErrorResponseBuilder
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
public class ProductSearchErrorResponseBuilder implements Builder<ProductSearchErrorResponse> {

    private Integer statusCode;

    private String message;

    @Nullable
    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     *  <p>The http status code of the response.</p>
     * @param statusCode value to be set
     * @return Builder
     */

    public ProductSearchErrorResponseBuilder statusCode(final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     *  <p>Describes the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public ProductSearchErrorResponseBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ProductSearchErrorResponseBuilder errors(
            @Nullable final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ProductSearchErrorResponseBuilder errors(
            @Nullable final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param errors value to be set
     * @return Builder
     */

    public ProductSearchErrorResponseBuilder plusErrors(
            @Nullable final com.commercetools.api.models.error.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ProductSearchErrorResponseBuilder plusErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public ProductSearchErrorResponseBuilder withErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The http status code of the response.</p>
     * @return statusCode
     */

    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     *  <p>Describes the error.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The errors that caused this error response.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     * builds ProductSearchErrorResponse with checking for non-null required values
     * @return ProductSearchErrorResponse
     */
    public ProductSearchErrorResponse build() {
        Objects.requireNonNull(statusCode, ProductSearchErrorResponse.class + ": statusCode is missing");
        Objects.requireNonNull(message, ProductSearchErrorResponse.class + ": message is missing");
        return new ProductSearchErrorResponseImpl(statusCode, message, errors);
    }

    /**
     * builds ProductSearchErrorResponse without checking for non-null required values
     * @return ProductSearchErrorResponse
     */
    public ProductSearchErrorResponse buildUnchecked() {
        return new ProductSearchErrorResponseImpl(statusCode, message, errors);
    }

    /**
     * factory method for an instance of ProductSearchErrorResponseBuilder
     * @return builder
     */
    public static ProductSearchErrorResponseBuilder of() {
        return new ProductSearchErrorResponseBuilder();
    }

    /**
     * create builder for ProductSearchErrorResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchErrorResponseBuilder of(final ProductSearchErrorResponse template) {
        ProductSearchErrorResponseBuilder builder = new ProductSearchErrorResponseBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.errors = template.getErrors();
        return builder;
    }

}
