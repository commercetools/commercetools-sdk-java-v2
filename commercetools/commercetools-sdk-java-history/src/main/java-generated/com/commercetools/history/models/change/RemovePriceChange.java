
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
 *  <p>Change triggered by the Remove Embedded Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemovePriceChange removePriceChange = RemovePriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RemovePriceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemovePriceChangeImpl.class)
public interface RemovePriceChange extends Change {

    /**
     * discriminator value for RemovePriceChange
     */
    String REMOVE_PRICE_CHANGE = "RemovePriceChange";

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
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Price getPreviousValue();

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
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Price previousValue);

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
     * @return instance of RemovePriceChange
     */
    public static RemovePriceChange of() {
        return new RemovePriceChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemovePriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemovePriceChange of(final RemovePriceChange template) {
        RemovePriceChangeImpl instance = new RemovePriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        return instance;
    }

    public RemovePriceChange copyDeep();

    /**
     * factory method to create a deep copy of RemovePriceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemovePriceChange deepCopy(@Nullable final RemovePriceChange template) {
        if (template == null) {
            return null;
        }
        RemovePriceChangeImpl instance = new RemovePriceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(com.commercetools.history.models.common.Price.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Price.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
        instance.setPriceId(template.getPriceId());
        return instance;
    }

    /**
     * builder factory method for RemovePriceChange
     * @return builder
     */
    public static RemovePriceChangeBuilder builder() {
        return RemovePriceChangeBuilder.of();
    }

    /**
     * create builder for RemovePriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemovePriceChangeBuilder builder(final RemovePriceChange template) {
        return RemovePriceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemovePriceChange(Function<RemovePriceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemovePriceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemovePriceChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemovePriceChange>";
            }
        };
    }
}
