
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
 *  <p>Updating the <code>validFrom</code> and <code>validUntil</code> values generates the StandalonePriceValidFromAndUntilSet Message.</p>
 *  <p>As the validity dates are part of the price scope and are not allowed to overlap, this update might return the DuplicateStandalonePriceScope and OverlappingStandalonePriceValidity errors, respectively. A Price without validity period does not conflict with a Price defined for a time period.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidFromAndUntilAction standalonePriceSetValidFromAndUntilAction = StandalonePriceSetValidFromAndUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setValidFromAndUntil")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetValidFromAndUntilActionImpl.class)
public interface StandalonePriceSetValidFromAndUntilAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetValidFromAndUntilAction
     */
    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return validFrom
     */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validFrom value to be set
     */

    public void setValidFrom(final ZonedDateTime validFrom);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of StandalonePriceSetValidFromAndUntilAction
     */
    public static StandalonePriceSetValidFromAndUntilAction of() {
        return new StandalonePriceSetValidFromAndUntilActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetValidFromAndUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetValidFromAndUntilAction of(
            final StandalonePriceSetValidFromAndUntilAction template) {
        StandalonePriceSetValidFromAndUntilActionImpl instance = new StandalonePriceSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public StandalonePriceSetValidFromAndUntilAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetValidFromAndUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetValidFromAndUntilAction deepCopy(
            @Nullable final StandalonePriceSetValidFromAndUntilAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetValidFromAndUntilActionImpl instance = new StandalonePriceSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetValidFromAndUntilAction
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilActionBuilder builder() {
        return StandalonePriceSetValidFromAndUntilActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetValidFromAndUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidFromAndUntilActionBuilder builder(
            final StandalonePriceSetValidFromAndUntilAction template) {
        return StandalonePriceSetValidFromAndUntilActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetValidFromAndUntilAction(
            Function<StandalonePriceSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromAndUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidFromAndUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetValidFromAndUntilAction>";
            }
        };
    }
}
