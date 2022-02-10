
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MissingRoleOnChannelErrorImpl implements MissingRoleOnChannelError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    @JsonCreator
    MissingRoleOnChannelErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("missingRole") final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.message = message;
        this.values = values;
        this.channel = channel;
        this.missingRole = missingRole;
        this.code = MISSING_ROLE_ON_CHANNEL;
    }

    public MissingRoleOnChannelErrorImpl() {
        this.code = MISSING_ROLE_ON_CHANNEL;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
    *  <p>Describes the purpose and type of the Channel. A Channel can have one or more roles.</p>
    */
    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole() {
        return this.missingRole;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
    }

    public void setMissingRole(final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.missingRole = missingRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingRoleOnChannelErrorImpl that = (MissingRoleOnChannelErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(channel, that.channel)
                .append(missingRole, that.missingRole)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(channel)
                .append(missingRole)
                .toHashCode();
    }

}
