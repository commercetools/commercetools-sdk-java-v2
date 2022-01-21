
package com.commercetools.api.models.order;

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
public class HitImpl implements Hit, ModelBase {

    private String id;

    private Long version;

    private Double relevance;

    @JsonCreator
    HitImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("relevance") final Double relevance) {
        this.id = id;
        this.version = version;
        this.relevance = relevance;
    }

    public HitImpl() {
    }

    /**
    *  <p>Unique ID of the Order.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>Current version of the Order.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>The higher the value is, the more relevant the hit is for the search request.</p>
    */
    public Double getRelevance() {
        return this.relevance;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setRelevance(final Double relevance) {
        this.relevance = relevance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        HitImpl that = (HitImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(relevance, that.relevance)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(version).append(relevance).toHashCode();
    }

}
