
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl.class)
public interface StagedOrderSetShippingAddressAndCustomShippingMethodAction extends StagedOrderUpdateAction {

    String SET_SHIPPING_ADDRESS_AND_CUSTOM_SHIPPING_METHOD = "setShippingAddressAndCustomShippingMethod";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    @NotNull
    @JsonProperty("shippingMethodName")
    public String getShippingMethodName();

    @NotNull
    @Valid
    @JsonProperty("shippingRate")
    public ShippingRateDraft getShippingRate();

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:TaxCategory">TaxCategory</a>.</p>
    */
    @Valid
    @JsonProperty("taxCategory")
    public TaxCategoryResourceIdentifier getTaxCategory();

    @Valid
    @JsonProperty("externalTaxRate")
    public ExternalTaxRateDraft getExternalTaxRate();

    public void setAddress(final BaseAddress address);

    public void setShippingMethodName(final String shippingMethodName);

    public void setShippingRate(final ShippingRateDraft shippingRate);

    public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);

    public void setExternalTaxRate(final ExternalTaxRateDraft externalTaxRate);

    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction of() {
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
    }

    public static StagedOrderSetShippingAddressAndCustomShippingMethodAction of(
            final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl instance = new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl();
        instance.setAddress(template.getAddress());
        instance.setShippingMethodName(template.getShippingMethodName());
        instance.setShippingRate(template.getShippingRate());
        instance.setTaxCategory(template.getTaxCategory());
        instance.setExternalTaxRate(template.getExternalTaxRate());
        return instance;
    }

    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder() {
        return StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of();
    }

    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder(
            final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        return StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetShippingAddressAndCustomShippingMethodAction(
            Function<StagedOrderSetShippingAddressAndCustomShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressAndCustomShippingMethodAction>";
            }
        };
    }
}
