
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the <code>validFrom</code> value generates the StandalonePriceValidFromSet Message.</p>
 *  <p>As the validity dates are part of the price scope and are not allowed to overlap, this update might return the DuplicateStandalonePriceScope and OverlappingStandalonePriceValidity errors, respectively. A Price without validity period does not conflict with a Price defined for a time period.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromAction standalonePriceSetValidFromAction = StandalonePriceSetValidFromAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetValidFromActionImpl.class)
public interface StandalonePriceSetValidFromAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetValidFromAction
     */
    String SET_VALID_FROM = "setValidFrom";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     * factory method
     * @return instance of StandalonePriceSetValidFromAction
     */
    public static StandalonePriceSetValidFromAction of() {
        return new StandalonePriceSetValidFromActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetValidFromAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetValidFromAction of(final StandalonePriceSetValidFromAction template) {
        StandalonePriceSetValidFromActionImpl instance = new StandalonePriceSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    /**
     * factory method to create a deep copy of StandalonePriceSetValidFromAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetValidFromAction deepCopy(
            @Nullable final StandalonePriceSetValidFromAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetValidFromActionImpl instance = new StandalonePriceSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetValidFromAction
     * @return builder
     */
    public static StandalonePriceSetValidFromActionBuilder builder() {
        return StandalonePriceSetValidFromActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetValidFromAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromActionBuilder builder(final StandalonePriceSetValidFromAction template) {
        return StandalonePriceSetValidFromActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetValidFromAction(Function<StandalonePriceSetValidFromAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetValidFromAction>";
            }
        };
    }
}
