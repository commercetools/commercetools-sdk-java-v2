
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditPreviewFailureBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditPreviewFailure orderEditPreviewFailure = OrderEditPreviewFailure.builder()
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditPreviewFailureBuilder implements Builder<OrderEditPreviewFailure> {

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     *  <p>Errors returned.</p>
     * @param errors value to be set
     * @return Builder
     */

    public OrderEditPreviewFailureBuilder errors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned.</p>
     * @param errors value to be set
     * @return Builder
     */

    public OrderEditPreviewFailureBuilder errors(
            final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors returned.</p>
     * @param errors value to be set
     * @return Builder
     */

    public OrderEditPreviewFailureBuilder plusErrors(final com.commercetools.api.models.error.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors returned.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public OrderEditPreviewFailureBuilder plusErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors returned.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public OrderEditPreviewFailureBuilder withErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors returned.</p>
     * @return errors
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     * builds OrderEditPreviewFailure with checking for non-null required values
     * @return OrderEditPreviewFailure
     */
    public OrderEditPreviewFailure build() {
        Objects.requireNonNull(errors, OrderEditPreviewFailure.class + ": errors is missing");
        return new OrderEditPreviewFailureImpl(errors);
    }

    /**
     * builds OrderEditPreviewFailure without checking for non-null required values
     * @return OrderEditPreviewFailure
     */
    public OrderEditPreviewFailure buildUnchecked() {
        return new OrderEditPreviewFailureImpl(errors);
    }

    /**
     * factory method for an instance of OrderEditPreviewFailureBuilder
     * @return builder
     */
    public static OrderEditPreviewFailureBuilder of() {
        return new OrderEditPreviewFailureBuilder();
    }

    /**
     * create builder for OrderEditPreviewFailure instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditPreviewFailureBuilder of(final OrderEditPreviewFailure template) {
        OrderEditPreviewFailureBuilder builder = new OrderEditPreviewFailureBuilder();
        builder.errors = template.getErrors();
        return builder;
    }

}
