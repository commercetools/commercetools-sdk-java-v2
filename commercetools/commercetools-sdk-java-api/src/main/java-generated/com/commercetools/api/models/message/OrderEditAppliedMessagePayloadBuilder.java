
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditAppliedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditAppliedMessagePayload orderEditAppliedMessagePayload = OrderEditAppliedMessagePayload.builder()
 *             .edit(editBuilder -> editBuilder)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditAppliedMessagePayloadBuilder implements Builder<OrderEditAppliedMessagePayload> {

    private com.commercetools.api.models.order_edit.OrderEdit edit;

    private com.commercetools.api.models.order_edit.OrderEditApplied result;

    /**
     *  <p>OrderEdit that was applied.</p>
     * @param builder function to build the edit value
     * @return Builder
     */

    public OrderEditAppliedMessagePayloadBuilder edit(
            Function<com.commercetools.api.models.order_edit.OrderEditBuilder, com.commercetools.api.models.order_edit.OrderEditBuilder> builder) {
        this.edit = builder.apply(com.commercetools.api.models.order_edit.OrderEditBuilder.of()).build();
        return this;
    }

    /**
     *  <p>OrderEdit that was applied.</p>
     * @param edit value to be set
     * @return Builder
     */

    public OrderEditAppliedMessagePayloadBuilder edit(final com.commercetools.api.models.order_edit.OrderEdit edit) {
        this.edit = edit;
        return this;
    }

    /**
     *  <p>Information about a successfully applied OrderEdit.</p>
     * @param builder function to build the result value
     * @return Builder
     */

    public OrderEditAppliedMessagePayloadBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditAppliedBuilder, com.commercetools.api.models.order_edit.OrderEditAppliedBuilder> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditAppliedBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information about a successfully applied OrderEdit.</p>
     * @param result value to be set
     * @return Builder
     */

    public OrderEditAppliedMessagePayloadBuilder result(
            final com.commercetools.api.models.order_edit.OrderEditApplied result) {
        this.result = result;
        return this;
    }

    /**
     *  <p>OrderEdit that was applied.</p>
     * @return edit
     */

    public com.commercetools.api.models.order_edit.OrderEdit getEdit() {
        return this.edit;
    }

    /**
     *  <p>Information about a successfully applied OrderEdit.</p>
     * @return result
     */

    public com.commercetools.api.models.order_edit.OrderEditApplied getResult() {
        return this.result;
    }

    /**
     * builds OrderEditAppliedMessagePayload with checking for non-null required values
     * @return OrderEditAppliedMessagePayload
     */
    public OrderEditAppliedMessagePayload build() {
        Objects.requireNonNull(edit, OrderEditAppliedMessagePayload.class + ": edit is missing");
        Objects.requireNonNull(result, OrderEditAppliedMessagePayload.class + ": result is missing");
        return new OrderEditAppliedMessagePayloadImpl(edit, result);
    }

    /**
     * builds OrderEditAppliedMessagePayload without checking for non-null required values
     * @return OrderEditAppliedMessagePayload
     */
    public OrderEditAppliedMessagePayload buildUnchecked() {
        return new OrderEditAppliedMessagePayloadImpl(edit, result);
    }

    /**
     * factory method for an instance of OrderEditAppliedMessagePayloadBuilder
     * @return builder
     */
    public static OrderEditAppliedMessagePayloadBuilder of() {
        return new OrderEditAppliedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderEditAppliedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditAppliedMessagePayloadBuilder of(final OrderEditAppliedMessagePayload template) {
        OrderEditAppliedMessagePayloadBuilder builder = new OrderEditAppliedMessagePayloadBuilder();
        builder.edit = template.getEdit();
        builder.result = template.getResult();
        return builder;
    }

}
