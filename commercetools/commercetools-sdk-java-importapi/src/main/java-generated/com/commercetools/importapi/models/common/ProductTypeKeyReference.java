
package com.commercetools.importapi.models.common;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ProductTypeKeyReferenceImpl;
import com.commercetools.importapi.models.common.ReferenceType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a product type by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeKeyReferenceImpl.class)
public interface ProductTypeKeyReference extends KeyReference {

    public static ProductTypeKeyReference of() {
        return new ProductTypeKeyReferenceImpl();
    }

    public static ProductTypeKeyReference of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceImpl instance = new ProductTypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductTypeKeyReferenceBuilder builder() {
        return ProductTypeKeyReferenceBuilder.of();
    }

    public static ProductTypeKeyReferenceBuilder builder(final ProductTypeKeyReference template) {
        return ProductTypeKeyReferenceBuilder.of(template);
    }

    default <T> T withProductTypeKeyReference(Function<ProductTypeKeyReference, T> helper) {
        return helper.apply(this);
    }
}
