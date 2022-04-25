
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetDiscountedPriceActionImpl.class)
public interface ProductSetDiscountedPriceAction extends ProductUpdateAction {

    String SET_DISCOUNTED_PRICE = "setDiscountedPrice";

    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    @JsonProperty("staged")
    public Boolean getStaged();

    @Valid
    @JsonProperty("discounted")
    public DiscountedPriceDraft getDiscounted();

    public void setPriceId(final String priceId);

    public void setStaged(final Boolean staged);

    public void setDiscounted(final DiscountedPriceDraft discounted);

    public static ProductSetDiscountedPriceAction of() {
        return new ProductSetDiscountedPriceActionImpl();
    }

    public static ProductSetDiscountedPriceAction of(final ProductSetDiscountedPriceAction template) {
        ProductSetDiscountedPriceActionImpl instance = new ProductSetDiscountedPriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setDiscounted(template.getDiscounted());
        return instance;
    }

    public static ProductSetDiscountedPriceActionBuilder builder() {
        return ProductSetDiscountedPriceActionBuilder.of();
    }

    public static ProductSetDiscountedPriceActionBuilder builder(final ProductSetDiscountedPriceAction template) {
        return ProductSetDiscountedPriceActionBuilder.of(template);
    }

    default <T> T withProductSetDiscountedPriceAction(Function<ProductSetDiscountedPriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetDiscountedPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetDiscountedPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetDiscountedPriceAction>";
            }
        };
    }
}
