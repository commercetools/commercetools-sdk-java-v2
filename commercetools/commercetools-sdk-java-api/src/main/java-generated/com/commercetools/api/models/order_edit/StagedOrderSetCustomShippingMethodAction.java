
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>To set the Cart's custom Shipping Method (independent of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethods</a> managed through the <span>Shipping Methods API</span>) the Cart must have the <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a> and a <code>shippingAddress</code>.</p>
 *  <p>To unset a custom Shipping Method on a Cart, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set ShippingMethod</a> update action without the <code>shippingMethod</code> field instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomShippingMethodAction stagedOrderSetCustomShippingMethodAction = StagedOrderSetCustomShippingMethodAction.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomShippingMethod")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomShippingMethodActionImpl.class)
public interface StagedOrderSetCustomShippingMethodAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCustomShippingMethodAction
     */
    String SET_CUSTOM_SHIPPING_METHOD = "setCustomShippingMethod";

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @return shippingMethodName
     */
    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    /**
     *  <p>Determines the shipping price.</p>
     * @return shippingRate
     */
    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return taxCategory
     */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return externalTaxRate
     */
    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @param shippingMethodName value to be set
     */

    public void setShippingMethodName(final String shippingMethodName);

    /**
     *  <p>Determines the shipping price.</p>
     * @param shippingRate value to be set
     */

    public void setShippingRate(final ShippingRateDraft shippingRate);

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param taxCategory value to be set
     */

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param externalTaxRate value to be set
     */

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of StagedOrderSetCustomShippingMethodAction
     */
    public static StagedOrderSetCustomShippingMethodAction of() {
        return new StagedOrderSetCustomShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCustomShippingMethodAction of(final StagedOrderSetCustomShippingMethodAction template) {
        StagedOrderSetCustomShippingMethodActionImpl instance = new StagedOrderSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public StagedOrderSetCustomShippingMethodAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetCustomShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCustomShippingMethodAction deepCopy(
            @Nullable final StagedOrderSetCustomShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCustomShippingMethodActionImpl instance = new StagedOrderSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(
            com.commercetools.api.models.shipping_method.ShippingRateDraft.deepCopy(template.getShippingRate()));
        instance.setTaxCategory(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier
                .deepCopy(template.getTaxCategory()));
        instance.setExternalTaxRate(
            com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getExternalTaxRate()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCustomShippingMethodAction
     * @return builder
     */
    public static StagedOrderSetCustomShippingMethodActionBuilder builder() {
        return StagedOrderSetCustomShippingMethodActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomShippingMethodActionBuilder builder(
            final StagedOrderSetCustomShippingMethodAction template) {
        return StagedOrderSetCustomShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCustomShippingMethodAction(
            Function<StagedOrderSetCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCustomShippingMethodAction>";
            }
        };
    }
}
