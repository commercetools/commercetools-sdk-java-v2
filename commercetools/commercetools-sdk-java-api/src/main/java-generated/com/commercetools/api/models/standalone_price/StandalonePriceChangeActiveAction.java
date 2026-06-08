
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updating the value of a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceActiveChangedMessage" rel="nofollow">StandalonePriceActiveChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeActiveAction standalonePriceChangeActiveAction = StandalonePriceChangeActiveAction.builder()
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeActive")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceChangeActiveActionImpl.class)
public interface StandalonePriceChangeActiveAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceChangeActiveAction
     */
    String CHANGE_ACTIVE = "changeActive";

    /**
     *  <p>New value to set for the <code>active</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return active
     */
    @NotNull
    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>New value to set for the <code>active</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param active value to be set
     */

    public void setActive(final Boolean active);

    /**
     * factory method
     * @return instance of StandalonePriceChangeActiveAction
     */
    public static StandalonePriceChangeActiveAction of() {
        return new StandalonePriceChangeActiveActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceChangeActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceChangeActiveAction of(final StandalonePriceChangeActiveAction template) {
        StandalonePriceChangeActiveActionImpl instance = new StandalonePriceChangeActiveActionImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    public StandalonePriceChangeActiveAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceChangeActiveAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceChangeActiveAction deepCopy(
            @Nullable final StandalonePriceChangeActiveAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceChangeActiveActionImpl instance = new StandalonePriceChangeActiveActionImpl();
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceChangeActiveAction
     * @return builder
     */
    public static StandalonePriceChangeActiveActionBuilder builder() {
        return StandalonePriceChangeActiveActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceChangeActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeActiveActionBuilder builder(final StandalonePriceChangeActiveAction template) {
        return StandalonePriceChangeActiveActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceChangeActiveAction(Function<StandalonePriceChangeActiveAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeActiveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeActiveAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceChangeActiveAction>";
            }
        };
    }
}
