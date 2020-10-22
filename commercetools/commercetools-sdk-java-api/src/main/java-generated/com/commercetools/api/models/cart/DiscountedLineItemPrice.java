package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.DiscountedLineItemPortion;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.cart.DiscountedLineItemPriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountedLineItemPriceImpl.class)
public interface DiscountedLineItemPrice  {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();
    
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    public void setValue(final TypedMoney value);
    
    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    public static DiscountedLineItemPriceImpl of(){
        return new DiscountedLineItemPriceImpl();
    }
    

    public static DiscountedLineItemPriceImpl of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceImpl instance = new DiscountedLineItemPriceImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    default <T extends Accessor<DiscountedLineItemPrice>> T withDiscountedLineItemPrice(Function<DiscountedLineItemPrice, T> helper) {
        return helper.apply(this);
    }
}
