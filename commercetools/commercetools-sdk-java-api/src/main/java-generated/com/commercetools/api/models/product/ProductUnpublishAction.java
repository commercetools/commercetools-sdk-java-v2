package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductUnpublishActionImpl;

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
@JsonDeserialize(as = ProductUnpublishActionImpl.class)
public interface ProductUnpublishAction extends ProductUpdateAction {



    public static ProductUnpublishActionImpl of(){
        return new ProductUnpublishActionImpl();
    }
    

    public static ProductUnpublishActionImpl of(final ProductUnpublishAction template) {
        ProductUnpublishActionImpl instance = new ProductUnpublishActionImpl();
        return instance;
    }

    default <T extends Accessor<ProductUnpublishAction>> T withProductUnpublishAction(Function<ProductUnpublishAction, T> helper) {
        return helper.apply(this);
    }
}
