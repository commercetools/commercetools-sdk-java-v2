
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Add Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPriceChange addPriceChange = AddPriceChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddPriceChange")
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
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Price getNextValue();

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *  <p><code>id</code> of the Embedded Price.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Price nextValue);

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     *  <p><code>id</code> of the Embedded Price.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

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
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        return instance;
    }

    public AddPriceChange copyDeep();

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
        instance.setNextValue(com.commercetools.history.models.common.Price.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
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
