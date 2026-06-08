
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updating the value of a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceValueChangedMessage" rel="nofollow">StandalonePriceValueChangedMessage</a>.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("changeValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceChangeValueActionImpl.class)
public interface StandalonePriceChangeValueAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceChangeValueAction
     */
    String CHANGE_VALUE = "changeValue";

    /**
     *  <p>New value to set. Must not be empty.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *  <p>If set to <code>true</code> the update action applies to the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedStandalonePrice" rel="nofollow">StagedStandalonePrice</a>. If set to <code>false</code>, the update action applies to the current <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>New value to set. Must not be empty.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     *  <p>If set to <code>true</code> the update action applies to the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedStandalonePrice" rel="nofollow">StagedStandalonePrice</a>. If set to <code>false</code>, the update action applies to the current <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
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
     * factory method to create a shallow copy StandalonePriceChangeValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceChangeValueAction of(final StandalonePriceChangeValueAction template) {
        StandalonePriceChangeValueActionImpl instance = new StandalonePriceChangeValueActionImpl();
        instance.setValue(template.getValue());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public StandalonePriceChangeValueAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceChangeValueAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceChangeValueAction deepCopy(@Nullable final StandalonePriceChangeValueAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceChangeValueActionImpl instance = new StandalonePriceChangeValueActionImpl();
        instance.setValue(com.commercetools.api.models.common.Money.deepCopy(template.getValue()));
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
