
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetKeyActionImpl.class)
public interface ProductSelectionSetKeyAction extends ProductSelectionUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ProductSelectionSetKeyAction of() {
        return new ProductSelectionSetKeyActionImpl();
    }

    public static ProductSelectionSetKeyAction of(final ProductSelectionSetKeyAction template) {
        ProductSelectionSetKeyActionImpl instance = new ProductSelectionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductSelectionSetKeyActionBuilder builder() {
        return ProductSelectionSetKeyActionBuilder.of();
    }

    public static ProductSelectionSetKeyActionBuilder builder(final ProductSelectionSetKeyAction template) {
        return ProductSelectionSetKeyActionBuilder.of(template);
    }

    default <T> T withProductSelectionSetKeyAction(Function<ProductSelectionSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetKeyAction>";
            }
        };
    }
}
