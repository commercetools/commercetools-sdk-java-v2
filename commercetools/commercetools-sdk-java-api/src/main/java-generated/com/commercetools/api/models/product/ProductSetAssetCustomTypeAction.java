
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetCustomTypeActionImpl.class)
public interface ProductSetAssetCustomTypeAction extends ProductUpdateAction {

    String SET_ASSET_CUSTOM_TYPE = "setAssetCustomType";

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

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public Object getFields();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final Object fields);

    public static ProductSetAssetCustomTypeAction of() {
        return new ProductSetAssetCustomTypeActionImpl();
    }

    public static ProductSetAssetCustomTypeAction of(final ProductSetAssetCustomTypeAction template) {
        ProductSetAssetCustomTypeActionImpl instance = new ProductSetAssetCustomTypeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static ProductSetAssetCustomTypeActionBuilder builder() {
        return ProductSetAssetCustomTypeActionBuilder.of();
    }

    public static ProductSetAssetCustomTypeActionBuilder builder(final ProductSetAssetCustomTypeAction template) {
        return ProductSetAssetCustomTypeActionBuilder.of(template);
    }

    default <T> T withProductSetAssetCustomTypeAction(Function<ProductSetAssetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
