package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductAddExternalImageActionImpl;

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
@JsonDeserialize(as = ProductAddExternalImageActionImpl.class)
public interface ProductAddExternalImageAction extends ProductUpdateAction {

    
    
    @JsonProperty("variantId")
    public Long getVariantId();
    
    
    @JsonProperty("sku")
    public String getSku();
    
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);
    
    public void setSku(final String sku);
    
    public void setImage(final Image image);
    
    public void setStaged(final Boolean staged);

    public static ProductAddExternalImageAction of(){
        return new ProductAddExternalImageActionImpl();
    }
    

    public static ProductAddExternalImageAction of(final ProductAddExternalImageAction template) {
        ProductAddExternalImageActionImpl instance = new ProductAddExternalImageActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductAddExternalImageActionBuilder builder(){
        return ProductAddExternalImageActionBuilder.of();
    }
    
    public static ProductAddExternalImageActionBuilder builder(final ProductAddExternalImageAction template){
        return ProductAddExternalImageActionBuilder.of(template);
    }
    

    default <T> T withProductAddExternalImageAction(Function<ProductAddExternalImageAction, T> helper) {
        return helper.apply(this);
    }
}
