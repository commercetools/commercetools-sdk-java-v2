
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for cart discounts gift line item value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeValueGiftLineItemChangeValueImpl.class)
public interface ChangeValueGiftLineItemChangeValue extends ChangeValueChangeValue {

    String GIFT_LINE_ITEM = "giftLineItem";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("product")
    public Reference getProduct();

    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public Reference getSupplyChannel();

    @NotNull
    @Valid
    @JsonProperty("distributionChannel")
    public Reference getDistributionChannel();

    public void setProduct(final Reference product);

    public void setVariantId(final Integer variantId);

    public void setSupplyChannel(final Reference supplyChannel);

    public void setDistributionChannel(final Reference distributionChannel);

    public static ChangeValueGiftLineItemChangeValue of() {
        return new ChangeValueGiftLineItemChangeValueImpl();
    }

    public static ChangeValueGiftLineItemChangeValue of(final ChangeValueGiftLineItemChangeValue template) {
        ChangeValueGiftLineItemChangeValueImpl instance = new ChangeValueGiftLineItemChangeValueImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setDistributionChannel(template.getDistributionChannel());
        return instance;
    }

    public static ChangeValueGiftLineItemChangeValueBuilder builder() {
        return ChangeValueGiftLineItemChangeValueBuilder.of();
    }

    public static ChangeValueGiftLineItemChangeValueBuilder builder(final ChangeValueGiftLineItemChangeValue template) {
        return ChangeValueGiftLineItemChangeValueBuilder.of(template);
    }

    default <T> T withChangeValueGiftLineItemChangeValue(Function<ChangeValueGiftLineItemChangeValue, T> helper) {
        return helper.apply(this);
    }
}
