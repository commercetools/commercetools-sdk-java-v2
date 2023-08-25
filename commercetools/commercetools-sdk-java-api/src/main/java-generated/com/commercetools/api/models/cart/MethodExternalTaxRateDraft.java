
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MethodExternalTaxRateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MethodExternalTaxRateDraft methodExternalTaxRateDraft = MethodExternalTaxRateDraft.builder()
 *             .shippingMethodKey("{shippingMethodKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MethodExternalTaxRateDraftImpl.class)
public interface MethodExternalTaxRateDraft extends io.vrap.rmf.base.client.Draft<MethodExternalTaxRateDraft> {

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethodKey
     */
    @NotNull
    @JsonProperty("shippingMethodKey")
    public String getShippingMethodKey();

    /**
     *  <p>External Tax Rate for the Shipping Method, if the Cart has <code>External</code> TaxMode.</p>
     * @return taxRate
     */
    @Valid
    @JsonProperty("taxRate")
    public ExternalTaxRateDraft getTaxRate();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingMethodKey value to be set
     */

    public void setShippingMethodKey(final String shippingMethodKey);

    /**
     *  <p>External Tax Rate for the Shipping Method, if the Cart has <code>External</code> TaxMode.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final ExternalTaxRateDraft taxRate);

    /**
     * factory method
     * @return instance of MethodExternalTaxRateDraft
     */
    public static MethodExternalTaxRateDraft of() {
        return new MethodExternalTaxRateDraftImpl();
    }

    /**
     * factory method to create a shallow copy MethodExternalTaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MethodExternalTaxRateDraft of(final MethodExternalTaxRateDraft template) {
        MethodExternalTaxRateDraftImpl instance = new MethodExternalTaxRateDraftImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of MethodExternalTaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MethodExternalTaxRateDraft deepCopy(@Nullable final MethodExternalTaxRateDraft template) {
        if (template == null) {
            return null;
        }
        MethodExternalTaxRateDraftImpl instance = new MethodExternalTaxRateDraftImpl();
        instance.setShippingMethodKey(template.getShippingMethodKey());
        instance.setTaxRate(com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getTaxRate()));
        return instance;
    }

    /**
     * builder factory method for MethodExternalTaxRateDraft
     * @return builder
     */
    public static MethodExternalTaxRateDraftBuilder builder() {
        return MethodExternalTaxRateDraftBuilder.of();
    }

    /**
     * create builder for MethodExternalTaxRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MethodExternalTaxRateDraftBuilder builder(final MethodExternalTaxRateDraft template) {
        return MethodExternalTaxRateDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMethodExternalTaxRateDraft(Function<MethodExternalTaxRateDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MethodExternalTaxRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MethodExternalTaxRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MethodExternalTaxRateDraft>";
            }
        };
    }
}
