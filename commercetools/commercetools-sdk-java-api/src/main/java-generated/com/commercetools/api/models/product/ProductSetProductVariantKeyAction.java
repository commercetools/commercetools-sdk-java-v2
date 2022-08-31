
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *     ProductSetProductVariantKeyAction productSetProductVariantKeyAction = ProductSetProductVariantKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetProductVariantKeyActionImpl.class)
public interface ProductSetProductVariantKeyAction extends ProductUpdateAction {

    String SET_PRODUCT_VARIANT_KEY = "setProductVariantKey";

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
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If <code>true</code>, only the staged <code>key</code> is set. If <code>false</code>, both the current and staged <code>key</code> are set.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setKey(final String key);

    public void setStaged(final Boolean staged);

    public static ProductSetProductVariantKeyAction of() {
        return new ProductSetProductVariantKeyActionImpl();
    }

    public static ProductSetProductVariantKeyAction of(final ProductSetProductVariantKeyAction template) {
        ProductSetProductVariantKeyActionImpl instance = new ProductSetProductVariantKeyActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetProductVariantKeyActionBuilder builder() {
        return ProductSetProductVariantKeyActionBuilder.of();
    }

    public static ProductSetProductVariantKeyActionBuilder builder(final ProductSetProductVariantKeyAction template) {
        return ProductSetProductVariantKeyActionBuilder.of(template);
    }

    default <T> T withProductSetProductVariantKeyAction(Function<ProductSetProductVariantKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetProductVariantKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetProductVariantKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetProductVariantKeyAction>";
            }
        };
    }
}
