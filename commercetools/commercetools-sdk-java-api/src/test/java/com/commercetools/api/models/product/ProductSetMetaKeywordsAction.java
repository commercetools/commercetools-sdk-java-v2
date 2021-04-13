package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetMetaKeywordsActionImpl;

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
@JsonDeserialize(as = ProductSetMetaKeywordsActionImpl.class)
public interface ProductSetMetaKeywordsAction extends ProductUpdateAction {

    String SET_META_KEYWORDS = "setMetaKeywords";

    
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();
    
    
    @JsonProperty("staged")
    public Boolean getStaged();

    
    public void setMetaKeywords(final LocalizedString metaKeywords);
    
    
    
    public void setStaged(final Boolean staged);
    

    public static ProductSetMetaKeywordsAction of(){
        return new ProductSetMetaKeywordsActionImpl();
    }
    

    public static ProductSetMetaKeywordsAction of(final ProductSetMetaKeywordsAction template) {
        ProductSetMetaKeywordsActionImpl instance = new ProductSetMetaKeywordsActionImpl();
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetMetaKeywordsActionBuilder builder(){
        return ProductSetMetaKeywordsActionBuilder.of();
    }
    
    public static ProductSetMetaKeywordsActionBuilder builder(final ProductSetMetaKeywordsAction template){
        return ProductSetMetaKeywordsActionBuilder.of(template);
    }
    

    default <T> T withProductSetMetaKeywordsAction(Function<ProductSetMetaKeywordsAction, T> helper) {
        return helper.apply(this);
    }
}
