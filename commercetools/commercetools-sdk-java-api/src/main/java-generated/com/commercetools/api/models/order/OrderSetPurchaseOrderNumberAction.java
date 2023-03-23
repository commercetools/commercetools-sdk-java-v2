
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetPurchaseOrderNumberAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetPurchaseOrderNumberAction orderSetPurchaseOrderNumberAction = OrderSetPurchaseOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetPurchaseOrderNumberActionImpl.class)
public interface OrderSetPurchaseOrderNumberAction extends OrderUpdateAction {

    String SET_PURCHASE_ORDER_NUMBER = "setPurchaseOrderNumber";

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    public static OrderSetPurchaseOrderNumberAction of() {
        return new OrderSetPurchaseOrderNumberActionImpl();
    }

    public static OrderSetPurchaseOrderNumberAction of(final OrderSetPurchaseOrderNumberAction template) {
        OrderSetPurchaseOrderNumberActionImpl instance = new OrderSetPurchaseOrderNumberActionImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    public static OrderSetPurchaseOrderNumberActionBuilder builder() {
        return OrderSetPurchaseOrderNumberActionBuilder.of();
    }

    public static OrderSetPurchaseOrderNumberActionBuilder builder(final OrderSetPurchaseOrderNumberAction template) {
        return OrderSetPurchaseOrderNumberActionBuilder.of(template);
    }

    default <T> T withOrderSetPurchaseOrderNumberAction(Function<OrderSetPurchaseOrderNumberAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetPurchaseOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetPurchaseOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetPurchaseOrderNumberAction>";
            }
        };
    }
}
