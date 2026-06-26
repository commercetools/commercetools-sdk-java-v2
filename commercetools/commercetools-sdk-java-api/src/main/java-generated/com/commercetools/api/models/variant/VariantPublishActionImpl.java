
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Publishes the Variant by copying the staged data to the current data and setting the <code>published</code> flag to <code>true</code>. Staged will be empty. The parent Product must be published before a Variant can be published. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishedMessage" rel="nofollow">VariantPublished</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantPublishActionImpl implements VariantPublishAction, ModelBase {

    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public VariantPublishActionImpl() {
        this.action = PUBLISH;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantPublishActionImpl that = (VariantPublishActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(action, that.action).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action).build();
    }

    @Override
    public VariantPublishAction copyDeep() {
        return VariantPublishAction.deepCopy(this);
    }
}
