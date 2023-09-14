
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
     *  <p>Value to set. Must be unique across a Project. Once set, the value cannot be changed.</p>
     * @param orderNumber value to be set
     * @return Builder
     */

    public OrderSetOrderNumberActionBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique across a Project. Once set, the value cannot be changed.</p>
     * @return orderNumber
     */

    @Nullable
    public String getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * builds OrderSetOrderNumberAction with checking for non-null required values
     * @return OrderSetOrderNumberAction
     */
    public OrderSetOrderNumberAction build() {
        return new OrderSetOrderNumberActionImpl(orderNumber);
    }

    /**
     * builds OrderSetOrderNumberAction without checking for non-null required values
     * @return OrderSetOrderNumberAction
     */
    public OrderSetOrderNumberAction buildUnchecked() {
        return new OrderSetOrderNumberActionImpl(orderNumber);
    }

    /**
     * factory method for an instance of OrderSetOrderNumberActionBuilder
     * @return builder
     */
    public static OrderSetOrderNumberActionBuilder of() {
        return new OrderSetOrderNumberActionBuilder();
    }

    /**
     * create builder for OrderSetOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetOrderNumberActionBuilder of(final OrderSetOrderNumberAction template) {
        OrderSetOrderNumberActionBuilder builder = new OrderSetOrderNumberActionBuilder();
        builder.orderNumber = template.getOrderNumber();
        return builder;
    }

}
