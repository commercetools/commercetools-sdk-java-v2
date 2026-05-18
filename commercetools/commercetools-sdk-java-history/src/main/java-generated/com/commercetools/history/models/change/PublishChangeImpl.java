
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Change triggered when:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> <code>published</code> transitions from <code>false</code> to <code>true</code>.</li>
 *   <li>Any update action updates the current catalog (using <code>staged=false</code>) and the resulting Product is in a published state.</li>
 *  </ul>
 *  <p>For better traceability of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> update action, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishedMessage" rel="nofollow">ProductPublished</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PublishChangeImpl implements PublishChange, ModelBase {

    private String type;

    private String change;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PublishChangeImpl(@JsonProperty("change") final String change) {
        this.change = change;
        this.type = PUBLISH_CHANGE;
    }

    /**
     * create empty instance
     */
    public PublishChangeImpl() {
        this.type = PUBLISH_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
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

        PublishChangeImpl that = (PublishChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(type, that.type)
                .append(change, that.change)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .build();
    }

    @Override
    public PublishChange copyDeep() {
        return PublishChange.deepCopy(this);
    }
}
