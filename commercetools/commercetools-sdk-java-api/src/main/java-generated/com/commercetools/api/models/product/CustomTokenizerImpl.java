
package com.commercetools.api.models.product;

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
 *  <p>Define arbitrary tokens that are used to match the input.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomTokenizerImpl implements CustomTokenizer, ModelBase {

    private String type;

    private java.util.List<String> inputs;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomTokenizerImpl(@JsonProperty("inputs") final java.util.List<String> inputs) {
        this.inputs = inputs;
        this.type = CUSTOM;
    }

    /**
     * create empty instance
     */
    public CustomTokenizerImpl() {
        this.type = CUSTOM;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Contains custom tokens.</p>
     */

    public java.util.List<String> getInputs() {
        return this.inputs;
    }

    public void setInputs(final String... inputs) {
        this.inputs = new ArrayList<>(Arrays.asList(inputs));
    }

    public void setInputs(final java.util.List<String> inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomTokenizerImpl that = (CustomTokenizerImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(inputs, that.inputs)
                .append(type, that.type)
                .append(inputs, that.inputs)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(inputs).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("inputs", inputs)
                .build();
    }

    @Override
    public CustomTokenizer copyDeep() {
        return CustomTokenizer.deepCopy(this);
    }
}
