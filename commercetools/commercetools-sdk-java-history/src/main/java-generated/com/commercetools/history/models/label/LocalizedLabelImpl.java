
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
public class LocalizedLabelImpl implements LocalizedLabel, ModelBase {

    private String type;

    private com.commercetools.history.models.common.LocalizedString value;

    @JsonCreator
    LocalizedLabelImpl(@JsonProperty("value") final com.commercetools.history.models.common.LocalizedString value) {
        this.value = value;
        this.type = LOCALIZED_LABEL;
    }

    public LocalizedLabelImpl() {
        this.type = LOCALIZED_LABEL;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.history.models.common.LocalizedString getValue() {
        return this.value;
    }

    public void setValue(final com.commercetools.history.models.common.LocalizedString value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LocalizedLabelImpl that = (LocalizedLabelImpl) o;

        return new EqualsBuilder().append(type, that.type).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).toHashCode();
    }

}
