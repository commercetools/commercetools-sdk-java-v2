
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductVariantKeyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductVariantKeyChange setProductVariantKeyChange = SetProductVariantKeyChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetProductVariantKeyChangeImpl.class)
public interface SetProductVariantKeyChange extends Change {

    /**
     * discriminator value for SetProductVariantKeyChange
     */
    String SET_PRODUCT_VARIANT_KEY_CHANGE = "SetProductVariantKeyChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setProductVariantKey</code></p>
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
     *  <p>Update action for <code>setProductVariantKey</code></p>
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
     * @return instance of SetProductVariantKeyChange
     */
    public static SetProductVariantKeyChange of() {
        return new SetProductVariantKeyChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetProductVariantKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetProductVariantKeyChange of(final SetProductVariantKeyChange template) {
        SetProductVariantKeyChangeImpl instance = new SetProductVariantKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetProductVariantKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetProductVariantKeyChange deepCopy(@Nullable final SetProductVariantKeyChange template) {
        if (template == null) {
            return null;
        }
        SetProductVariantKeyChangeImpl instance = new SetProductVariantKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setCatalogData(template.getCatalogData());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetProductVariantKeyChange
     * @return builder
     */
    public static SetProductVariantKeyChangeBuilder builder() {
        return SetProductVariantKeyChangeBuilder.of();
    }

    /**
     * create builder for SetProductVariantKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductVariantKeyChangeBuilder builder(final SetProductVariantKeyChange template) {
        return SetProductVariantKeyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetProductVariantKeyChange(Function<SetProductVariantKeyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetProductVariantKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetProductVariantKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetProductVariantKeyChange>";
            }
        };
    }
}
