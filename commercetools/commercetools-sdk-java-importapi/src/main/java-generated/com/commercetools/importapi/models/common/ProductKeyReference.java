package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ProductKeyReferenceImpl;

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

/**
*  <p>References a product by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductKeyReferenceImpl.class)
public interface ProductKeyReference extends KeyReference {



    public static ProductKeyReferenceImpl of(){
        return new ProductKeyReferenceImpl();
    }
    

    public static ProductKeyReferenceImpl of(final ProductKeyReference template) {
        ProductKeyReferenceImpl instance = new ProductKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withProductKeyReference(Function<ProductKeyReference, T> helper) {
        return helper.apply(this);
    }
}
