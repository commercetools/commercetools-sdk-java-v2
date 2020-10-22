package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.product_discount.ProductDiscountValue;
import com.commercetools.api.models.product_discount.ProductDiscountValueAbsoluteImpl;

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
@JsonDeserialize(as = ProductDiscountValueAbsoluteImpl.class)
public interface ProductDiscountValueAbsolute extends ProductDiscountValue {

    
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<TypedMoney> getMoney();

    public void setMoney(final List<TypedMoney> money);

    public static ProductDiscountValueAbsoluteImpl of(){
        return new ProductDiscountValueAbsoluteImpl();
    }
    

    public static ProductDiscountValueAbsoluteImpl of(final ProductDiscountValueAbsolute template) {
        ProductDiscountValueAbsoluteImpl instance = new ProductDiscountValueAbsoluteImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    default <T extends Accessor<ProductDiscountValueAbsolute>> T withProductDiscountValueAbsolute(Function<ProductDiscountValueAbsolute, T> helper) {
        return helper.apply(this);
    }
}
