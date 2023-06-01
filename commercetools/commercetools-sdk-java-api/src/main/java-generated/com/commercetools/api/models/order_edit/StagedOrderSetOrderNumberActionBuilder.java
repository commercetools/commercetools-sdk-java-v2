package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetOrderNumberAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetOrderNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetOrderNumberAction stagedOrderSetOrderNumberAction = StagedOrderSetOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetOrderNumberActionBuilder implements Builder<StagedOrderSetOrderNumberAction> {

    
    @Nullable
    private String orderNumber;

    
    /**
     * set the value to the orderNumber
     * @param orderNumber value to be set
     * @return Builder
     */
    
    public StagedOrderSetOrderNumberActionBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    
    

    /**
     * value of orderNumber}
     * @return orderNumber
     */
    
    @Nullable
    public String getOrderNumber(){
        return this.orderNumber;
    }

    /**
     * builds StagedOrderSetOrderNumberAction with checking for non-null required values
     * @return StagedOrderSetOrderNumberAction
     */
    public StagedOrderSetOrderNumberAction build() {
        return new StagedOrderSetOrderNumberActionImpl(orderNumber);
    }
    
    /**
     * builds StagedOrderSetOrderNumberAction without checking for non-null required values
     * @return StagedOrderSetOrderNumberAction
     */
    public StagedOrderSetOrderNumberAction buildUnchecked() {
        return new StagedOrderSetOrderNumberActionImpl(orderNumber);
    }

    /**
     * factory method for an instance of StagedOrderSetOrderNumberActionBuilder
     * @return builder 
     */
    public static StagedOrderSetOrderNumberActionBuilder of() {
        return new StagedOrderSetOrderNumberActionBuilder();
    }

    /**
     * create builder for StagedOrderSetOrderNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetOrderNumberActionBuilder of(final StagedOrderSetOrderNumberAction template) {
        StagedOrderSetOrderNumberActionBuilder builder = new StagedOrderSetOrderNumberActionBuilder();
        builder.orderNumber = template.getOrderNumber();
        return builder;
    }

}
