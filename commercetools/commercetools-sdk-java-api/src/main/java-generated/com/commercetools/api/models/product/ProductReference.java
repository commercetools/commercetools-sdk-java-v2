
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductReferenceImpl.class)
public interface ProductReference extends Reference {

    String PRODUCT = "product";

    @Valid
    @JsonProperty("obj")
    public Product getObj();

    public void setObj(final Product obj);

    public static ProductReference of() {
        return new ProductReferenceImpl();
    }

    public static ProductReference of(final ProductReference template) {
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ProductReferenceBuilder builder() {
        return ProductReferenceBuilder.of();
    }

    public static ProductReferenceBuilder builder(final ProductReference template) {
        return ProductReferenceBuilder.of(template);
    }

    default <T> T withProductReference(Function<ProductReference, T> helper) {
        return helper.apply(this);
    }
}
