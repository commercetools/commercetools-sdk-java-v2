
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetKeyActionImpl.class)
public interface ProductSetKeyAction extends ProductUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>User-specific unique identifier for the product.
    *  If left blank or set to <code>null</code>, the product key is unset/removed.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductSetKeyAction of() {
        return new ProductSetKeyActionImpl();
    }

    public static ProductSetKeyAction of(final ProductSetKeyAction template) {
        ProductSetKeyActionImpl instance = new ProductSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductSetKeyActionBuilder builder() {
        return ProductSetKeyActionBuilder.of();
    }

    public static ProductSetKeyActionBuilder builder(final ProductSetKeyAction template) {
        return ProductSetKeyActionBuilder.of(template);
    }

    default <T> T withProductSetKeyAction(Function<ProductSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
