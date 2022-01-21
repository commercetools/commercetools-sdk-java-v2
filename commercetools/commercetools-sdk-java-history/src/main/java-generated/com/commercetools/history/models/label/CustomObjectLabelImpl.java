
package com.commercetools.history.models.label;

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
public class CustomObjectLabelImpl implements CustomObjectLabel, ModelBase {

    private String type;

    private String key;

    private String container;

    @JsonCreator
    CustomObjectLabelImpl(@JsonProperty("key") final String key, @JsonProperty("container") final String container) {
        this.key = key;
        this.container = container;
        this.type = CUSTOM_OBJECT_LABEL;
    }

    public CustomObjectLabelImpl() {
        this.type = CUSTOM_OBJECT_LABEL;
    }

    public String getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }

    public String getContainer() {
        return this.container;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setContainer(final String container) {
        this.container = container;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomObjectLabelImpl that = (CustomObjectLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(container, that.container)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(container).toHashCode();
    }

}
