
package com.commercetools.api.models.customer;

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
public class CustomerCreateEmailTokenImpl implements CustomerCreateEmailToken, ModelBase {

    private String id;

    private Long version;

    private Long ttlMinutes;

    @JsonCreator
    CustomerCreateEmailTokenImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("ttlMinutes") final Long ttlMinutes) {
        this.id = id;
        this.version = version;
        this.ttlMinutes = ttlMinutes;
    }

    public CustomerCreateEmailTokenImpl() {
    }

    /**
    *  <p>Platform-generated unique identifier of the email token.</p>
    */
    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public Long getTtlMinutes() {
        return this.ttlMinutes;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setTtlMinutes(final Long ttlMinutes) {
        this.ttlMinutes = ttlMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerCreateEmailTokenImpl that = (CustomerCreateEmailTokenImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(ttlMinutes, that.ttlMinutes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(version).append(ttlMinutes).toHashCode();
    }

}
