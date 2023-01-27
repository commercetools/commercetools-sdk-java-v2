
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetPurchaseOrderNumberAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetPurchaseOrderNumberAction stagedOrderSetPurchaseOrderNumberAction = StagedOrderSetPurchaseOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetPurchaseOrderNumberActionImpl.class)
public interface StagedOrderSetPurchaseOrderNumberAction extends StagedOrderUpdateAction {

    String SET_PURCHASE_ORDER_NUMBER = "setPurchaseOrderNumber";

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    public static StagedOrderSetPurchaseOrderNumberAction of() {
        return new StagedOrderSetPurchaseOrderNumberActionImpl();
    }

    public static StagedOrderSetPurchaseOrderNumberAction of(final StagedOrderSetPurchaseOrderNumberAction template) {
        StagedOrderSetPurchaseOrderNumberActionImpl instance = new StagedOrderSetPurchaseOrderNumberActionImpl();
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        return instance;
    }

    public static StagedOrderSetPurchaseOrderNumberActionBuilder builder() {
        return StagedOrderSetPurchaseOrderNumberActionBuilder.of();
    }

    public static StagedOrderSetPurchaseOrderNumberActionBuilder builder(
            final StagedOrderSetPurchaseOrderNumberAction template) {
        return StagedOrderSetPurchaseOrderNumberActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetPurchaseOrderNumberAction(
            Function<StagedOrderSetPurchaseOrderNumberAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetPurchaseOrderNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetPurchaseOrderNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetPurchaseOrderNumberAction>";
            }
        };
    }
}
