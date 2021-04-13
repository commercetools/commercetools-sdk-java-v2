
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.SyncInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = UpdateSyncInfoChangeImpl.class)
public interface UpdateSyncInfoChange extends Change {

    String UPDATE_SYNC_INFO_CHANGE = "UpdateSyncInfoChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>updateSyncInfo</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("channelId")
    public String getChannelId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public SyncInfo getNextValue();

    public void setChange(final String change);

    public void setChannelId(final String channelId);

    public void setNextValue(final SyncInfo nextValue);

    public static UpdateSyncInfoChange of() {
        return new UpdateSyncInfoChangeImpl();
    }

    public static UpdateSyncInfoChange of(final UpdateSyncInfoChange template) {
        UpdateSyncInfoChangeImpl instance = new UpdateSyncInfoChangeImpl();
        instance.setChange(template.getChange());
        instance.setChannelId(template.getChannelId());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static UpdateSyncInfoChangeBuilder builder() {
        return UpdateSyncInfoChangeBuilder.of();
    }

    public static UpdateSyncInfoChangeBuilder builder(final UpdateSyncInfoChange template) {
        return UpdateSyncInfoChangeBuilder.of(template);
    }

    default <T> T withUpdateSyncInfoChange(Function<UpdateSyncInfoChange, T> helper) {
        return helper.apply(this);
    }
}
