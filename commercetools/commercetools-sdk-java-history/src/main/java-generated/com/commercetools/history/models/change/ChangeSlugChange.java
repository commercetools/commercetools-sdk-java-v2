
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change Slug on Categories.</li>
 *   <li>Change Slug on Products.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeSlugChange changeSlugChange = ChangeSlugChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeSlugChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeSlugChangeImpl.class)
public interface ChangeSlugChange extends Change {

    /**
     * discriminator value for ChangeSlugChange
     */
    String CHANGE_SLUG_CHANGE = "ChangeSlugChange";

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
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * factory method
     * @return instance of ChangeSlugChange
     */
    public static ChangeSlugChange of() {
        return new ChangeSlugChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeSlugChange of(final ChangeSlugChange template) {
        ChangeSlugChangeImpl instance = new ChangeSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeSlugChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeSlugChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeSlugChange deepCopy(@Nullable final ChangeSlugChange template) {
        if (template == null) {
            return null;
        }
        ChangeSlugChangeImpl instance = new ChangeSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeSlugChange
     * @return builder
     */
    public static ChangeSlugChangeBuilder builder() {
        return ChangeSlugChangeBuilder.of();
    }

    /**
     * create builder for ChangeSlugChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeSlugChangeBuilder builder(final ChangeSlugChange template) {
        return ChangeSlugChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeSlugChange(Function<ChangeSlugChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeSlugChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeSlugChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeSlugChange>";
            }
        };
    }
}
