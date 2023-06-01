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
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreRemoveDistributionChannelActionImpl implements StoreRemoveDistributionChannelAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreRemoveDistributionChannelActionImpl(@JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        this.action =  REMOVE_DISTRIBUTION_CHANNEL;
    }
    /**
     * create empty instance
     */
    public StoreRemoveDistributionChannelActionImpl() {
        this.action =  REMOVE_DISTRIBUTION_CHANNEL;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    
    public void setDistributionChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel){
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StoreRemoveDistributionChannelActionImpl that = (StoreRemoveDistributionChannelActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(distributionChannel)
            .toHashCode();
    }

}
