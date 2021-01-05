package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductUnpublishActionImpl;

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
@JsonDeserialize(as = ProductUnpublishActionImpl.class)
public interface ProductUnpublishAction extends ProductUpdateAction {



    public static ProductUnpublishAction of(){
        return new ProductUnpublishActionImpl();
    }
    

    public static ProductUnpublishAction of(final ProductUnpublishAction template) {
        ProductUnpublishActionImpl instance = new ProductUnpublishActionImpl();
        return instance;
    }

    public static ProductUnpublishActionBuilder builder(){
        return ProductUnpublishActionBuilder.of();
    }
    
    public static ProductUnpublishActionBuilder builder(final ProductUnpublishAction template){
        return ProductUnpublishActionBuilder.of(template);
    }
    

    default <T> T withProductUnpublishAction(Function<ProductUnpublishAction, T> helper) {
        return helper.apply(this);
    }
}
