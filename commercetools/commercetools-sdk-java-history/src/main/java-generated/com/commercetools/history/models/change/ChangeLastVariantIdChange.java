
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
 *  <p>This change is initiated by background processes after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductAddVariantAction" rel="nofollow">Add ProductVariant</a> update action is performed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLastVariantIdChange changeLastVariantIdChange = ChangeLastVariantIdChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeLastVariantIdChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLastVariantIdChangeImpl.class)
public interface ChangeLastVariantIdChange extends Change {

    /**
     * discriminator value for ChangeLastVariantIdChange
     */
    String CHANGE_LAST_VARIANT_ID_CHANGE = "ChangeLastVariantIdChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * factory method
     * @return instance of ChangeLastVariantIdChange
     */
    public static ChangeLastVariantIdChange of() {
        return new ChangeLastVariantIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLastVariantIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLastVariantIdChange of(final ChangeLastVariantIdChange template) {
        ChangeLastVariantIdChangeImpl instance = new ChangeLastVariantIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeLastVariantIdChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeLastVariantIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLastVariantIdChange deepCopy(@Nullable final ChangeLastVariantIdChange template) {
        if (template == null) {
            return null;
        }
        ChangeLastVariantIdChangeImpl instance = new ChangeLastVariantIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeLastVariantIdChange
     * @return builder
     */
    public static ChangeLastVariantIdChangeBuilder builder() {
        return ChangeLastVariantIdChangeBuilder.of();
    }

    /**
     * create builder for ChangeLastVariantIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLastVariantIdChangeBuilder builder(final ChangeLastVariantIdChange template) {
        return ChangeLastVariantIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLastVariantIdChange(Function<ChangeLastVariantIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLastVariantIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLastVariantIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLastVariantIdChange>";
            }
        };
    }
}
