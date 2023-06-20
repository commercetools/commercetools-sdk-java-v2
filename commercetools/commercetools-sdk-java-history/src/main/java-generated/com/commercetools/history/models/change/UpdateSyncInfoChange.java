
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.SyncInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Update SyncInfo on Orders.</li>
 *   <li>Update SyncInfo on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateSyncInfoChange updateSyncInfoChange = UpdateSyncInfoChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .channelId("{channelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UpdateSyncInfoChangeImpl.class)
public interface UpdateSyncInfoChange extends Change {

    /**
     * discriminator value for UpdateSyncInfoChange
     */
    String UPDATE_SYNC_INFO_CHANGE = "UpdateSyncInfoChange";

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
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public SyncInfo getNextValue();

    /**
     *  <p><code>id</code> of the updated Channel.</p>
     * @return channelId
     */
    @NotNull
    @JsonProperty("channelId")
    public String getChannelId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final SyncInfo nextValue);

    /**
     *  <p><code>id</code> of the updated Channel.</p>
     * @param channelId value to be set
     */

    public void setChannelId(final String channelId);

    /**
     * factory method
     * @return instance of UpdateSyncInfoChange
     */
    public static UpdateSyncInfoChange of() {
        return new UpdateSyncInfoChangeImpl();
    }

    /**
     * factory method to create a shallow copy UpdateSyncInfoChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static UpdateSyncInfoChange of(final UpdateSyncInfoChange template) {
        UpdateSyncInfoChangeImpl instance = new UpdateSyncInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setChannelId(template.getChannelId());
        return instance;
    }

    /**
     * factory method to create a deep copy of UpdateSyncInfoChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UpdateSyncInfoChange deepCopy(@Nullable final UpdateSyncInfoChange template) {
        if (template == null) {
            return null;
        }
        UpdateSyncInfoChangeImpl instance = new UpdateSyncInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(com.commercetools.history.models.common.SyncInfo.deepCopy(template.getNextValue()));
        instance.setChannelId(template.getChannelId());
        return instance;
    }

    /**
     * builder factory method for UpdateSyncInfoChange
     * @return builder
     */
    public static UpdateSyncInfoChangeBuilder builder() {
        return UpdateSyncInfoChangeBuilder.of();
    }

    /**
     * create builder for UpdateSyncInfoChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateSyncInfoChangeBuilder builder(final UpdateSyncInfoChange template) {
        return UpdateSyncInfoChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUpdateSyncInfoChange(Function<UpdateSyncInfoChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UpdateSyncInfoChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UpdateSyncInfoChange>() {
            @Override
            public String toString() {
                return "TypeReference<UpdateSyncInfoChange>";
            }
        };
    }
}
