package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductChangePriceActionImpl;

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
@JsonDeserialize(as = ProductChangePriceActionImpl.class)
public interface ProductChangePriceAction extends ProductUpdateAction {

    /**
    *  <p>ID of the <a href="#price">Price</a></p>
    */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();
    
    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setPriceId(final String priceId);
    
    public void setPrice(final PriceDraft price);
    
    public void setStaged(final Boolean staged);

    public static ProductChangePriceAction of(){
        return new ProductChangePriceActionImpl();
    }
    

    public static ProductChangePriceAction of(final ProductChangePriceAction template) {
        ProductChangePriceActionImpl instance = new ProductChangePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductChangePriceActionBuilder builder(){
        return ProductChangePriceActionBuilder.of();
    }
    
    public static ProductChangePriceActionBuilder builder(final ProductChangePriceAction template){
        return ProductChangePriceActionBuilder.of(template);
    }
    

    default <T> T withProductChangePriceAction(Function<ProductChangePriceAction, T> helper) {
        return helper.apply(this);
    }
}
