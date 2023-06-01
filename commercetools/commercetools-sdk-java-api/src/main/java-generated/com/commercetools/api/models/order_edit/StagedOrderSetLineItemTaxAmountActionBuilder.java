package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLineItemTaxAmountAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemTaxAmountActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLineItemTaxAmountAction stagedOrderSetLineItemTaxAmountAction = StagedOrderSetLineItemTaxAmountAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetLineItemTaxAmountActionBuilder implements Builder<StagedOrderSetLineItemTaxAmountAction> {

    
    
    private String lineItemId;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;
    
    
    @Nullable
    private String shippingKey;

    
    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */
    
    public StagedOrderSetLineItemTaxAmountActionBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
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
    
    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder> builder) {
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
    
    public StagedOrderSetLineItemTaxAmountActionBuilder withExternalTaxAmount(Function<com.commercetools.api.models.cart.ExternalTaxAmountDraftBuilder, com.commercetools.api.models.cart.ExternalTaxAmountDraft> builder) {
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
    
    public StagedOrderSetLineItemTaxAmountActionBuilder externalTaxAmount(@Nullable final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item.``` This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */
    
    public StagedOrderSetLineItemTaxAmountActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }
    
    

    /**
     * value of lineItemId}
     * @return lineItemId
     */
    
    
    public String getLineItemId(){
        return this.lineItemId;
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
     *  <p><code>key</code> of the ShippingMethod used for this Line Item.``` This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */
    
    @Nullable
    public String getShippingKey(){
        return this.shippingKey;
    }

    /**
     * builds StagedOrderSetLineItemTaxAmountAction with checking for non-null required values
     * @return StagedOrderSetLineItemTaxAmountAction
     */
    public StagedOrderSetLineItemTaxAmountAction build() {
        Objects.requireNonNull(lineItemId, StagedOrderSetLineItemTaxAmountAction.class + ": lineItemId is missing");
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount, shippingKey);
    }
    
    /**
     * builds StagedOrderSetLineItemTaxAmountAction without checking for non-null required values
     * @return StagedOrderSetLineItemTaxAmountAction
     */
    public StagedOrderSetLineItemTaxAmountAction buildUnchecked() {
        return new StagedOrderSetLineItemTaxAmountActionImpl(lineItemId, externalTaxAmount, shippingKey);
    }

    /**
     * factory method for an instance of StagedOrderSetLineItemTaxAmountActionBuilder
     * @return builder 
     */
    public static StagedOrderSetLineItemTaxAmountActionBuilder of() {
        return new StagedOrderSetLineItemTaxAmountActionBuilder();
    }

    /**
     * create builder for StagedOrderSetLineItemTaxAmountAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLineItemTaxAmountActionBuilder of(final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionBuilder builder = new StagedOrderSetLineItemTaxAmountActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalTaxAmount = template.getExternalTaxAmount();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
