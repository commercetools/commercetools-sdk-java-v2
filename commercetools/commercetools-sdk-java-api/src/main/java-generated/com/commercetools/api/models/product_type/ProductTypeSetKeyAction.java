
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeSetKeyActionImpl.class)
public interface ProductTypeSetKeyAction extends ProductTypeUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductTypeSetKeyAction of() {
        return new ProductTypeSetKeyActionImpl();
    }

    public static ProductTypeSetKeyAction of(final ProductTypeSetKeyAction template) {
        ProductTypeSetKeyActionImpl instance = new ProductTypeSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductTypeSetKeyActionBuilder builder() {
        return ProductTypeSetKeyActionBuilder.of();
    }

    public static ProductTypeSetKeyActionBuilder builder(final ProductTypeSetKeyAction template) {
        return ProductTypeSetKeyActionBuilder.of(template);
    }

    default <T> T withProductTypeSetKeyAction(Function<ProductTypeSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeSetKeyAction>";
            }
        };
    }
}
