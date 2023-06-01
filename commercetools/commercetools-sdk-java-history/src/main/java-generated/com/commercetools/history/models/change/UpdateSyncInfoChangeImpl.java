package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.SyncInfo;
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
 * UpdateSyncInfoChange
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class UpdateSyncInfoChangeImpl implements UpdateSyncInfoChange, ModelBase {

    
    private String type;
    
    
    private String change;
    
    
    private String channelId;
    
    
    private com.commercetools.history.models.common.SyncInfo nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    UpdateSyncInfoChangeImpl(@JsonProperty("change") final String change, @JsonProperty("channelId") final String channelId, @JsonProperty("nextValue") final com.commercetools.history.models.common.SyncInfo nextValue) {
        this.change = change;
        this.channelId = channelId;
        this.nextValue = nextValue;
        this.type =  UPDATE_SYNC_INFO_CHANGE;
    }
    /**
     * create empty instance
     */
    public UpdateSyncInfoChangeImpl() {
        this.type =  UPDATE_SYNC_INFO_CHANGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Update action for <code>updateSyncInfo</code></p>
     */
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *
     */
    
    public String getChannelId(){
        return this.channelId;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.SyncInfo getNextValue(){
        return this.nextValue;
    }

    
    public void setChange(final String change){
        this.change = change;
    }
    
    
    public void setChannelId(final String channelId){
        this.channelId = channelId;
    }
    
    
    public void setNextValue(final com.commercetools.history.models.common.SyncInfo nextValue){
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        UpdateSyncInfoChangeImpl that = (UpdateSyncInfoChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .append(channelId, that.channelId)
                .append(nextValue, that.nextValue)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .append(channelId)
            .append(nextValue)
            .toHashCode();
    }

}
