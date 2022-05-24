
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditReference orderEditReference = OrderEditReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditReferenceBuilder implements Builder<OrderEditReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.order_edit.OrderEdit obj;

    /**
     <*  <p>Unique identifier of the referenced OrderEdit.</p>>
     */

    public OrderEditReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded OrderEdit. Only present in responses to requests with Reference Expansion for OrderEdits.</p>>
     */

    public OrderEditReferenceBuilder obj(
            Function<com.commercetools.api.models.order_edit.OrderEditBuilder, com.commercetools.api.models.order_edit.OrderEditBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.order_edit.OrderEditBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded OrderEdit. Only present in responses to requests with Reference Expansion for OrderEdits.</p>>
     */

    public OrderEditReferenceBuilder obj(@Nullable final com.commercetools.api.models.order_edit.OrderEdit obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.order_edit.OrderEdit getObj() {
        return this.obj;
    }

    public OrderEditReference build() {
        Objects.requireNonNull(id, OrderEditReference.class + ": id is missing");
        return new OrderEditReferenceImpl(id, obj);
    }

    /**
     * builds OrderEditReference without checking for non null required values
     */
    public OrderEditReference buildUnchecked() {
        return new OrderEditReferenceImpl(id, obj);
    }

    public static OrderEditReferenceBuilder of() {
        return new OrderEditReferenceBuilder();
    }

    public static OrderEditReferenceBuilder of(final OrderEditReference template) {
        OrderEditReferenceBuilder builder = new OrderEditReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
