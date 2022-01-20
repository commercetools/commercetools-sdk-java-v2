
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RemoveParcelFromDeliveryDraftImpl implements RemoveParcelFromDeliveryDraft, ModelBase {

    private String parcelId;

    @JsonCreator
    RemoveParcelFromDeliveryDraftImpl(@JsonProperty("parcelId") final String parcelId) {
        this.parcelId = parcelId;
    }

    public RemoveParcelFromDeliveryDraftImpl() {
    }

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

        return new EqualsBuilder().append(parcelId, that.parcelId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(parcelId).toHashCode();
    }

}
