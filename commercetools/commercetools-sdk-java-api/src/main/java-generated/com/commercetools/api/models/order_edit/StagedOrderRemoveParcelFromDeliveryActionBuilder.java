package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveParcelFromDeliveryAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveParcelFromDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveParcelFromDeliveryAction stagedOrderRemoveParcelFromDeliveryAction = StagedOrderRemoveParcelFromDeliveryAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderRemoveParcelFromDeliveryActionBuilder implements Builder<StagedOrderRemoveParcelFromDeliveryAction> {

    
    
    private String parcelId;

    
    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */
    
    public StagedOrderRemoveParcelFromDeliveryActionBuilder parcelId( final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }
    
    

    /**
     * value of parcelId}
     * @return parcelId
     */
    
    
    public String getParcelId(){
        return this.parcelId;
    }

    /**
     * builds StagedOrderRemoveParcelFromDeliveryAction with checking for non-null required values
     * @return StagedOrderRemoveParcelFromDeliveryAction
     */
    public StagedOrderRemoveParcelFromDeliveryAction build() {
        Objects.requireNonNull(parcelId, StagedOrderRemoveParcelFromDeliveryAction.class + ": parcelId is missing");
        return new StagedOrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }
    
    /**
     * builds StagedOrderRemoveParcelFromDeliveryAction without checking for non-null required values
     * @return StagedOrderRemoveParcelFromDeliveryAction
     */
    public StagedOrderRemoveParcelFromDeliveryAction buildUnchecked() {
        return new StagedOrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    /**
     * factory method for an instance of StagedOrderRemoveParcelFromDeliveryActionBuilder
     * @return builder 
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder of() {
        return new StagedOrderRemoveParcelFromDeliveryActionBuilder();
    }

    /**
     * create builder for StagedOrderRemoveParcelFromDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder of(final StagedOrderRemoveParcelFromDeliveryAction template) {
        StagedOrderRemoveParcelFromDeliveryActionBuilder builder = new StagedOrderRemoveParcelFromDeliveryActionBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
