
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the country can lead to changes in the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> prices.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCountryAction stagedOrderSetCountryAction = StagedOrderSetCountryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCountry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCountryActionImpl.class)
public interface StagedOrderSetCountryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCountryAction
     */
    String SET_COUNTRY = "setCountry";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>'s <code>countries</code>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:CountryNotConfiguredInStoreError" rel="nofollow">CountryNotConfiguredInStore</a> error is returned.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>'s <code>countries</code>. Otherwise a <a href="https://docs.commercetools.com/apis/ctp:api:type:CountryNotConfiguredInStoreError" rel="nofollow">CountryNotConfiguredInStore</a> error is returned.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     * factory method
     * @return instance of StagedOrderSetCountryAction
     */
    public static StagedOrderSetCountryAction of() {
        return new StagedOrderSetCountryActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetCountryAction of(final StagedOrderSetCountryAction template) {
        StagedOrderSetCountryActionImpl instance = new StagedOrderSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public StagedOrderSetCountryAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetCountryAction deepCopy(@Nullable final StagedOrderSetCountryAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetCountryActionImpl instance = new StagedOrderSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetCountryAction
     * @return builder
     */
    public static StagedOrderSetCountryActionBuilder builder() {
        return StagedOrderSetCountryActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCountryActionBuilder builder(final StagedOrderSetCountryAction template) {
        return StagedOrderSetCountryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetCountryAction(Function<StagedOrderSetCountryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetCountryAction>";
            }
        };
    }
}
