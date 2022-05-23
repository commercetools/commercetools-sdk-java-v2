
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetOrderNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetOrderNumberAction orderSetOrderNumberAction = OrderSetOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetOrderNumberActionBuilder implements Builder<OrderSetOrderNumberAction> {

    @Nullable
    private String orderNumber;

    /**
     <>
     */

    public OrderSetOrderNumberActionBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    public OrderSetOrderNumberAction build() {
        return new OrderSetOrderNumberActionImpl(orderNumber);
    }

    /**
     * builds OrderSetOrderNumberAction without checking for non null required values
     */
    public OrderSetOrderNumberAction buildUnchecked() {
        return new OrderSetOrderNumberActionImpl(orderNumber);
    }

    public static OrderSetOrderNumberActionBuilder of() {
        return new OrderSetOrderNumberActionBuilder();
    }

    public static OrderSetOrderNumberActionBuilder of(final OrderSetOrderNumberAction template) {
        OrderSetOrderNumberActionBuilder builder = new OrderSetOrderNumberActionBuilder();
        builder.orderNumber = template.getOrderNumber();
        return builder;
    }

}
