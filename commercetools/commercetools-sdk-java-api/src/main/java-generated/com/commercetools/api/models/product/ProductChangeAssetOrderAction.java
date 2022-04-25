
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductChangeAssetOrderActionImpl.class)
public interface ProductChangeAssetOrderAction extends ProductUpdateAction {

    String CHANGE_ASSET_ORDER = "changeAssetOrder";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("staged")
    public Boolean getStaged();

    @NotNull
    @JsonProperty("assetOrder")
    public List<String> getAssetOrder();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    @JsonIgnore
    public void setAssetOrder(final String... assetOrder);

    public void setAssetOrder(final List<String> assetOrder);

    public static ProductChangeAssetOrderAction of() {
        return new ProductChangeAssetOrderActionImpl();
    }

    public static ProductChangeAssetOrderAction of(final ProductChangeAssetOrderAction template) {
        ProductChangeAssetOrderActionImpl instance = new ProductChangeAssetOrderActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetOrder(template.getAssetOrder());
        return instance;
    }

    public static ProductChangeAssetOrderActionBuilder builder() {
        return ProductChangeAssetOrderActionBuilder.of();
    }

    public static ProductChangeAssetOrderActionBuilder builder(final ProductChangeAssetOrderAction template) {
        return ProductChangeAssetOrderActionBuilder.of(template);
    }

    default <T> T withProductChangeAssetOrderAction(Function<ProductChangeAssetOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeAssetOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeAssetOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeAssetOrderAction>";
            }
        };
    }
}
