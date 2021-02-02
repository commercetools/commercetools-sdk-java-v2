
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetKeyActionImpl.class)
public interface ProductDiscountSetKeyAction extends ProductDiscountUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>The key to set.
    *  If you provide a <code>null</code> value or do not set this field at all, the existing <code>key</code> field is removed.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductDiscountSetKeyAction of() {
        return new ProductDiscountSetKeyActionImpl();
    }

    public static ProductDiscountSetKeyAction of(final ProductDiscountSetKeyAction template) {
        ProductDiscountSetKeyActionImpl instance = new ProductDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductDiscountSetKeyActionBuilder builder() {
        return ProductDiscountSetKeyActionBuilder.of();
    }

    public static ProductDiscountSetKeyActionBuilder builder(final ProductDiscountSetKeyAction template) {
        return ProductDiscountSetKeyActionBuilder.of(template);
    }

    default <T> T withProductDiscountSetKeyAction(Function<ProductDiscountSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
