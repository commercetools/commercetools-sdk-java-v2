
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPriceChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPriceChange addPriceChange = AddPriceChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddPriceChangeImpl.class)
public interface AddPriceChange extends Change {

    /**
     * discriminator value for AddPriceChange
     */
    String ADD_PRICE_CHANGE = "AddPriceChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for adding prices</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    /**
     *  <p>Update action for adding prices</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set catalogData
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * set priceId
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Price nextValue);

    /**
     * factory method
     * @return instance of AddPriceChange
     */
    public static AddPriceChange of() {
        return new AddPriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddPriceChange of(final AddPriceChange template) {
        AddPriceChangeImpl instance = new AddPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddPriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddPriceChange deepCopy(@Nullable final AddPriceChange template) {
        if (template == null) {
            return null;
        }
        AddPriceChangeImpl instance = new AddPriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.Price::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AddPriceChange
     * @return builder
     */
    public static AddPriceChangeBuilder builder() {
        return AddPriceChangeBuilder.of();
    }

    /**
     * create builder for AddPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPriceChangeBuilder builder(final AddPriceChange template) {
        return AddPriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddPriceChange(Function<AddPriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddPriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddPriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddPriceChange>";
            }
        };
    }
}
