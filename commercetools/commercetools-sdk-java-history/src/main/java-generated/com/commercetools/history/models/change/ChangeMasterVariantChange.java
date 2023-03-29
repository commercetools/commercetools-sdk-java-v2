
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Variant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeMasterVariantChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeMasterVariantChange changeMasterVariantChange = ChangeMasterVariantChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeMasterVariantChangeImpl.class)
public interface ChangeMasterVariantChange extends Change {

    /**
     * discriminator value for ChangeMasterVariantChange
     */
    String CHANGE_MASTER_VARIANT_CHANGE = "ChangeMasterVariantChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>changeMasterVariant</code></p>
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
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Variant getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Variant getNextValue();

    /**
     *  <p>Update action for <code>changeMasterVariant</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set catalogData
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Variant previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Variant nextValue);

    /**
     * factory method
     * @return instance of ChangeMasterVariantChange
     */
    public static ChangeMasterVariantChange of() {
        return new ChangeMasterVariantChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeMasterVariantChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeMasterVariantChange of(final ChangeMasterVariantChange template) {
        ChangeMasterVariantChangeImpl instance = new ChangeMasterVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeMasterVariantChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeMasterVariantChange deepCopy(@Nullable final ChangeMasterVariantChange template) {
        if (template == null) {
            return null;
        }
        ChangeMasterVariantChangeImpl instance = new ChangeMasterVariantChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.Variant::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.Variant::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeMasterVariantChange
     * @return builder
     */
    public static ChangeMasterVariantChangeBuilder builder() {
        return ChangeMasterVariantChangeBuilder.of();
    }

    /**
     * create builder for ChangeMasterVariantChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeMasterVariantChangeBuilder builder(final ChangeMasterVariantChange template) {
        return ChangeMasterVariantChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeMasterVariantChange(Function<ChangeMasterVariantChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeMasterVariantChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeMasterVariantChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeMasterVariantChange>";
            }
        };
    }
}
