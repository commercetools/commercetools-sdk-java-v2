package com.commercetools.api.models.order;

import com.commercetools.api.models.channel.ChannelReference;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * SyncInfo
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SyncInfoImpl implements SyncInfo, ModelBase {

    
    private com.commercetools.api.models.channel.ChannelReference channel;
    
    
    private String externalId;
    
    
    private java.time.ZonedDateTime syncedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SyncInfoImpl(@JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel, @JsonProperty("externalId") final String externalId, @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
        this.channel = channel;
        this.externalId = externalId;
        this.syncedAt = syncedAt;
    }
    /**
     * create empty instance
     */
    public SyncInfoImpl() {
    }

    /**
     *  <p>Connection to a particular synchronization destination.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelReference getChannel(){
        return this.channel;
    }
    
    /**
     *  <p>Can be used to reference an external order instance, file etc.</p>
     */
    
    public String getExternalId(){
        return this.externalId;
    }
    
    /**
     *
     */
    
    public java.time.ZonedDateTime getSyncedAt(){
        return this.syncedAt;
    }

    
    public void setChannel(final com.commercetools.api.models.channel.ChannelReference channel){
        this.channel = channel;
    }
    
    
    public void setExternalId(final String externalId){
        this.externalId = externalId;
    }
    
    
    public void setSyncedAt(final java.time.ZonedDateTime syncedAt){
        this.syncedAt = syncedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SyncInfoImpl that = (SyncInfoImpl) o;
    
        return new EqualsBuilder()
                .append(channel, that.channel)
                .append(externalId, that.externalId)
                .append(syncedAt, that.syncedAt)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(channel)
            .append(externalId)
            .append(syncedAt)
            .toHashCode();
    }

}
