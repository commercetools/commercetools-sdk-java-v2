
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetKeyAction productSetAssetKeyAction = ProductSetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetKeyActionImpl.class)
public interface ProductSetAssetKeyAction extends ProductUpdateAction {

    String SET_ASSET_KEY = "setAssetKey";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     */
    @NotNull
    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public static ProductSetAssetKeyAction of() {
        return new ProductSetAssetKeyActionImpl();
    }

    public static ProductSetAssetKeyAction of(final ProductSetAssetKeyAction template) {
        ProductSetAssetKeyActionImpl instance = new ProductSetAssetKeyActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public static ProductSetAssetKeyActionBuilder builder() {
        return ProductSetAssetKeyActionBuilder.of();
    }

    public static ProductSetAssetKeyActionBuilder builder(final ProductSetAssetKeyAction template) {
        return ProductSetAssetKeyActionBuilder.of(template);
    }

    default <T> T withProductSetAssetKeyAction(Function<ProductSetAssetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetKeyAction>";
            }
        };
    }
}
