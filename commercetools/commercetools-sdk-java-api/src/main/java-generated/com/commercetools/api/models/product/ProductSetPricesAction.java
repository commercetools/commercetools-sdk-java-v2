
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
@JsonDeserialize(as = ProductSetPricesActionImpl.class)
public interface ProductSetPricesAction extends ProductUpdateAction {

    String SET_PRICES = "setPrices";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<PriceDraft> getPrices();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    @JsonIgnore
    public void setPrices(final PriceDraft... prices);

    public void setPrices(final List<PriceDraft> prices);

    public void setStaged(final Boolean staged);

    public static ProductSetPricesAction of() {
        return new ProductSetPricesActionImpl();
    }

    public static ProductSetPricesAction of(final ProductSetPricesAction template) {
        ProductSetPricesActionImpl instance = new ProductSetPricesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetPricesActionBuilder builder() {
        return ProductSetPricesActionBuilder.of();
    }

    public static ProductSetPricesActionBuilder builder(final ProductSetPricesAction template) {
        return ProductSetPricesActionBuilder.of(template);
    }

    default <T> T withProductSetPricesAction(Function<ProductSetPricesAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetPricesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetPricesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetPricesAction>";
            }
        };
    }
}
