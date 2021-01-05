package com.commercetools.api.models.message;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadImpl;

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
@JsonDeserialize(as = ProductPriceExternalDiscountSetMessagePayloadImpl.class)
public interface ProductPriceExternalDiscountSetMessagePayload extends MessagePayload {

    
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

    public static ProductPriceExternalDiscountSetMessagePayload of(){
        return new ProductPriceExternalDiscountSetMessagePayloadImpl();
    }
    

    public static ProductPriceExternalDiscountSetMessagePayload of(final ProductPriceExternalDiscountSetMessagePayload template) {
        ProductPriceExternalDiscountSetMessagePayloadImpl instance = new ProductPriceExternalDiscountSetMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(template.getDiscounted());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPriceExternalDiscountSetMessagePayloadBuilder builder(){
        return ProductPriceExternalDiscountSetMessagePayloadBuilder.of();
    }
    
    public static ProductPriceExternalDiscountSetMessagePayloadBuilder builder(final ProductPriceExternalDiscountSetMessagePayload template){
        return ProductPriceExternalDiscountSetMessagePayloadBuilder.of(template);
    }
    

    default <T> T withProductPriceExternalDiscountSetMessagePayload(Function<ProductPriceExternalDiscountSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
