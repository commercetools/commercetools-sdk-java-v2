
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the key of an Embedded Price. Produces the ProductPriceKeySet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPriceKeyAction productSetPriceKeyAction = ProductSetPriceKeyAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetPriceKeyActionImpl.class)
public interface ProductSetPriceKeyAction extends ProductUpdateAction {

    String SET_PRICE_KEY = "setPriceKey";

    /**
     *  <p>The <code>id</code> of the Embedded Price to set the key.</p>
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setPriceId(final String priceId);

    public void setStaged(final Boolean staged);

    public void setKey(final String key);

    public static ProductSetPriceKeyAction of() {
        return new ProductSetPriceKeyActionImpl();
    }

    public static ProductSetPriceKeyAction of(final ProductSetPriceKeyAction template) {
        ProductSetPriceKeyActionImpl instance = new ProductSetPriceKeyActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductSetPriceKeyActionBuilder builder() {
        return ProductSetPriceKeyActionBuilder.of();
    }

    public static ProductSetPriceKeyActionBuilder builder(final ProductSetPriceKeyAction template) {
        return ProductSetPriceKeyActionBuilder.of(template);
    }

    default <T> T withProductSetPriceKeyAction(Function<ProductSetPriceKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetPriceKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetPriceKeyAction>";
            }
        };
    }
}
