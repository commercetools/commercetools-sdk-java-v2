
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
 *  <p>Updating the <code>validUntil</code> value generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceValidUntilSetMessage" rel="nofollow">StandalonePriceValidUntilSet</a> Message.</p>
 *  <p>As the validity dates are part of the price scope and are not allowed to overlap, this update might return the <a href="https://docs.commercetools.com/apis/ctp:api:type:DuplicateStandalonePriceScopeError" rel="nofollow">DuplicateStandalonePriceScope</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:OverlappingStandalonePriceValidityError" rel="nofollow">OverlappingStandalonePriceValidity</a> errors, respectively. A Price without validity period does not conflict with a Price defined for a time period.</p>
 *  <p>If a modification is already in progress for the exact combination of SKU and price scope fields, an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExactLockConflictError" rel="nofollow">ExactLockConflict</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:ValidityLockConflictError" rel="nofollow">ValidityLockConflict</a> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetValidUntilAction standalonePriceSetValidUntilAction = StandalonePriceSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setValidUntil")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetValidUntilActionImpl.class)
public interface StandalonePriceSetValidUntilAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetValidUntilAction
     */
    String SET_VALID_UNTIL = "setValidUntil";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return validUntil
     */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param validUntil value to be set
     */

    public void setValidUntil(final ZonedDateTime validUntil);

    /**
     * factory method
     * @return instance of StandalonePriceSetValidUntilAction
     */
    public static StandalonePriceSetValidUntilAction of() {
        return new StandalonePriceSetValidUntilActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetValidUntilAction of(final StandalonePriceSetValidUntilAction template) {
        StandalonePriceSetValidUntilActionImpl instance = new StandalonePriceSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public StandalonePriceSetValidUntilAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetValidUntilAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetValidUntilAction deepCopy(
            @Nullable final StandalonePriceSetValidUntilAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetValidUntilActionImpl instance = new StandalonePriceSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetValidUntilAction
     * @return builder
     */
    public static StandalonePriceSetValidUntilActionBuilder builder() {
        return StandalonePriceSetValidUntilActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetValidUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetValidUntilActionBuilder builder(final StandalonePriceSetValidUntilAction template) {
        return StandalonePriceSetValidUntilActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetValidUntilAction(Function<StandalonePriceSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetValidUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetValidUntilAction>";
            }
        };
    }
}
