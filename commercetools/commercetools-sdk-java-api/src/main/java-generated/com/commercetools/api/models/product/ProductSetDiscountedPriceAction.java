package com.commercetools.api.models.product;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetDiscountedPriceActionImpl;

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
@JsonDeserialize(as = ProductSetDiscountedPriceActionImpl.class)
public interface ProductSetDiscountedPriceAction extends ProductUpdateAction {

    
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();
    
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    public void setPriceId(final String priceId);
    
    public void setStaged(final Boolean staged);
    
    public void setDiscounted(final DiscountedPrice discounted);

    public static ProductSetDiscountedPriceActionImpl of(){
        return new ProductSetDiscountedPriceActionImpl();
    }
    

    public static ProductSetDiscountedPriceActionImpl of(final ProductSetDiscountedPriceAction template) {
        ProductSetDiscountedPriceActionImpl instance = new ProductSetDiscountedPriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    default <T extends Accessor<ProductSetDiscountedPriceAction>> T withProductSetDiscountedPriceAction(Function<ProductSetDiscountedPriceAction, T> helper) {
        return helper.apply(this);
    }
}
