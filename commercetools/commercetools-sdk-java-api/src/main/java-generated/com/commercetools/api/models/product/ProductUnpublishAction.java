
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductUnpublishActionImpl.class)
public interface ProductUnpublishAction extends ProductUpdateAction {

    String UNPUBLISH = "unpublish";

    public static ProductUnpublishAction of() {
        return new ProductUnpublishActionImpl();
    }

    public static ProductUnpublishAction of(final ProductUnpublishAction template) {
        ProductUnpublishActionImpl instance = new ProductUnpublishActionImpl();
        return instance;
    }

    public static ProductUnpublishActionBuilder builder() {
        return ProductUnpublishActionBuilder.of();
    }

    public static ProductUnpublishActionBuilder builder(final ProductUnpublishAction template) {
        return ProductUnpublishActionBuilder.of(template);
    }

    default <T> T withProductUnpublishAction(Function<ProductUnpublishAction, T> helper) {
        return helper.apply(this);
    }
}
