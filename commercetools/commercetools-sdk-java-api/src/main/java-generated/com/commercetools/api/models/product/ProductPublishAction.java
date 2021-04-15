
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductPublishActionImpl.class)
public interface ProductPublishAction extends ProductUpdateAction {

    String PUBLISH = "publish";

    @JsonProperty("scope")
    public ProductPublishScope getScope();

    public void setScope(final ProductPublishScope scope);

    public static ProductPublishAction of() {
        return new ProductPublishActionImpl();
    }

    public static ProductPublishAction of(final ProductPublishAction template) {
        ProductPublishActionImpl instance = new ProductPublishActionImpl();
        instance.setScope(template.getScope());
        return instance;
    }

    public static ProductPublishActionBuilder builder() {
        return ProductPublishActionBuilder.of();
    }

    public static ProductPublishActionBuilder builder(final ProductPublishAction template) {
        return ProductPublishActionBuilder.of(template);
    }

    default <T> T withProductPublishAction(Function<ProductPublishAction, T> helper) {
        return helper.apply(this);
    }
}
