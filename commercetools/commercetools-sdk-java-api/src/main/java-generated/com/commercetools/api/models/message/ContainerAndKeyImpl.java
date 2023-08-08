
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

/**
 *  <p><code>ContainerAndKey</code> is specific to Custom Objects. Custom Objects are grouped into containers, which can be used like namespaces. Within a given container, a user-defined key can be used to uniquely identify resources.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ContainerAndKeyImpl implements ContainerAndKey, ModelBase {

    private String key;

    private String container;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ContainerAndKeyImpl(@JsonProperty("key") final String key, @JsonProperty("container") final String container) {
        this.key = key;
        this.container = container;
    }

    /**
     * create empty instance
     */
    public ContainerAndKeyImpl() {
    }

    /**
     *  <p>User-defined identifier that is unique within the given container.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Namespace to group Custom Objects.</p>
     */

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

        ContainerAndKeyImpl that = (ContainerAndKeyImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(container, that.container)
                .append(key, that.key)
                .append(container, that.container)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(container).toHashCode();
    }

}
