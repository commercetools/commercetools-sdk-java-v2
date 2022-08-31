
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetDescriptionAction productSetAssetDescriptionAction = ProductSetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetDescriptionActionImpl.class)
public interface ProductSetAssetDescriptionAction extends ProductUpdateAction {

    String SET_ASSET_DESCRIPTION = "setAssetDescription";

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

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setDescription(final LocalizedString description);

    public static ProductSetAssetDescriptionAction of() {
        return new ProductSetAssetDescriptionActionImpl();
    }

    public static ProductSetAssetDescriptionAction of(final ProductSetAssetDescriptionAction template) {
        ProductSetAssetDescriptionActionImpl instance = new ProductSetAssetDescriptionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ProductSetAssetDescriptionActionBuilder builder() {
        return ProductSetAssetDescriptionActionBuilder.of();
    }

    public static ProductSetAssetDescriptionActionBuilder builder(final ProductSetAssetDescriptionAction template) {
        return ProductSetAssetDescriptionActionBuilder.of(template);
    }

    default <T> T withProductSetAssetDescriptionAction(Function<ProductSetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetDescriptionAction>";
            }
        };
    }
}
