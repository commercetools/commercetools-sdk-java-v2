package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveDeliveryAction stagedOrderRemoveDeliveryAction = StagedOrderRemoveDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderRemoveDeliveryActionBuilder implements Builder<StagedOrderRemoveDeliveryAction> {

    
    @Nullable
    private String deliveryId;
    
    
    @Nullable
    private String deliveryKey;

    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     * @return Builder
     */
    
    public StagedOrderRemoveDeliveryActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */
    
    public StagedOrderRemoveDeliveryActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }
    
    

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */
    
    @Nullable
    public String getDeliveryId(){
        return this.deliveryId;
    }
    
    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */
    
    @Nullable
    public String getDeliveryKey(){
        return this.deliveryKey;
    }

    /**
     * builds StagedOrderRemoveDeliveryAction with checking for non-null required values
     * @return StagedOrderRemoveDeliveryAction
     */
    public StagedOrderRemoveDeliveryAction build() {
        return new StagedOrderRemoveDeliveryActionImpl(deliveryId, deliveryKey);
    }
    
    /**
     * builds StagedOrderRemoveDeliveryAction without checking for non-null required values
     * @return StagedOrderRemoveDeliveryAction
     */
    public StagedOrderRemoveDeliveryAction buildUnchecked() {
        return new StagedOrderRemoveDeliveryActionImpl(deliveryId, deliveryKey);
    }

    /**
     * factory method for an instance of StagedOrderRemoveDeliveryActionBuilder
     * @return builder 
     */
    public static StagedOrderRemoveDeliveryActionBuilder of() {
        return new StagedOrderRemoveDeliveryActionBuilder();
    }

    /**
     * create builder for StagedOrderRemoveDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveDeliveryActionBuilder of(final StagedOrderRemoveDeliveryAction template) {
        StagedOrderRemoveDeliveryActionBuilder builder = new StagedOrderRemoveDeliveryActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        return builder;
    }

}
