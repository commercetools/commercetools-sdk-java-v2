
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditNotProcessedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditNotProcessed orderEditNotProcessed = OrderEditNotProcessed.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditNotProcessedBuilder implements Builder<OrderEditNotProcessed> {

    public OrderEditNotProcessed build() {
        return new OrderEditNotProcessedImpl();
    }

    /**
     * builds OrderEditNotProcessed without checking for non null required values
     */
    public OrderEditNotProcessed buildUnchecked() {
        return new OrderEditNotProcessedImpl();
    }

    public static OrderEditNotProcessedBuilder of() {
        return new OrderEditNotProcessedBuilder();
    }

    public static OrderEditNotProcessedBuilder of(final OrderEditNotProcessed template) {
        OrderEditNotProcessedBuilder builder = new OrderEditNotProcessedBuilder();
        return builder;
    }

}
