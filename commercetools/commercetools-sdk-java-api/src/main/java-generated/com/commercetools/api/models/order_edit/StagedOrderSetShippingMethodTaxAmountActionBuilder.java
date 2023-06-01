package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingMethodTaxAmountAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingMethodTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodTaxAmountAction stagedOrderSetShippingMethodTaxAmountAction = StagedOrderSetShippingMethodTaxAmountAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetShippingMethodTaxAmountActionBuilder implements Builder<StagedOrderSetShippingMethodTaxAmountAction> {

    
    @Nullable
    private String shippingKey;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    
    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Orders with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodTaxAmountActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodTaxAmountActionBuilder externalTaxAmount(Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     * @param builder function to build the externalTaxAmount value
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodTaxAmountActionBuilder withExternalTaxAmount(Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraft> builder) {
        this.externalTaxAmount = builder.apply(com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     * @param externalTaxAmount value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingMethodTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }
    
    

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Orders with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    
    @Nullable
    public String getShippingKey(){
        return this.shippingKey;
    }
    
    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     * @return externalTaxAmount
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount(){
        return this.externalTaxAmount;
    }

    /**
     * builds StagedOrderSetShippingMethodTaxAmountAction with checking for non-null required values
     * @return StagedOrderSetShippingMethodTaxAmountAction
     */
    public StagedOrderSetShippingMethodTaxAmountAction build() {
        return new StagedOrderSetShippingMethodTaxAmountActionImpl(shippingKey, externalTaxAmount);
    }
    
    /**
     * builds StagedOrderSetShippingMethodTaxAmountAction without checking for non-null required values
     * @return StagedOrderSetShippingMethodTaxAmountAction
     */
    public StagedOrderSetShippingMethodTaxAmountAction buildUnchecked() {
        return new StagedOrderSetShippingMethodTaxAmountActionImpl(shippingKey, externalTaxAmount);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingMethodTaxAmountActionBuilder
     * @return builder 
     */
    public static StagedOrderSetShippingMethodTaxAmountActionBuilder of() {
        return new StagedOrderSetShippingMethodTaxAmountActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingMethodTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingMethodTaxAmountActionBuilder of(final StagedOrderSetShippingMethodTaxAmountAction template) {
        StagedOrderSetShippingMethodTaxAmountActionBuilder builder = new StagedOrderSetShippingMethodTaxAmountActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        return builder;
    }

}
