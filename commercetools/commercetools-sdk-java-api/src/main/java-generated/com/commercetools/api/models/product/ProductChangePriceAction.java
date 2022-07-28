
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangePriceAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangePriceAction productChangePriceAction = ProductChangePriceAction.builder()
 *             .priceId("{priceId}")
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangePriceActionImpl.class)
public interface ProductChangePriceAction extends ProductUpdateAction {

    String CHANGE_PRICE = "changePrice";

    /**
     *  <p>The <code>id</code> of the EmbeddedPrice to update.</p>
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Value to set.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public EmbeddedPriceDraft getPrice();

    /**
     *  <p>If <code>true</code>, only the staged EmbeddedPrice is updated. If <code>false</code>, both the current and staged EmbeddedPrice are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setPriceId(final String priceId);

    public void setPrice(final EmbeddedPriceDraft price);

    public void setStaged(final Boolean staged);

    public static ProductChangePriceAction of() {
        return new ProductChangePriceActionImpl();
    }

    public static ProductChangePriceAction of(final ProductChangePriceAction template) {
        ProductChangePriceActionImpl instance = new ProductChangePriceActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setPrice(template.getPrice());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductChangePriceActionBuilder builder() {
        return ProductChangePriceActionBuilder.of();
    }

    public static ProductChangePriceActionBuilder builder(final ProductChangePriceAction template) {
        return ProductChangePriceActionBuilder.of(template);
    }

    default <T> T withProductChangePriceAction(Function<ProductChangePriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangePriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangePriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangePriceAction>";
            }
        };
    }
}
