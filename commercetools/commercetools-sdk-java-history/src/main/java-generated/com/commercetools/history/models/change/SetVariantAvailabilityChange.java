
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ProductVariantAvailability;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVariantAvailabilityChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVariantAvailabilityChange setVariantAvailabilityChange = SetVariantAvailabilityChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>setVariantAvailability</code></p>
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
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ProductVariantAvailability getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ProductVariantAvailability getNextValue();

    /**
     *  <p>Update action for <code>setVariantAvailability</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set catalogData
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * set variant
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final ProductVariantAvailability previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final ProductVariantAvailability nextValue);

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
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

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
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.ProductVariantAvailability::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.ProductVariantAvailability::deepCopy)
                .orElse(null));
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
