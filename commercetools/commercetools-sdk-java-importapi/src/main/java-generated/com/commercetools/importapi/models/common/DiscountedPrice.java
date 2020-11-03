package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.ProductDiscountKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.common.DiscountedPriceImpl;

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
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice  {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();
    /**
    *  <p>Reference to a ProductDiscount.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountKeyReference getDiscount();

    public void setValue(final TypedMoney value);
    
    public void setDiscount(final ProductDiscountKeyReference discount);

    public static DiscountedPriceImpl of(){
        return new DiscountedPriceImpl();
    }
    

    public static DiscountedPriceImpl of(final DiscountedPrice template) {
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    default <T> T withDiscountedPrice(Function<DiscountedPrice, T> helper) {
        return helper.apply(this);
    }
}
