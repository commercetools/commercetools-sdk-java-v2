
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangeIsActiveActionImpl.class)
public interface ProductDiscountChangeIsActiveAction extends ProductDiscountUpdateAction {

    String CHANGE_IS_ACTIVE = "changeIsActive";

    /**
    *  <p>New value to set.
    *  If set to <code>true</code>, the Discount will be applied to Product Prices.</p>
    */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    public void setIsActive(final Boolean isActive);

    public static ProductDiscountChangeIsActiveAction of() {
        return new ProductDiscountChangeIsActiveActionImpl();
    }

    public static ProductDiscountChangeIsActiveAction of(final ProductDiscountChangeIsActiveAction template) {
        ProductDiscountChangeIsActiveActionImpl instance = new ProductDiscountChangeIsActiveActionImpl();
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    public static ProductDiscountChangeIsActiveActionBuilder builder() {
        return ProductDiscountChangeIsActiveActionBuilder.of();
    }

    public static ProductDiscountChangeIsActiveActionBuilder builder(
            final ProductDiscountChangeIsActiveAction template) {
        return ProductDiscountChangeIsActiveActionBuilder.of(template);
    }

    default <T> T withProductDiscountChangeIsActiveAction(Function<ProductDiscountChangeIsActiveAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeIsActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountChangeIsActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountChangeIsActiveAction>";
            }
        };
    }
}
