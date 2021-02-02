
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductResourceIdentifierImpl.class)
public interface ProductResourceIdentifier extends ResourceIdentifier {

    String PRODUCT = "product";

    public static ProductResourceIdentifier of() {
        return new ProductResourceIdentifierImpl();
    }

    public static ProductResourceIdentifier of(final ProductResourceIdentifier template) {
        ProductResourceIdentifierImpl instance = new ProductResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductResourceIdentifierBuilder builder() {
        return ProductResourceIdentifierBuilder.of();
    }

    public static ProductResourceIdentifierBuilder builder(final ProductResourceIdentifier template) {
        return ProductResourceIdentifierBuilder.of(template);
    }

    default <T> T withProductResourceIdentifier(Function<ProductResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
