
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetDraft;
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
 *     ProductAddAssetAction productAddAssetAction = ProductAddAssetAction.builder()
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddAssetActionImpl.class)
public interface ProductAddAssetAction extends ProductUpdateAction {

    String ADD_ASSET = "addAsset";

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
     *  <p>If <code>true</code>, only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to append.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetDraft getAsset();

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     */

    @JsonProperty("position")
    public Integer getPosition();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAsset(final AssetDraft asset);

    public void setPosition(final Integer position);

    public static ProductAddAssetAction of() {
        return new ProductAddAssetActionImpl();
    }

    public static ProductAddAssetAction of(final ProductAddAssetAction template) {
        ProductAddAssetActionImpl instance = new ProductAddAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAsset(template.getAsset());
        instance.setPosition(template.getPosition());
        return instance;
    }

    public static ProductAddAssetActionBuilder builder() {
        return ProductAddAssetActionBuilder.of();
    }

    public static ProductAddAssetActionBuilder builder(final ProductAddAssetAction template) {
        return ProductAddAssetActionBuilder.of(template);
    }

    default <T> T withProductAddAssetAction(Function<ProductAddAssetAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddAssetAction>";
            }
        };
    }
}
