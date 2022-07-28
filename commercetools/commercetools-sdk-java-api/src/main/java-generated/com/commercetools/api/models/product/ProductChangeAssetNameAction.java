
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
 *     ProductChangeAssetNameAction productChangeAssetNameAction = ProductChangeAssetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeAssetNameActionImpl.class)
public interface ProductChangeAssetNameAction extends ProductUpdateAction {

    String CHANGE_ASSET_NAME = "changeAssetName";

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
     *  <p>New value to set. Must not be empty.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setName(final LocalizedString name);

    public static ProductChangeAssetNameAction of() {
        return new ProductChangeAssetNameActionImpl();
    }

    public static ProductChangeAssetNameAction of(final ProductChangeAssetNameAction template) {
        ProductChangeAssetNameActionImpl instance = new ProductChangeAssetNameActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        return instance;
    }

    public static ProductChangeAssetNameActionBuilder builder() {
        return ProductChangeAssetNameActionBuilder.of();
    }

    public static ProductChangeAssetNameActionBuilder builder(final ProductChangeAssetNameAction template) {
        return ProductChangeAssetNameActionBuilder.of(template);
    }

    default <T> T withProductChangeAssetNameAction(Function<ProductChangeAssetNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeAssetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeAssetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeAssetNameAction>";
            }
        };
    }
}
