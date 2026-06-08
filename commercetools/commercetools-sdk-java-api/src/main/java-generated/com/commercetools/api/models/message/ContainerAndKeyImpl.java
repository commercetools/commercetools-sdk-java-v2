
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
 *  <p><code>ContainerAndKey</code> is specific to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomObject" rel="nofollow">Custom Objects</a>. Custom Objects are grouped into containers, which can be used like namespaces. Within a given container, a user-defined key can be used to uniquely identify resources.</p>
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
     *  <p>Namespace to group <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomObject" rel="nofollow">Custom Objects</a>.</p>
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("container", container)
                .build();
    }

    @Override
    public ContainerAndKey copyDeep() {
        return ContainerAndKey.deepCopy(this);
    }
}
