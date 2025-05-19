
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
 * StagedOrderSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetLocaleAction stagedOrderSetLocaleAction = StagedOrderSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLocale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLocaleActionImpl.class)
public interface StagedOrderSetLocaleAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. Must be one of the Project's languages. If empty, any existing value is removed.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Value to set. Must be one of the Project's languages. If empty, any existing value is removed.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     * factory method
     * @return instance of StagedOrderSetLocaleAction
     */
    public static StagedOrderSetLocaleAction of() {
        return new StagedOrderSetLocaleActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetLocaleAction of(final StagedOrderSetLocaleAction template) {
        StagedOrderSetLocaleActionImpl instance = new StagedOrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public StagedOrderSetLocaleAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetLocaleAction deepCopy(@Nullable final StagedOrderSetLocaleAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetLocaleActionImpl instance = new StagedOrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetLocaleAction
     * @return builder
     */
    public static StagedOrderSetLocaleActionBuilder builder() {
        return StagedOrderSetLocaleActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetLocaleActionBuilder builder(final StagedOrderSetLocaleAction template) {
        return StagedOrderSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetLocaleAction(Function<StagedOrderSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLocaleAction>";
            }
        };
    }
}
