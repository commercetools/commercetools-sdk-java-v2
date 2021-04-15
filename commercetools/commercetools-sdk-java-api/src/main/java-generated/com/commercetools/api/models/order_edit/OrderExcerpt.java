package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.order_edit.OrderExcerptImpl;

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
@JsonDeserialize(as = OrderExcerptImpl.class)
public interface OrderExcerpt  {


    
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();
    
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();
    
    @NotNull
    @JsonProperty("version")
    public Integer getVersion();

    
    public void setTotalPrice(final TypedMoney totalPrice);
    
    
    
    public void setTaxedPrice(final TaxedPrice taxedPrice);
    
    
    
    public void setVersion(final Integer version);
    

    public static OrderExcerpt of(){
        return new OrderExcerptImpl();
    }
    

    public static OrderExcerpt of(final OrderExcerpt template) {
        OrderExcerptImpl instance = new OrderExcerptImpl();
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public static OrderExcerptBuilder builder(){
        return OrderExcerptBuilder.of();
    }
    
    public static OrderExcerptBuilder builder(final OrderExcerpt template){
        return OrderExcerptBuilder.of(template);
    }
    

    default <T> T withOrderExcerpt(Function<OrderExcerpt, T> helper) {
        return helper.apply(this);
    }
}
