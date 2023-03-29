
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Asset;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAssetChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAssetChange removeAssetChange = RemoveAssetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveAssetChangeImpl.class)
public interface RemoveAssetChange extends Change {

    /**
     * discriminator value for RemoveAssetChange
     */
    String REMOVE_ASSET_CHANGE = "RemoveAssetChange";

    /**
     *  <p>Update action for <code>removeAsset</code></p>
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
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Asset getPreviousValue();

    /**
     *  <p>Update action for <code>removeAsset</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Asset previousValue);

    /**
     * factory method
     * @return instance of RemoveAssetChange
     */
    public static RemoveAssetChange of() {
        return new RemoveAssetChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveAssetChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveAssetChange of(final RemoveAssetChange template) {
        RemoveAssetChangeImpl instance = new RemoveAssetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveAssetChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveAssetChange deepCopy(@Nullable final RemoveAssetChange template) {
        if (template == null) {
            return null;
        }
        RemoveAssetChangeImpl instance = new RemoveAssetChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.Asset::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for RemoveAssetChange
     * @return builder
     */
    public static RemoveAssetChangeBuilder builder() {
        return RemoveAssetChangeBuilder.of();
    }

    /**
     * create builder for RemoveAssetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAssetChangeBuilder builder(final RemoveAssetChange template) {
        return RemoveAssetChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveAssetChange(Function<RemoveAssetChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveAssetChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveAssetChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveAssetChange>";
            }
        };
    }
}
