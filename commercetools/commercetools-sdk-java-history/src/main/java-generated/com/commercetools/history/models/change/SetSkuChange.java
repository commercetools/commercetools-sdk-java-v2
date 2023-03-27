
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSkuChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSkuChange setSkuChange = SetSkuChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>setSku</code></p>
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
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Update action for <code>setSku</code></p>
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

    public void setPreviousValue(final String previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetSkuChange
     */
    public static SetSkuChange of() {
        return new SetSkuChangeImpl();
    }

    /**
     * factory method to copy an instance of SetSkuChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSkuChange of(final SetSkuChange template) {
        SetSkuChangeImpl instance = new SetSkuChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
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
