
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
 *     ProductChangeAssetOrderAction productChangeAssetOrderAction = ProductChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeAssetOrderActionImpl.class)
public interface ProductChangeAssetOrderAction extends ProductUpdateAction {

    String CHANGE_ASSET_ORDER = "changeAssetOrder";

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
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     */
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
