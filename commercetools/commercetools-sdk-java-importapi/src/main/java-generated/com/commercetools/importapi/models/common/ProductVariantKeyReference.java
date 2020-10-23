package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl;

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
*  <p>References a product variant by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantKeyReferenceImpl.class)
public interface ProductVariantKeyReference extends KeyReference {



    public static ProductVariantKeyReferenceImpl of(){
        return new ProductVariantKeyReferenceImpl();
    }
    

    public static ProductVariantKeyReferenceImpl of(final ProductVariantKeyReference template) {
        ProductVariantKeyReferenceImpl instance = new ProductVariantKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    default <T> T withProductVariantKeyReference(Function<ProductVariantKeyReference, T> helper) {
        return helper.apply(this);
    }
}
