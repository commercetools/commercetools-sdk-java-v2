
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Variant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Change Master Variant update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeMasterVariantChange changeMasterVariantChange = ChangeMasterVariantChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
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
    public Variant getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Variant getNextValue();

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
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Variant previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Variant nextValue);

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
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
        instance.setPreviousValue(
            com.commercetools.history.models.common.Variant.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Variant.deepCopy(template.getNextValue()));
        instance.setCatalogData(template.getCatalogData());
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
