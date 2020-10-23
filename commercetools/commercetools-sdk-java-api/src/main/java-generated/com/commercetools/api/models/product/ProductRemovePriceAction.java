package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductRemovePriceActionImpl;

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
@JsonDeserialize(as = ProductRemovePriceActionImpl.class)
public interface ProductRemovePriceAction extends ProductUpdateAction {

    /**
    *  <p>ID of the <a href="#price">Price</a></p>
    */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setPriceId(final String priceId);
    
    public void setStaged(final Boolean staged);

    public static ProductRemovePriceActionImpl of(){
        return new ProductRemovePriceActionImpl();
    }
    

    public static ProductRemovePriceActionImpl of(final ProductRemovePriceAction template) {
        ProductRemovePriceActionImpl instance = new ProductRemovePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductRemovePriceAction(Function<ProductRemovePriceAction, T> helper) {
        return helper.apply(this);
    }
}
