
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Update SyncInfo on Orders.</li>
 *   <li>Update SyncInfo on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UpdateSyncInfoChangeImpl implements UpdateSyncInfoChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.SyncInfo nextValue;

    private String channelId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    UpdateSyncInfoChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.SyncInfo nextValue,
            @JsonProperty("channelId") final String channelId) {
        this.change = change;
        this.nextValue = nextValue;
        this.channelId = channelId;
        this.type = UPDATE_SYNC_INFO_CHANGE;
    }

    /**
     * create empty instance
     */
    public UpdateSyncInfoChangeImpl() {
        this.type = UPDATE_SYNC_INFO_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.SyncInfo getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the updated Channel.</p>
     */

    public String getChannelId() {
        return this.channelId;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.SyncInfo nextValue) {
        this.nextValue = nextValue;
    }

    public void setChannelId(final String channelId) {
        this.channelId = channelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        UpdateSyncInfoChangeImpl that = (UpdateSyncInfoChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(channelId, that.channelId)
                .append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(channelId, that.channelId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(nextValue).append(channelId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("nextValue", nextValue)
                .append("channelId", channelId)
                .build();
    }

    @Override
    public UpdateSyncInfoChange copyDeep() {
        return UpdateSyncInfoChange.deepCopy(this);
    }
}
