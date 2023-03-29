
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
 * StagedOrderSetCountryAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetCountryActionImpl.class)
public interface StagedOrderSetCountryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetCountryAction
     */
    String SET_COUNTRY = "setCountry";

    /**
     *
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     * set country
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
