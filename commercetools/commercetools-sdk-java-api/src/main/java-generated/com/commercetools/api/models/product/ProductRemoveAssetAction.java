
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. The Asset to remove must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveAssetAction productRemoveAssetAction = ProductRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemoveAssetActionImpl.class)
public interface ProductRemoveAssetAction extends ProductUpdateAction {

    String REMOVE_ASSET = "removeAsset";

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
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public static ProductRemoveAssetAction of() {
        return new ProductRemoveAssetActionImpl();
    }

    public static ProductRemoveAssetAction of(final ProductRemoveAssetAction template) {
        ProductRemoveAssetActionImpl instance = new ProductRemoveAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public static ProductRemoveAssetActionBuilder builder() {
        return ProductRemoveAssetActionBuilder.of();
    }

    public static ProductRemoveAssetActionBuilder builder(final ProductRemoveAssetAction template) {
        return ProductRemoveAssetActionBuilder.of(template);
    }

    default <T> T withProductRemoveAssetAction(Function<ProductRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemoveAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemoveAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemoveAssetAction>";
            }
        };
    }
}
