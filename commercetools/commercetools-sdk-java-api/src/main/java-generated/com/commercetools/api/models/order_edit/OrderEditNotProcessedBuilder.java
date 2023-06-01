package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditResult;
import com.commercetools.api.models.order_edit.OrderEditNotProcessed;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderEditNotProcessedBuilder implements Builder<OrderEditNotProcessed> {




    /**
     * builds OrderEditNotProcessed with checking for non-null required values
     * @return OrderEditNotProcessed
     */
    public OrderEditNotProcessed build() {
        return new OrderEditNotProcessedImpl();
    }
    
    /**
     * builds OrderEditNotProcessed without checking for non-null required values
     * @return OrderEditNotProcessed
     */
    public OrderEditNotProcessed buildUnchecked() {
        return new OrderEditNotProcessedImpl();
    }

    /**
     * factory method for an instance of OrderEditNotProcessedBuilder
     * @return builder 
     */
    public static OrderEditNotProcessedBuilder of() {
        return new OrderEditNotProcessedBuilder();
    }

    /**
     * create builder for OrderEditNotProcessed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditNotProcessedBuilder of(final OrderEditNotProcessed template) {
        OrderEditNotProcessedBuilder builder = new OrderEditNotProcessedBuilder();
        return builder;
    }

}
