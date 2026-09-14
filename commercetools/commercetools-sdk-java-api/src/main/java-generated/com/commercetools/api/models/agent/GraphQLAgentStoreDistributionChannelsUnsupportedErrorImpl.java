
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by a <span>/responses</span> request when the resolved <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> has more than one entry in the <code>distributionChannels</code> array, which is not supported. To resolve this error, choose a Store with zero or one distribution channel.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl
        implements GraphQLAgentStoreDistributionChannelsUnsupportedError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.values = values;
        this.code = STORE_DISTRIBUTION_CHANNELS_UNSUPPORTED;
    }

    /**
     * create empty instance
     */
    public GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl() {
        this.code = STORE_DISTRIBUTION_CHANNELS_UNSUPPORTED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl that = (GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(code, that.code)
                .append(values, that.values)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .build();
    }

    @Override
    public GraphQLAgentStoreDistributionChannelsUnsupportedError copyDeep() {
        return GraphQLAgentStoreDistributionChannelsUnsupportedError.deepCopy(this);
    }
}
