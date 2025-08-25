
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. If no matching tier can be found, or the input is not set, the default price for the shipping rate is used.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingRateInputAction stagedOrderSetShippingRateInputAction = StagedOrderSetShippingRateInputAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setShippingRateInput")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingRateInputActionImpl.class)
public interface StagedOrderSetShippingRateInputAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingRateInputAction
     */
    String SET_SHIPPING_RATE_INPUT = "setShippingRateInput";

    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInputDraft" rel="nofollow">ClassificationShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartScore</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInputDraft" rel="nofollow">ScoreShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInputDraft getShippingRateInput();

    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInputDraft" rel="nofollow">ClassificationShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartScore</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInputDraft" rel="nofollow">ScoreShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     */

    public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingRateInputAction
     */
    public static StagedOrderSetShippingRateInputAction of() {
        return new StagedOrderSetShippingRateInputActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingRateInputAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingRateInputAction of(final StagedOrderSetShippingRateInputAction template) {
        StagedOrderSetShippingRateInputActionImpl instance = new StagedOrderSetShippingRateInputActionImpl();
        instance.setShippingRateInput(template.getShippingRateInput());
        return instance;
    }

    public StagedOrderSetShippingRateInputAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetShippingRateInputAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingRateInputAction deepCopy(
            @Nullable final StagedOrderSetShippingRateInputAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingRateInputActionImpl instance = new StagedOrderSetShippingRateInputActionImpl();
        instance.setShippingRateInput(
            com.commercetools.api.models.cart.ShippingRateInputDraft.deepCopy(template.getShippingRateInput()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingRateInputAction
     * @return builder
     */
    public static StagedOrderSetShippingRateInputActionBuilder builder() {
        return StagedOrderSetShippingRateInputActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingRateInputAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingRateInputActionBuilder builder(
            final StagedOrderSetShippingRateInputAction template) {
        return StagedOrderSetShippingRateInputActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingRateInputAction(Function<StagedOrderSetShippingRateInputAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetShippingRateInputAction ofUnset() {
        return StagedOrderSetShippingRateInputAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingRateInputAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingRateInputAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingRateInputAction>";
            }
        };
    }
}
