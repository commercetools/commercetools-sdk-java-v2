
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SyncInfoImpl.class)
public interface SyncInfo {

    @NotNull
    @Valid
    @JsonProperty("channel")
    public Reference getChannel();

    /**
    *  <p>Can be used to reference an external order instance, file etc.</p>
    */
    @NotNull
    @JsonProperty("externalId")
    public String getExternalId();

    @NotNull
    @JsonProperty("syncedAt")
    public String getSyncedAt();

    public void setChannel(final Reference channel);

    public void setExternalId(final String externalId);

    public void setSyncedAt(final String syncedAt);

    public static SyncInfo of() {
        return new SyncInfoImpl();
    }

    public static SyncInfo of(final SyncInfo template) {
        SyncInfoImpl instance = new SyncInfoImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    public static SyncInfoBuilder builder() {
        return SyncInfoBuilder.of();
    }

    public static SyncInfoBuilder builder(final SyncInfo template) {
        return SyncInfoBuilder.of(template);
    }

    default <T> T withSyncInfo(Function<SyncInfo, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SyncInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SyncInfo>() {
            @Override
            public String toString() {
                return "TypeReference<SyncInfo>";
            }
        };
    }
}
