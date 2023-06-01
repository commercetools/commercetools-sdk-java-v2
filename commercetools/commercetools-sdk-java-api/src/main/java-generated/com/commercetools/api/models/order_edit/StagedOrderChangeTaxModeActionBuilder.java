package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeTaxModeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeTaxModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeTaxModeAction stagedOrderChangeTaxModeAction = StagedOrderChangeTaxModeAction.builder()
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderChangeTaxModeActionBuilder implements Builder<StagedOrderChangeTaxModeAction> {

    
    
    private com.commercetools.api.models.cart.TaxMode taxMode;

    
    /**
     *  <p>Indicates how taxes are set on the Cart.</p>
     * @param taxMode value to be set
     * @return Builder
     */
    
    public StagedOrderChangeTaxModeActionBuilder taxMode( final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }
    
    

    /**
     *  <p>Indicates how taxes are set on the Cart.</p>
     * @return taxMode
     */
    
    
    public com.commercetools.api.models.cart.TaxMode getTaxMode(){
        return this.taxMode;
    }

    /**
     * builds StagedOrderChangeTaxModeAction with checking for non-null required values
     * @return StagedOrderChangeTaxModeAction
     */
    public StagedOrderChangeTaxModeAction build() {
        Objects.requireNonNull(taxMode, StagedOrderChangeTaxModeAction.class + ": taxMode is missing");
        return new StagedOrderChangeTaxModeActionImpl(taxMode);
    }
    
    /**
     * builds StagedOrderChangeTaxModeAction without checking for non-null required values
     * @return StagedOrderChangeTaxModeAction
     */
    public StagedOrderChangeTaxModeAction buildUnchecked() {
        return new StagedOrderChangeTaxModeActionImpl(taxMode);
    }

    /**
     * factory method for an instance of StagedOrderChangeTaxModeActionBuilder
     * @return builder 
     */
    public static StagedOrderChangeTaxModeActionBuilder of() {
        return new StagedOrderChangeTaxModeActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeTaxModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeTaxModeActionBuilder of(final StagedOrderChangeTaxModeAction template) {
        StagedOrderChangeTaxModeActionBuilder builder = new StagedOrderChangeTaxModeActionBuilder();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
