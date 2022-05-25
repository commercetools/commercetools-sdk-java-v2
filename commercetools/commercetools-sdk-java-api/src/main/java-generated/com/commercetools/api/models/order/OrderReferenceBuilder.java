
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderReference orderReference = OrderReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderReferenceBuilder implements Builder<OrderReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.order.Order obj;

    /**
     *  <p>Unique ID of the referenced resource.</p>
     */

    public OrderReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public OrderReferenceBuilder obj(
            Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderReferenceBuilder obj(@Nullable final com.commercetools.api.models.order.Order obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.order.Order getObj() {
        return this.obj;
    }

    public OrderReference build() {
        Objects.requireNonNull(id, OrderReference.class + ": id is missing");
        return new OrderReferenceImpl(id, obj);
    }

    /**
     * builds OrderReference without checking for non null required values
     */
    public OrderReference buildUnchecked() {
        return new OrderReferenceImpl(id, obj);
    }

    public static OrderReferenceBuilder of() {
        return new OrderReferenceBuilder();
    }

    public static OrderReferenceBuilder of(final OrderReference template) {
        OrderReferenceBuilder builder = new OrderReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
