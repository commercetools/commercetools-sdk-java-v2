
package com.commercetools.api.models.subscription;

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
public class CloudEventsFormatImpl implements CloudEventsFormat, ModelBase {

    private String type;

    private String cloudEventsVersion;

    @JsonCreator
    CloudEventsFormatImpl(@JsonProperty("cloudEventsVersion") final String cloudEventsVersion) {
        this.cloudEventsVersion = cloudEventsVersion;
        this.type = CLOUD_EVENTS;
    }

    public CloudEventsFormatImpl() {
        this.type = CLOUD_EVENTS;
    }

    public String getType() {
        return this.type;
    }

    public String getCloudEventsVersion() {
        return this.cloudEventsVersion;
    }

    public void setCloudEventsVersion(final String cloudEventsVersion) {
        this.cloudEventsVersion = cloudEventsVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CloudEventsFormatImpl that = (CloudEventsFormatImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(cloudEventsVersion, that.cloudEventsVersion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(cloudEventsVersion).toHashCode();
    }

}
