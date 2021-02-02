
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCustomShippingMethodActionImpl.class)
public interface StagedOrderSetCustomShippingMethodAction extends StagedOrderUpdateAction {

    String SET_CUSTOM_SHIPPING_METHOD = "setCustomShippingMethod";

    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setShippingMethodName(final String shippingMethodName);

    public void setShippingRate(final ShippingRateDraft shippingRate);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetCustomShippingMethodAction of() {
        return new StagedOrderSetCustomShippingMethodActionImpl();
    }

    public static StagedOrderSetCustomShippingMethodAction of(final StagedOrderSetCustomShippingMethodAction template) {
        StagedOrderSetCustomShippingMethodActionImpl instance = new StagedOrderSetCustomShippingMethodActionImpl();
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetCustomShippingMethodActionBuilder builder() {
        return StagedOrderSetCustomShippingMethodActionBuilder.of();
    }

    public static StagedOrderSetCustomShippingMethodActionBuilder builder(
            final StagedOrderSetCustomShippingMethodAction template) {
        return StagedOrderSetCustomShippingMethodActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetCustomShippingMethodAction(
            Function<StagedOrderSetCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }
}
