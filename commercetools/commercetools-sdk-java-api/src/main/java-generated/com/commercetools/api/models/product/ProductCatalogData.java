package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductData;
import com.commercetools.api.models.product.ProductCatalogDataImpl;

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
@JsonDeserialize(as = ProductCatalogDataImpl.class)
public interface ProductCatalogData  {

    
    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();
    
    @NotNull
    @Valid
    @JsonProperty("current")
    public ProductData getCurrent();
    
    @NotNull
    @Valid
    @JsonProperty("staged")
    public ProductData getStaged();
    
    @NotNull
    @JsonProperty("hasStagedChanges")
    public Boolean getHasStagedChanges();

    public void setPublished(final Boolean published);
    
    public void setCurrent(final ProductData current);
    
    public void setStaged(final ProductData staged);
    
    public void setHasStagedChanges(final Boolean hasStagedChanges);

    public static ProductCatalogDataImpl of(){
        return new ProductCatalogDataImpl();
    }
    

    public static ProductCatalogDataImpl of(final ProductCatalogData template) {
        ProductCatalogDataImpl instance = new ProductCatalogDataImpl();
        instance.setPublished(template.getPublished());
        instance.setCurrent(template.getCurrent());
        instance.setStaged(template.getStaged());
        instance.setHasStagedChanges(template.getHasStagedChanges());
        return instance;
    }

    default <T> T withProductCatalogData(Function<ProductCatalogData, T> helper) {
        return helper.apply(this);
    }
}
