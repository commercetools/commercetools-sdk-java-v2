
package com.commercetools.api.models.shipping_method;

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
public class ShippingMethodSetLocalizedNameActionImpl implements ShippingMethodSetLocalizedNameAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString localizedName;

    @JsonCreator
    ShippingMethodSetLocalizedNameActionImpl(
            @JsonProperty("localizedName") final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
        this.action = SET_LOCALIZED_NAME;
    }

    public ShippingMethodSetLocalizedNameActionImpl() {
        this.action = SET_LOCALIZED_NAME;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getLocalizedName() {
        return this.localizedName;
    }

    public void setLocalizedName(final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodSetLocalizedNameActionImpl that = (ShippingMethodSetLocalizedNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(localizedName, that.localizedName).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(localizedName).toHashCode();
    }

}
