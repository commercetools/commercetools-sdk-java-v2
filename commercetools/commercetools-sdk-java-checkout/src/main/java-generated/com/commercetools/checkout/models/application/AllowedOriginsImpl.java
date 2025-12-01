
package com.commercetools.checkout.models.application;

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
 * AllowedOrigins
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AllowedOriginsImpl implements AllowedOrigins, ModelBase {

    private Boolean allowAll;

    private java.util.List<String> origins;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AllowedOriginsImpl(@JsonProperty("allowAll") final Boolean allowAll,
            @JsonProperty("origins") final java.util.List<String> origins) {
        this.allowAll = allowAll;
        this.origins = origins;
    }

    /**
     * create empty instance
     */
    public AllowedOriginsImpl() {
    }

    /**
     *  <p>Indicates whether all the origin URLs are allowed or not.</p>
     */

    public Boolean getAllowAll() {
        return this.allowAll;
    }

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     */

    public java.util.List<String> getOrigins() {
        return this.origins;
    }

    public void setAllowAll(final Boolean allowAll) {
        this.allowAll = allowAll;
    }

    public void setOrigins(final String... origins) {
        this.origins = new ArrayList<>(Arrays.asList(origins));
    }

    public void setOrigins(final java.util.List<String> origins) {
        this.origins = origins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AllowedOriginsImpl that = (AllowedOriginsImpl) o;

        return new EqualsBuilder().append(allowAll, that.allowAll)
                .append(origins, that.origins)
                .append(allowAll, that.allowAll)
                .append(origins, that.origins)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(allowAll).append(origins).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("allowAll", allowAll)
                .append("origins", origins)
                .build();
    }

    @Override
    public AllowedOrigins copyDeep() {
        return AllowedOrigins.deepCopy(this);
    }
}
