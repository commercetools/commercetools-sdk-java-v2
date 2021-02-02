
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductAddPriceActionImpl.class)
public interface ProductAddPriceAction extends ProductUpdateAction {

    String ADD_PRICE = "addPrice";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setPrice(final PriceDraft price);

    public void setStaged(final Boolean staged);

    public static ProductAddPriceAction of() {
        return new ProductAddPriceActionImpl();
    }

    public static ProductAddPriceAction of(final ProductAddPriceAction template) {
        ProductAddPriceActionImpl instance = new ProductAddPriceActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductAddPriceActionBuilder builder() {
        return ProductAddPriceActionBuilder.of();
    }

    public static ProductAddPriceActionBuilder builder(final ProductAddPriceAction template) {
        return ProductAddPriceActionBuilder.of(template);
    }

    default <T> T withProductAddPriceAction(Function<ProductAddPriceAction, T> helper) {
        return helper.apply(this);
    }
}
