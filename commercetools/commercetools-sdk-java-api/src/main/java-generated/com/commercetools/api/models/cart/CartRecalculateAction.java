
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartRecalculateActionImpl.class)
public interface CartRecalculateAction extends CartUpdateAction {

    String RECALCULATE = "recalculate";

    /**
    *  <p>If set to <code>true</code>, the line item product data (<code>name</code>, <code>variant</code> and <code>productType</code>) will also be updated.
    *  If set to <code>false</code>,
    *  only the prices and tax rates of the line item will be updated.
    *  The updated price of a line item may not correspond to a price in <code>variant.prices</code> anymore.</p>
    */

    @JsonProperty("updateProductData")
    public Boolean getUpdateProductData();

    public void setUpdateProductData(final Boolean updateProductData);

    public static CartRecalculateAction of() {
        return new CartRecalculateActionImpl();
    }

    public static CartRecalculateAction of(final CartRecalculateAction template) {
        CartRecalculateActionImpl instance = new CartRecalculateActionImpl();
        instance.setUpdateProductData(template.getUpdateProductData());
        return instance;
    }

    public static CartRecalculateActionBuilder builder() {
        return CartRecalculateActionBuilder.of();
    }

    public static CartRecalculateActionBuilder builder(final CartRecalculateAction template) {
        return CartRecalculateActionBuilder.of(template);
    }

    default <T> T withCartRecalculateAction(Function<CartRecalculateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartRecalculateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRecalculateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRecalculateAction>";
            }
        };
    }
}
