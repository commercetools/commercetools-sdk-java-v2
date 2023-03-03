
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetLineItemTaxAmountAction
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLineItemTaxAmountActionImpl.class)
public interface StagedOrderSetLineItemTaxAmountAction extends StagedOrderUpdateAction {

    String SET_LINE_ITEM_TAX_AMOUNT = "setLineItemTaxAmount";

    /**
     *
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
     *  <p>Can only be set by these update actions:</p>
     *  <ul>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
     *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item.``` This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setLineItemId(final String lineItemId);

    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public void setShippingKey(final String shippingKey);

    public static StagedOrderSetLineItemTaxAmountAction of() {
        return new StagedOrderSetLineItemTaxAmountActionImpl();
    }

    public static StagedOrderSetLineItemTaxAmountAction of(final StagedOrderSetLineItemTaxAmountAction template) {
        StagedOrderSetLineItemTaxAmountActionImpl instance = new StagedOrderSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder builder() {
        return StagedOrderSetLineItemTaxAmountActionBuilder.of();
    }

    public static StagedOrderSetLineItemTaxAmountActionBuilder builder(
            final StagedOrderSetLineItemTaxAmountAction template) {
        return StagedOrderSetLineItemTaxAmountActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLineItemTaxAmountAction(Function<StagedOrderSetLineItemTaxAmountAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTaxAmountAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLineItemTaxAmountAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLineItemTaxAmountAction>";
            }
        };
    }
}
