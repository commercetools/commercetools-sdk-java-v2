package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.DiscountedLineItemPortion;
import com.commercetools.importapi.models.orders.DiscountedLineItemPriceDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountedLineItemPriceDraftImpl.class)
public interface DiscountedLineItemPriceDraft  {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();
    
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    public void setValue(final Money value);
    
    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortion ...includedDiscounts);
    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    public static DiscountedLineItemPriceDraftImpl of(){
        return new DiscountedLineItemPriceDraftImpl();
    }
    

    public static DiscountedLineItemPriceDraftImpl of(final DiscountedLineItemPriceDraft template) {
        DiscountedLineItemPriceDraftImpl instance = new DiscountedLineItemPriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    default <T> T withDiscountedLineItemPriceDraft(Function<DiscountedLineItemPriceDraft, T> helper) {
        return helper.apply(this);
    }
}
