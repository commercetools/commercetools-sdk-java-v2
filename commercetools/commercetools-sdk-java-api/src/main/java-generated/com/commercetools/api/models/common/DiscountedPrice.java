
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice {

    /**
    *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:ProductDiscount">ProductDiscount</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountReference getDiscount();

    public void setValue(final TypedMoney value);

    public void setDiscount(final ProductDiscountReference discount);

    public static DiscountedPrice of() {
        return new DiscountedPriceImpl();
    }

    public static DiscountedPrice of(final DiscountedPrice template) {
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    public static DiscountedPriceBuilder builder() {
        return DiscountedPriceBuilder.of();
    }

    public static DiscountedPriceBuilder builder(final DiscountedPrice template) {
        return DiscountedPriceBuilder.of(template);
    }

    default <T> T withDiscountedPrice(Function<DiscountedPrice, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedPrice>";
            }
        };
    }
}
