package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>References a product type by its key.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeKeyReferenceImpl.class)
public interface ProductTypeKeyReference extends KeyReference {



    public static ProductTypeKeyReferenceImpl of(){
        return new ProductTypeKeyReferenceImpl();
    }


    public static ProductTypeKeyReferenceImpl of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceImpl instance = new ProductTypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}
