
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the SKU of the Variant. SKU cannot be changed or removed if it is associated with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetSkuAction variantSetSkuAction = VariantSetSkuAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setSku")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetSkuActionImpl.class)
public interface VariantSetSkuAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetSkuAction
     */
    String SET_SKU = "setSku";

    /**
     *  <p>Value to set. Must be unique.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Whether only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. Must be unique.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Whether only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantSetSkuAction
     */
    public static VariantSetSkuAction of() {
        return new VariantSetSkuActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetSkuAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetSkuAction of(final VariantSetSkuAction template) {
        VariantSetSkuActionImpl instance = new VariantSetSkuActionImpl();
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantSetSkuAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetSkuAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetSkuAction deepCopy(@Nullable final VariantSetSkuAction template) {
        if (template == null) {
            return null;
        }
        VariantSetSkuActionImpl instance = new VariantSetSkuActionImpl();
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantSetSkuAction
     * @return builder
     */
    public static VariantSetSkuActionBuilder builder() {
        return VariantSetSkuActionBuilder.of();
    }

    /**
     * create builder for VariantSetSkuAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetSkuActionBuilder builder(final VariantSetSkuAction template) {
        return VariantSetSkuActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetSkuAction(Function<VariantSetSkuAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetSkuAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetSkuAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetSkuAction>";
            }
        };
    }
}
