
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPatchImportBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPatchImport orderPatchImport = OrderPatchImport.builder()
 *             .orderNumber("{orderNumber}")
 *             .fields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPatchImportBuilder implements Builder<OrderPatchImport> {

    private String orderNumber;

    private com.commercetools.importapi.models.order_patches.OrderField fields;

    /**
     <*  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order, unique across a project.</p>>
     */

    public OrderPatchImportBuilder orderNumber(final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     <*  <p>Each field referenced must be defined in an already existing order in the commercetools project or the import operation state is set to <code>validationFailed</code>.</p>>
     */

    public OrderPatchImportBuilder fields(
            Function<com.commercetools.importapi.models.order_patches.OrderFieldBuilder, com.commercetools.importapi.models.order_patches.OrderFieldBuilder> builder) {
        this.fields = builder.apply(com.commercetools.importapi.models.order_patches.OrderFieldBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Each field referenced must be defined in an already existing order in the commercetools project or the import operation state is set to <code>validationFailed</code>.</p>>
     */

    public OrderPatchImportBuilder fields(final com.commercetools.importapi.models.order_patches.OrderField fields) {
        this.fields = fields;
        return this;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public com.commercetools.importapi.models.order_patches.OrderField getFields() {
        return this.fields;
    }

    public OrderPatchImport build() {
        Objects.requireNonNull(orderNumber, OrderPatchImport.class + ": orderNumber is missing");
        Objects.requireNonNull(fields, OrderPatchImport.class + ": fields is missing");
        return new OrderPatchImportImpl(orderNumber, fields);
    }

    /**
     * builds OrderPatchImport without checking for non null required values
     */
    public OrderPatchImport buildUnchecked() {
        return new OrderPatchImportImpl(orderNumber, fields);
    }

    public static OrderPatchImportBuilder of() {
        return new OrderPatchImportBuilder();
    }

    public static OrderPatchImportBuilder of(final OrderPatchImport template) {
        OrderPatchImportBuilder builder = new OrderPatchImportBuilder();
        builder.orderNumber = template.getOrderNumber();
        builder.fields = template.getFields();
        return builder;
    }

}
