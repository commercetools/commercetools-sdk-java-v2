
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updating the value of a StandalonePrice produces the StandalonePriceValueChangedMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeValueAction standalonePriceChangeValueAction = StandalonePriceChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceChangeValueActionImpl.class)
public interface StandalonePriceChangeValueAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceChangeValueAction
     */
    String CHANGE_VALUE = "changeValue";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>If set to <code>true</code> the update action applies to the StagedStandalonePrice. If set to <code>false</code>, the update action applies to the current StandalonePrice.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>If set to <code>true</code> the update action applies to the StagedStandalonePrice. If set to <code>false</code>, the update action applies to the current StandalonePrice.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of StandalonePriceChangeValueAction
     */
    public static StandalonePriceChangeValueAction of() {
        return new StandalonePriceChangeValueActionImpl();
    }

    /**
     * factory method to copy an instance of StandalonePriceChangeValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceChangeValueAction of(final StandalonePriceChangeValueAction template) {
        StandalonePriceChangeValueActionImpl instance = new StandalonePriceChangeValueActionImpl();
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceChangeValueAction
     * @return builder
     */
    public static StandalonePriceChangeValueActionBuilder builder() {
        return StandalonePriceChangeValueActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceChangeValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeValueActionBuilder builder(final StandalonePriceChangeValueAction template) {
        return StandalonePriceChangeValueActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceChangeValueAction(Function<StandalonePriceChangeValueAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeValueAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceChangeValueAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceChangeValueAction>";
            }
        };
    }
}
