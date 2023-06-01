package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
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
 *  <p>This update action produces the StoreDistributionChannelsChanged Message.</p>
 *  <p>Setting a Channel without the <code>ProductDistribution</code> ChannelRoleEnum returns a MissingRoleOnChannel error.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreSetDistributionChannelsActionImpl implements StoreSetDistributionChannelsAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSetDistributionChannelsActionImpl(@JsonProperty("distributionChannels") final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        this.action =  SET_DISTRIBUTION_CHANNELS;
    }
    /**
     * create empty instance
     */
    public StoreSetDistributionChannelsActionImpl() {
        this.action =  SET_DISTRIBUTION_CHANNELS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     */
    
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels(){
        return this.distributionChannels;
    }

    
    public void setDistributionChannels(final com.commercetools.api.models.channel.ChannelResourceIdentifier ...distributionChannels){
       this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
    }
    
    
    public void setDistributionChannels(final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels){
       this.distributionChannels = distributionChannels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StoreSetDistributionChannelsActionImpl that = (StoreSetDistributionChannelsActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(distributionChannels, that.distributionChannels)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(distributionChannels)
            .toHashCode();
    }

}
