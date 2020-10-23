package com.commercetools.api.models.message;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPriceImpl;

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
@JsonDeserialize(as = ProductPriceDiscountsSetUpdatedPriceImpl.class)
public interface ProductPriceDiscountsSetUpdatedPrice  {

    
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();
    
    
    @JsonProperty("variantKey")
    public String getVariantKey();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();
    
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();
    
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Integer variantId);
    
    public void setVariantKey(final String variantKey);
    
    public void setSku(final String sku);
    
    public void setPriceId(final String priceId);
    
    public void setDiscounted(final DiscountedPrice discounted);
    
    public void setStaged(final Boolean staged);

    public static ProductPriceDiscountsSetUpdatedPriceImpl of(){
        return new ProductPriceDiscountsSetUpdatedPriceImpl();
    }
    

    public static ProductPriceDiscountsSetUpdatedPriceImpl of(final ProductPriceDiscountsSetUpdatedPrice template) {
        ProductPriceDiscountsSetUpdatedPriceImpl instance = new ProductPriceDiscountsSetUpdatedPriceImpl();
        instance.setVariantId(template.getVariantId());
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(template.getDiscounted());
        instance.setStaged(template.getStaged());
        return instance;
    }

    default <T> T withProductPriceDiscountsSetUpdatedPrice(Function<ProductPriceDiscountsSetUpdatedPrice, T> helper) {
        return helper.apply(this);
    }
}
