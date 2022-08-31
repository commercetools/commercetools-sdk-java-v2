
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>SKU cannot be changed or removed if it is associated with an InventoryEntry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetSkuAction productSetSkuAction = ProductSetSkuAction.builder()
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetSkuActionImpl.class)
public interface ProductSetSkuAction extends ProductUpdateAction {

    String SET_SKU = "setSku";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setStaged(final Boolean staged);

    public static ProductSetSkuAction of() {
        return new ProductSetSkuActionImpl();
    }

    public static ProductSetSkuAction of(final ProductSetSkuAction template) {
        ProductSetSkuActionImpl instance = new ProductSetSkuActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetSkuActionBuilder builder() {
        return ProductSetSkuActionBuilder.of();
    }

    public static ProductSetSkuActionBuilder builder(final ProductSetSkuAction template) {
        return ProductSetSkuActionBuilder.of(template);
    }

    default <T> T withProductSetSkuAction(Function<ProductSetSkuAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetSkuAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetSkuAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetSkuAction>";
            }
        };
    }
}
