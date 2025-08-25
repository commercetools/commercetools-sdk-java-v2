
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.ProductVariantAvailability;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered automatically when an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> associated with a Product changes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantAvailabilityChange setVariantAvailabilityChange = SetVariantAvailabilityChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetVariantAvailabilityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetVariantAvailabilityChangeImpl.class)
public interface SetVariantAvailabilityChange extends Change {

    /**
     * discriminator value for SetVariantAvailabilityChange
     */
    String SET_VARIANT_AVAILABILITY_CHANGE = "SetVariantAvailabilityChange";

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
    public ProductVariantAvailability getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ProductVariantAvailability getNextValue();

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *  <p><code>sku</code> or <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ProductVariantAvailability previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final ProductVariantAvailability nextValue);

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     *  <p><code>sku</code> or <code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetVariantAvailabilityChange
     */
    public static SetVariantAvailabilityChange of() {
        return new SetVariantAvailabilityChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetVariantAvailabilityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetVariantAvailabilityChange of(final SetVariantAvailabilityChange template) {
        SetVariantAvailabilityChangeImpl instance = new SetVariantAvailabilityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetVariantAvailabilityChange copyDeep();

    /**
     * factory method to create a deep copy of SetVariantAvailabilityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetVariantAvailabilityChange deepCopy(@Nullable final SetVariantAvailabilityChange template) {
        if (template == null) {
            return null;
        }
        SetVariantAvailabilityChangeImpl instance = new SetVariantAvailabilityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.ProductVariantAvailability.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.ProductVariantAvailability.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetVariantAvailabilityChange
     * @return builder
     */
    public static SetVariantAvailabilityChangeBuilder builder() {
        return SetVariantAvailabilityChangeBuilder.of();
    }

    /**
     * create builder for SetVariantAvailabilityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVariantAvailabilityChangeBuilder builder(final SetVariantAvailabilityChange template) {
        return SetVariantAvailabilityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetVariantAvailabilityChange(Function<SetVariantAvailabilityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetVariantAvailabilityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetVariantAvailabilityChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetVariantAvailabilityChange>";
            }
        };
    }
}
