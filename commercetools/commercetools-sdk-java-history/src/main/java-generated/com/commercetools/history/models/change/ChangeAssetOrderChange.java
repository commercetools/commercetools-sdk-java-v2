
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeAssetOrderAction" rel="nofollow">Change Asset Order</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductChangeAssetOrderAction" rel="nofollow">Change Asset Order</a> on Products.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssetOrderChange changeAssetOrderChange = ChangeAssetOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeAssetOrderChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAssetOrderChangeImpl.class)
public interface ChangeAssetOrderChange extends Change {

    /**
     * discriminator value for ChangeAssetOrderChange
     */
    String CHANGE_ASSET_ORDER_CHANGE = "ChangeAssetOrderChange";

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
    public List<LocalizedString> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<LocalizedString> getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final LocalizedString... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<LocalizedString> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final LocalizedString... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<LocalizedString> nextValue);

    /**
     * factory method
     * @return instance of ChangeAssetOrderChange
     */
    public static ChangeAssetOrderChange of() {
        return new ChangeAssetOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeAssetOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAssetOrderChange of(final ChangeAssetOrderChange template) {
        ChangeAssetOrderChangeImpl instance = new ChangeAssetOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ChangeAssetOrderChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeAssetOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAssetOrderChange deepCopy(@Nullable final ChangeAssetOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeAssetOrderChangeImpl instance = new ChangeAssetOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.LocalizedString::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangeAssetOrderChange
     * @return builder
     */
    public static ChangeAssetOrderChangeBuilder builder() {
        return ChangeAssetOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangeAssetOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssetOrderChangeBuilder builder(final ChangeAssetOrderChange template) {
        return ChangeAssetOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAssetOrderChange(Function<ChangeAssetOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAssetOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAssetOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAssetOrderChange>";
            }
        };
    }
}
