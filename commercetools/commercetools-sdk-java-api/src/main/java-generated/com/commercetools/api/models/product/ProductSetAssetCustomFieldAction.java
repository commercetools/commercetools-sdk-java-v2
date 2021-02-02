
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetCustomFieldActionImpl.class)
public interface ProductSetAssetCustomFieldAction extends ProductUpdateAction {

    String SET_ASSET_CUSTOM_FIELD = "setAssetCustomField";

    @JsonProperty("variantId")
    public Long getVariantId();

    @JsonProperty("sku")
    public String getSku();

    @JsonProperty("staged")
    public Boolean getStaged();

    @JsonProperty("assetId")
    public String getAssetId();

    @JsonProperty("assetKey")
    public String getAssetKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static ProductSetAssetCustomFieldAction of() {
        return new ProductSetAssetCustomFieldActionImpl();
    }

    public static ProductSetAssetCustomFieldAction of(final ProductSetAssetCustomFieldAction template) {
        ProductSetAssetCustomFieldActionImpl instance = new ProductSetAssetCustomFieldActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static ProductSetAssetCustomFieldActionBuilder builder() {
        return ProductSetAssetCustomFieldActionBuilder.of();
    }

    public static ProductSetAssetCustomFieldActionBuilder builder(final ProductSetAssetCustomFieldAction template) {
        return ProductSetAssetCustomFieldActionBuilder.of(template);
    }

    default <T> T withProductSetAssetCustomFieldAction(Function<ProductSetAssetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
