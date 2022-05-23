
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProductSetAssetCustomTypeAction productSetAssetCustomTypeAction = ProductSetAssetCustomTypeAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

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

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetCustomTypeAction>";
            }
        };
    }
}
