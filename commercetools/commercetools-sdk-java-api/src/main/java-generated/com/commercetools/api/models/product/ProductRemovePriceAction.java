
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemovePriceAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemovePriceAction productRemovePriceAction = ProductRemovePriceAction.builder()
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductRemovePriceActionImpl.class)
public interface ProductRemovePriceAction extends ProductUpdateAction {

    String REMOVE_PRICE = "removePrice";

    /**
     *  <p>The <code>id</code> of the EmbeddedPrice to remove.</p>
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>If <code>true</code>, only the staged EmbeddedPrice is removed. If <code>false</code>, both the current and staged EmbeddedPrice are removed.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setPriceId(final String priceId);

    public void setStaged(final Boolean staged);

    public static ProductRemovePriceAction of() {
        return new ProductRemovePriceActionImpl();
    }

    public static ProductRemovePriceAction of(final ProductRemovePriceAction template) {
        ProductRemovePriceActionImpl instance = new ProductRemovePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductRemovePriceActionBuilder builder() {
        return ProductRemovePriceActionBuilder.of();
    }

    public static ProductRemovePriceActionBuilder builder(final ProductRemovePriceAction template) {
        return ProductRemovePriceActionBuilder.of(template);
    }

    default <T> T withProductRemovePriceAction(Function<ProductRemovePriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductRemovePriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductRemovePriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductRemovePriceAction>";
            }
        };
    }
}
