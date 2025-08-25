
package com.commercetools.importapi.models.order_patches;

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
 * RemoveParcelFromDeliveryDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveParcelFromDeliveryDraftImpl implements RemoveParcelFromDeliveryDraft, ModelBase {

    private String parcelId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveParcelFromDeliveryDraftImpl(@JsonProperty("parcelId") final String parcelId) {
        this.parcelId = parcelId;
    }

    /**
     * create empty instance
     */
    public RemoveParcelFromDeliveryDraftImpl() {
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a> to be removed from the Delivery.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveParcelFromDeliveryDraftImpl that = (RemoveParcelFromDeliveryDraftImpl) o;

        return new EqualsBuilder().append(parcelId, that.parcelId).append(parcelId, that.parcelId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(parcelId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("parcelId", parcelId).build();
    }

    @Override
    public RemoveParcelFromDeliveryDraft copyDeep() {
        return RemoveParcelFromDeliveryDraft.deepCopy(this);
    }
}
