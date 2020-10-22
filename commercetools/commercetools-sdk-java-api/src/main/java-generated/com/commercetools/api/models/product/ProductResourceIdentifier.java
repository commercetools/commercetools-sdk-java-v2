package com.commercetools.api.models.product;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifierImpl;

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
@JsonDeserialize(as = ProductResourceIdentifierImpl.class)
public interface ProductResourceIdentifier extends ResourceIdentifier {



    public static ProductResourceIdentifierImpl of(){
        return new ProductResourceIdentifierImpl();
    }
    

    public static ProductResourceIdentifierImpl of(final ProductResourceIdentifier template) {
        ProductResourceIdentifierImpl instance = new ProductResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    default <T extends Accessor<ProductResourceIdentifier>> T withProductResourceIdentifier(Function<ProductResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
