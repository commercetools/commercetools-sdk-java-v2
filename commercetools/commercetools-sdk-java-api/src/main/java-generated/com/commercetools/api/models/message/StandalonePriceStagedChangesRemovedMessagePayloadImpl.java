
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceStagedChangesRemovedMessagePayloadImpl
        implements StandalonePriceStagedChangesRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceStagedChangesRemovedMessagePayloadImpl(
            @JsonProperty("stagedChanges") final com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges) {
        this.stagedChanges = stagedChanges;
        this.type = STANDALONE_PRICE_STAGED_CHANGES_REMOVED;
    }

    /**
     * create empty instance
     */
    public StandalonePriceStagedChangesRemovedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_STAGED_CHANGES_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Removed changes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
     */

    public com.commercetools.api.models.standalone_price.StagedStandalonePrice getStagedChanges() {
        return this.stagedChanges;
    }

    public void setStagedChanges(
            final com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges) {
        this.stagedChanges = stagedChanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceStagedChangesRemovedMessagePayloadImpl that = (StandalonePriceStagedChangesRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(stagedChanges, that.stagedChanges)
                .append(type, that.type)
                .append(stagedChanges, that.stagedChanges)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(stagedChanges).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("stagedChanges", stagedChanges)
                .build();
    }

    @Override
    public StandalonePriceStagedChangesRemovedMessagePayload copyDeep() {
        return StandalonePriceStagedChangesRemovedMessagePayload.deepCopy(this);
    }
}
