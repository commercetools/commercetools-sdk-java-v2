
package com.commercetools.history.models.change;

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
 *  <p>Difference between the previous and next version of a resource represented by <code>previousValue</code> (omitted, for example, on creations) and <code>nextValue</code> of the associated change. A Change can also contain extra fields that provide further information.</p>
 *  <p>They are not identical to the actual update actions sent.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeImpl implements Change, ModelBase {

    private String type;

    private String change;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeImpl(@JsonProperty("type") final String type, @JsonProperty("change") final String change) {
        this.type = type;
        this.change = change;
    }

    /**
     * create empty instance
     */
    public ChangeImpl() {
    }

    /**
     *  <p>Unique discriminator value to reliably deserialize the data type.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Type of change on a resource that is similar to the update action it relates to, where possible. It is not a unique identifier for the data structure, for example, the <code>setDescription</code> change can occur with a localized and non-localized representation.</p>
     *  <p>Records can be filtered by this value using the <code>changes</code> query parameter.</p>
     */

    public String getChange() {
        return this.change;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeImpl that = (ChangeImpl) o;

        return new EqualsBuilder().append(type, that.type).append(change, that.change).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).toHashCode();
    }

}
