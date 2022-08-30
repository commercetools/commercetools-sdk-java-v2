
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.PriceDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds the given Price to the <code>prices</code> array of the ProductVariant. Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddPriceAction productAddPriceAction = ProductAddPriceAction.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddPriceActionImpl.class)
public interface ProductAddPriceAction extends ProductUpdateAction {

    String ADD_PRICE = "addPrice";

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
     *  <p>Embedded Price to add to the Product Variant.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public PriceDraft getPrice();

    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Long variantId);

    public void setSku(final String sku);

    public void setPrice(final PriceDraft price);

    public void setStaged(final Boolean staged);

    public static ProductAddPriceAction of() {
        return new ProductAddPriceActionImpl();
    }

    public static ProductAddPriceAction of(final ProductAddPriceAction template) {
        ProductAddPriceActionImpl instance = new ProductAddPriceActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductAddPriceActionBuilder builder() {
        return ProductAddPriceActionBuilder.of();
    }

    public static ProductAddPriceActionBuilder builder(final ProductAddPriceAction template) {
        return ProductAddPriceActionBuilder.of(template);
    }

    default <T> T withProductAddPriceAction(Function<ProductAddPriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddPriceAction>";
            }
        };
    }
}
