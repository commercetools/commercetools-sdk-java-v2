
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the Set SKU update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSkuChange setSkuChange = SetSkuChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetSkuChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetSkuChangeImpl.class)
public interface SetSkuChange extends Change {

    /**
     * discriminator value for SetSkuChange
     */
    String SET_SKU_CHANGE = "SetSkuChange";

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
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

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

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

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
     * @return instance of SetSkuChange
     */
    public static SetSkuChange of() {
        return new SetSkuChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetSkuChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSkuChange of(final SetSkuChange template) {
        SetSkuChangeImpl instance = new SetSkuChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        return instance;
    }

    public SetSkuChange copyDeep();

    /**
     * factory method to create a deep copy of SetSkuChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetSkuChange deepCopy(@Nullable final SetSkuChange template) {
        if (template == null) {
            return null;
        }
        SetSkuChangeImpl instance = new SetSkuChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setCatalogData(template.getCatalogData());
        return instance;
    }

    /**
     * builder factory method for SetSkuChange
     * @return builder
     */
    public static SetSkuChangeBuilder builder() {
        return SetSkuChangeBuilder.of();
    }

    /**
     * create builder for SetSkuChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSkuChangeBuilder builder(final SetSkuChange template) {
        return SetSkuChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSkuChange(Function<SetSkuChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSkuChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSkuChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSkuChange>";
            }
        };
    }
}
